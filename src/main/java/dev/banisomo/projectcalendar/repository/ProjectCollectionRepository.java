package dev.banisomo.projectcalendar.repository;

import dev.banisomo.projectcalendar.model.Project;
import dev.banisomo.projectcalendar.model.Status;
import dev.banisomo.projectcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProjectCollectionRepository {

    private final List<Project> projectList = new ArrayList<>();

    public ProjectCollectionRepository() {
    }

    public List<Project> findAll() {
        return projectList;
    }

    public Optional<Project> findById(Integer id) {
        return projectList.stream().filter(p -> p.id().equals(id)).findFirst();
    }

    public void save(Project project) {
        projectList.removeIf(p -> p.id().equals(project.id()));
        projectList.add(project);
    }

    public boolean existsById(Integer id) {
        return projectList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void delete(Integer id) {
        projectList.removeIf(p -> p.id().equals(id));
    }

    @PostConstruct
    private void init() {
        Project project = new Project(1,
                "My first blog post",
                "My first blog post",
                Status.IDEA,
                Type.BLOG,
                LocalDateTime.now(),
                null,
                "");

        projectList.add(project);
    }
}
