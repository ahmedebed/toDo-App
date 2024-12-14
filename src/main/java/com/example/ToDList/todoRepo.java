package com.example.ToDList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface todoRepo extends JpaRepository<Todo,Long> {

}
