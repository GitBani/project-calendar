package dev.banisomo.projectcalendar.controller;

import dev.banisomo.projectcalendar.repository.ProjectCollectionRepository;
import dev.banisomo.projectcalendar.model.Project;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    private final ProjectCollectionRepository repository;

    public ProjectController(ProjectCollectionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<Project> findAll() {
        return repository.findAll();
    }

    // Create Read Update Delete - filter | paging and sorting

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@RequestBody Project project) {
        repository.save(project);
    }

    @GetMapping("/{id}")
    public Project findById(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Project not found"));
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Project project, @PathVariable Integer id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Project not found");
        }
        repository.save(project);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }
}
