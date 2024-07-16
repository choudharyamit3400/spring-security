package com.amit.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {
	public static final List<Todo> TODO_LIST = List.of(new Todo("admin1", "learn AWs"),
													   new Todo("amit", "learn boot"));
	private final Logger logger = LoggerFactory.getLogger(TodoResource.class);

	@GetMapping("/todos")
	public List<Todo> retrieveAllTodos() {
		return TODO_LIST;
	}

	@GetMapping("/users/{username}/todos")
	public Todo retrieveTodosForAUser(@PathVariable String username) {
//        List<Todo> result=TODO_LIST.stream().filter((item)->item.username()==username).collect(Collectors.toList())  ;
//        System.out.println(String.format("ak8702-username is :%username "));
//        return result.get(0);

		return TODO_LIST.get(0);
	}

	@PostMapping("/users/{username}/todos")
	public void createTodosForAUser(@PathVariable String username, @RequestBody Todo todo) {
		logger.info("Create {} for {}", todo, username);
	}
}

record Todo(String username, String description) {
}
