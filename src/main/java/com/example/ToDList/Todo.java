package com.example.ToDList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode

@Entity(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String title;
    private String descraption;
    private boolean completed;

}
