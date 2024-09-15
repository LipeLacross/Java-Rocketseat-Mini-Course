package br.com.lipelacross.todolist.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(length = 50)
    private String title;
    private String description;
    private LocalDateTime start_at;
    private LocalDateTime end_at;
    private String priority;

    private UUID userId;

    @CreationTimestamp
    private LocalDateTime created_at;

    public void setTitle(String title) throws Exception {
        if (title.length() > 50) {
            throw new Exception("The title length is more than 50 chars.");
        }
        this.title = title;
    }
}
