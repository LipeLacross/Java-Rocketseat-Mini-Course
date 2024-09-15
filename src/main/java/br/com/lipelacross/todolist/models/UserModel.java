package br.com.lipelacross.todolist.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data // Adiciona os getters e setters automaticamente
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    /*
     Ele define que o objeto precisa ter um username único
     A coluna username, precisa ter um nome único
    */
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createAt;
}
