package br.com.lipelacross.todolist.controller;

import br.com.lipelacross.todolist.models.TaskModel;
import br.com.lipelacross.todolist.services.TaskService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping()
    public ResponseEntity create(@RequestBody TaskModel newTask, HttpServletRequest req) {
        UUID user_id = (UUID) req.getAttribute("user_id");
        newTask.setUserId(user_id);

        LocalDateTime currentDate = LocalDateTime.now();

        if (currentDate.isAfter(newTask.getStart_at()) || currentDate.isAfter(newTask.getEnd_at())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("The task cannot start before now.");
        }

        if (newTask.getEnd_at().isBefore(newTask.getStart_at())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("The end time task cannot start before the start.");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(taskService.create(newTask));
    }

    @GetMapping
    public List<TaskModel> list(HttpServletRequest request) {
        return taskService.listUserTasks((UUID) request.getAttribute("user_id"));
    }

    @PutMapping("/{task_id}")
    public ResponseEntity edit(@RequestBody TaskModel taskModel, @PathVariable UUID task_id, HttpServletRequest request) throws Exception {

        TaskModel task = taskService.get(task_id).orElse(null);

        if (task == null) {
            return ResponseEntity.status(404).build();
        }

        UUID userAuthID = (UUID) request.getAttribute("user_id");

        if (!task.getUserId().equals(userAuthID)) {
            return ResponseEntity.status(401).build();
        }

        TaskModel taskEdited = taskService.edit(taskModel, task_id);

        if (taskEdited != null) {
            return ResponseEntity.status(200).body(taskEdited);
        }

        return ResponseEntity.status(400).build();
    }
}
