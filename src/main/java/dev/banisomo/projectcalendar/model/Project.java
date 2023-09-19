package dev.banisomo.projectcalendar.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Project {

        @Id
        String id;

        String title;
        String desc;
        Status status;
        Type type;
        LocalDateTime dateCreated;
        LocalDateTime dateUpdated;
        String url;
}
