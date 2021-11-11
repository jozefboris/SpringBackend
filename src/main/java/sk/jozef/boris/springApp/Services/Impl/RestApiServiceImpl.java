package sk.jozef.boris.springApp.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sk.jozef.boris.springApp.Services.RestApiSevice;
import sk.jozef.boris.springApp.model.Employee;
import sk.jozef.boris.springApp.model.Todo;
import sk.jozef.boris.springApp.model.TodoList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RestApiServiceImpl implements RestApiSevice {
    RestTemplate restTemplate;

 /*   @Autowired
    public RestApiServiceImpl(RestTemplateBuilder builder){
        this.restTemplate = builder.build();
    }*/

    public RestApiServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public Employee getEmployee(Long id) {
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
       converter.setSupportedMediaTypes(Arrays.asList(MediaType.ALL));
        messageConverters.add(converter);
        restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(messageConverters);
        Employee employee = restTemplate.getForObject("http://dummy.restapiexample.com/api/v1/employee/1", Employee.class);
        return employee;
    }

    /* vracia  jednu polozku*/
    @Override
    public Todo getTodo(Long id) {
         restTemplate = new RestTemplate();
        Todo todo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1", Todo.class);
        return todo;
    }

    /* vracia  list*/
    @Override
    public List<Todo> getTodos() {
        restTemplate = new RestTemplate();
        ResponseEntity<List<Todo>> responseEntity = restTemplate.exchange("https://jsonplaceholder.typicode.com/todos", HttpMethod.GET, null, new ParameterizedTypeReference<List<Todo>>() {
        });
        List<Todo> todos = responseEntity.getBody();
        return todos;
    }


/*ak je element obaleny v data pre list:*/
    @Override
    public TodoList getTodosList() {

        RestTemplate restTemplate = new RestTemplate();
         TodoList todoList = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/", TodoList.class);
        return todoList;
    }

    public static void main(String[] args) {
     /*   RestApiServiceImpl restApiService = new RestApiServiceImpl();
        Employee employee = restApiService.getEmployee(1l);
        System.out.println(employee.getEmployeeName());
        Todo todo = restApiService.getTodo(1l);
        System.out.println(todo.getTitle());

        System.out.println(restApiService.getTodos());
        System.out.println(restApiService.getTodosList());*/
    }
}
