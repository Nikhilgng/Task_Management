package project.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.taskmanager.model.Task;
import project.taskmanager.model.User;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository< Task, Long> {

    List<Task> findByOwnerOrderByDateDesc(User user);
}