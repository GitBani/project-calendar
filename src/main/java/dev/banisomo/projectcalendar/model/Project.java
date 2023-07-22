package dev.banisomo.projectcalendar.model;

import java.time.LocalDateTime;

public record Project(
        Integer id,
        String title,
        String desc,
        Status status,
        Type type,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
