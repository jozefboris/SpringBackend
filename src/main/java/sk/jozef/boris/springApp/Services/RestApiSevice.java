package sk.jozef.boris.springApp.Services;

import sk.jozef.boris.springApp.model.Employee;
import sk.jozef.boris.springApp.model.Todo;
import sk.jozef.boris.springApp.model.TodoList;

import java.util.List;

public interface RestApiSevice {
    Employee getEmployee(Long id);
    Todo getTodo(Long id);
    List<Todo> getTodos();
    TodoList getTodosList();
}
