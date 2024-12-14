package com.example.ToDList;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class todoService {
    private final todoRepo todoRepo;


    public List<Todo> findAll(){
        return todoRepo.findAll();

    }
    public Todo save(Todo todo){
        return todoRepo.save(todo);
    }
    public void delete(Long id){
        todoRepo.deleteById(id);
    }

}
