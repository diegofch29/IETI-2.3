package eci.ieti.data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import eci.ieti.data.model.Task;

public interface TaskRepository extends CrudRepository<Task, Long>{

    Page<Task> findByResponsible (String responsible, Pageable pageable);
}

