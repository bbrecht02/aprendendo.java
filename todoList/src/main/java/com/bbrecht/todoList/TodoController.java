package com.bbrecht.todoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/todo")
public class TodoController {
    
    @Autowired
    private TodoRepo todoRepo;


    @PostMapping
    public Todo save(@RequestBody Todo todo) {
        return todoRepo.save(todo);
    }


    @PutMapping
    public Todo update(@RequestBody Todo todo) {
        return todoRepo.save(todo);
    }

    @GetMapping
    public List<Todo> findAll() {
        return todoRepo.findAll();
    }

    @DeleteMapping
    public String deleteTodo() {
        todoRepo.deleteAll();
        return "Deleted";
    }

}
