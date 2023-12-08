package com.toy.grpcserver.service;

import com.toy.grpc.lib.*;
import com.toy.grpcserver.domain.Todo;
import com.toy.grpcserver.repository.TodoRepository;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@GrpcService
public class GrpcTodoService extends TodoGrpc.TodoImplBase {

    private final TodoRepository todoRepository;

    // GET
    @Override
    public void getTodo(GetTodoRequest request, StreamObserver<GetTodoReply> responseObserver) {
        Todo todo = todoRepository.findById(request.getId()).orElseThrow();
        GetTodoReply reply = GetTodoReply.newBuilder()
                .setId(todo.getId())
                .setTitle(todo.getTitle())
                .setDescription(todo.getDescription())
                .setCompletion(todo.isCompletion())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllTodo(CommonRequest request, StreamObserver<GetTodoReply> responseObserver) {
        todoRepository.findAll().forEach(todo -> {
            responseObserver.onNext(GetTodoReply.newBuilder()
                    .setId(todo.getId())
                    .setTitle(todo.getTitle())
                    .setDescription(todo.getDescription())
                    .setCompletion(todo.isCompletion())
                    .build());
        });
        responseObserver.onCompleted();
    }

    @Override
    public void getCompletedTodo(CommonRequest request, StreamObserver<GetTodoReply> responseObserver) {
        todoRepository.findAllByCompletion(true).forEach(todo -> {
            responseObserver.onNext(GetTodoReply.newBuilder()
                    .setId(todo.getId())
                    .setTitle(todo.getTitle())
                    .setDescription(todo.getDescription())
                    .setCompletion(todo.isCompletion())
                    .build());
        });
        responseObserver.onCompleted();
    }

    @Override
    public void getUncompletedTodo(CommonRequest request, StreamObserver<GetTodoReply> responseObserver) {
        todoRepository.findAllByCompletion(false).forEach(todo -> {
            responseObserver.onNext(GetTodoReply.newBuilder()
                    .setId(todo.getId())
                    .setTitle(todo.getTitle())
                    .setDescription(todo.getDescription())
                    .setCompletion(todo.isCompletion())
                    .build());
        });
        responseObserver.onCompleted();
    }

    // POST
    @Override
    public void createTodo(CreateTodoRequest request, StreamObserver<CreateTodoReply> responseObserver) {
        Todo todo = Todo.ByTodoBuilder()
                .title(request.getTitle())
                .description(request.getDescription())
                .build();
        todoRepository.save(todo);
        CreateTodoReply reply = CreateTodoReply.newBuilder()
                .setMessage("Create Todo Success")
                .setId(todo.getId())
                .setTitle(todo.getTitle())
                .setDescription(todo.getDescription())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    // PUT
    @Override
    public void updateTodo(UpdateTodoRequest request, StreamObserver<GetTodoReply> responseObserver) {
        Todo todo = todoRepository.findById(request.getId()).orElseThrow();
        todo.setTitle(request.getTitle());
        todo.setDescription(request.getDescription());
        GetTodoReply reply = GetTodoReply.newBuilder()
                .setId(todo.getId())
                .setTitle(todo.getTitle())
                .setDescription(todo.getDescription())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    // PATCH
    @Override
    public void updateCompletion(GetTodoRequest request, StreamObserver<GetTodoReply> responseObserver) {
        Todo todo = todoRepository.findById(request.getId()).orElseThrow();
        todo.changeComplete();
        GetTodoReply reply = GetTodoReply.newBuilder()
                .setId(todo.getId())
                .setTitle(todo.getTitle())
                .setDescription(todo.getDescription())
                .setCompletion(todo.isCompletion())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    // DELETE
    @Override
    public void deleteTodo(GetTodoRequest request, StreamObserver<CommonReply> responseObserver) {
        todoRepository.deleteById(request.getId());
        CommonReply reply = CommonReply.newBuilder()
                .setMessage("Delete Todo Success")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteCompletedTodo(CommonRequest request, StreamObserver<CommonReply> responseObserver) {
        todoRepository.deleteAllByCompletion(true);
        CommonReply reply = CommonReply.newBuilder()
                .setMessage("Delete Completed Todo Success")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteUncompletedTodo(CommonRequest request, StreamObserver<CommonReply> responseObserver) {
        todoRepository.deleteAllByCompletion(false);
        CommonReply reply = CommonReply.newBuilder()
                .setMessage("Delete Uncompleted Todo Success")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
