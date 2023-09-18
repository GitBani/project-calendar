package dev.banisomo.projectcalendar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Project {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        String title;
        String desc;
        Status status;
        Type type;
        LocalDateTime dateCreated;
        LocalDateTime dateUpdated;
        String url;
}
