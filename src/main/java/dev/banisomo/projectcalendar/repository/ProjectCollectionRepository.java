package dev.banisomo.projectcalendar.repository;

import dev.banisomo.projectcalendar.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("ProjectRepository")
public interface ProjectCollectionRepository extends CrudRepository<Project, String> {

}
