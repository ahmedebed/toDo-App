package com.example.ToDList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class todoControler {
    @Autowired
    private final todoService todoService;

    public todoControler(todoService todoService){
        this.todoService=todoService;
    }

    @GetMapping("/getAllTodos")
    public List<Todo> getAllTodos(){
        return todoService.findAll();
    }
    @PostMapping("/add")
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.save(todo);

    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id){
        todoService.delete(id);
    }
    
}
