package com.toy.grpcserver.repository;

import com.toy.grpcserver.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<Todo> findAllByCompletion(boolean completed);

    void deleteAllByCompletion(boolean completed);
}
