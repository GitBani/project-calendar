package dev.banisomo.projectcalendar.repository;

import dev.banisomo.projectcalendar.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProjectRepository")
public interface ProjectCollectionRepository extends JpaRepository<Project, Long> {

}
