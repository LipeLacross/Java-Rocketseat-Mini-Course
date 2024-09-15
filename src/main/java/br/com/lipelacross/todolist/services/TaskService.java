package br.com.lipelacross.todolist.services;

import br.com.lipelacross.todolist.models.TaskModel;
import br.com.lipelacross.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public TaskModel create(TaskModel newTask) {
        return taskRepository.save(newTask);
    }

    public Optional<TaskModel> get(UUID task_id) {
        return taskRepository.findById(task_id);
    }

    public List<TaskModel> listUserTasks(UUID user_id) {
        return taskRepository.findByUserId(user_id);
    }

    public TaskModel edit(TaskModel taskModel, UUID task_id) throws Exception {
        Optional<TaskModel> model = get(task_id);

        if (model.isEmpty()) {
            return null;
        }

        String description = taskModel.getDescription();
        String title = taskModel.getTitle();

        TaskModel taskEdited = model.get();

        if (description != null && !description.isEmpty()) {
            taskEdited.setDescription(description);
        }

        if (title != null && !title.isEmpty()) {
            taskEdited.setTitle(title);
        }

        taskEdited.setEnd_at(taskModel.getEnd_at());
        taskEdited.setStart_at(taskModel.getStart_at());
        taskEdited.setPriority(taskModel.getPriority());

        return taskRepository.save(taskEdited);
    }
}
