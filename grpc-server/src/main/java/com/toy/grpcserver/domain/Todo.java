package com.toy.grpcserver.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "todo")
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todo_id")
    @EqualsAndHashCode.Include
    Long id;

    String title;

    String description;

    @ColumnDefault("false")
    boolean completion;

    @Builder(builderClassName = "ByTodoBuilder", builderMethodName = "ByTodoBuilder")
    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
        this.completion = false;
    }

    // Buisness Logic
    public void changeComplete() {
        this.completion = !this.completion;
    }
}
