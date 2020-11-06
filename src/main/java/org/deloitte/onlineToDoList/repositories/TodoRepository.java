package org.deloitte.onlineToDoList.repositories;

import org.deloitte.onlineToDoList.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
