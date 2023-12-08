package com.toy.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: todo.proto")
public final class TodoGrpc {

  private TodoGrpc() {}

  public static final String SERVICE_NAME = "Todo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.toy.grpc.lib.GetTodoRequest,
      com.toy.grpc.lib.GetTodoReply> getGetTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTodo",
      requestType = com.toy.grpc.lib.GetTodoRequest.class,
      responseType = com.toy.grpc.lib.GetTodoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.toy.grpc.lib.GetTodoRequest,
      com.toy.grpc.lib.GetTodoReply> getGetTodoMethod() {
    io.grpc.MethodDescriptor<com.toy.grpc.lib.GetTodoRequest, com.toy.grpc.lib.GetTodoReply> getGetTodoMethod;
    if ((getGetTodoMethod = TodoGrpc.getGetTodoMethod) == null) {
      synchronized (TodoGrpc.class) {
        if ((getGetTodoMethod = TodoGrpc.getGetTodoMethod) == null) {
          TodoGrpc.getGetTodoMethod = getGetTodoMethod =
              io.grpc.MethodDescriptor.<com.toy.grpc.lib.GetTodoRequest, com.toy.grpc.lib.GetTodoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.GetTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.GetTodoReply.getDefaultInstance()))
              .setSchemaDescriptor(new TodoMethodDescriptorSupplier("getTodo"))
              .build();
        }
      }
    }
    return getGetTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest,
      com.toy.grpc.lib.GetTodoReply> getGetAllTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllTodo",
      requestType = com.toy.grpc.lib.CommonRequest.class,
      responseType = com.toy.grpc.lib.GetTodoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest,
      com.toy.grpc.lib.GetTodoReply> getGetAllTodoMethod() {
    io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest, com.toy.grpc.lib.GetTodoReply> getGetAllTodoMethod;
    if ((getGetAllTodoMethod = TodoGrpc.getGetAllTodoMethod) == null) {
      synchronized (TodoGrpc.class) {
        if ((getGetAllTodoMethod = TodoGrpc.getGetAllTodoMethod) == null) {
          TodoGrpc.getGetAllTodoMethod = getGetAllTodoMethod =
              io.grpc.MethodDescriptor.<com.toy.grpc.lib.CommonRequest, com.toy.grpc.lib.GetTodoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.GetTodoReply.getDefaultInstance()))
              .setSchemaDescriptor(new TodoMethodDescriptorSupplier("getAllTodo"))
              .build();
        }
      }
    }
    return getGetAllTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest,
      com.toy.grpc.lib.GetTodoReply> getGetCompletedTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCompletedTodo",
      requestType = com.toy.grpc.lib.CommonRequest.class,
      responseType = com.toy.grpc.lib.GetTodoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest,
      com.toy.grpc.lib.GetTodoReply> getGetCompletedTodoMethod() {
    io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest, com.toy.grpc.lib.GetTodoReply> getGetCompletedTodoMethod;
    if ((getGetCompletedTodoMethod = TodoGrpc.getGetCompletedTodoMethod) == null) {
      synchronized (TodoGrpc.class) {
        if ((getGetCompletedTodoMethod = TodoGrpc.getGetCompletedTodoMethod) == null) {
          TodoGrpc.getGetCompletedTodoMethod = getGetCompletedTodoMethod =
              io.grpc.MethodDescriptor.<com.toy.grpc.lib.CommonRequest, com.toy.grpc.lib.GetTodoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCompletedTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.GetTodoReply.getDefaultInstance()))
              .setSchemaDescriptor(new TodoMethodDescriptorSupplier("getCompletedTodo"))
              .build();
        }
      }
    }
    return getGetCompletedTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest,
      com.toy.grpc.lib.GetTodoReply> getGetUncompletedTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUncompletedTodo",
      requestType = com.toy.grpc.lib.CommonRequest.class,
      responseType = com.toy.grpc.lib.GetTodoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest,
      com.toy.grpc.lib.GetTodoReply> getGetUncompletedTodoMethod() {
    io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest, com.toy.grpc.lib.GetTodoReply> getGetUncompletedTodoMethod;
    if ((getGetUncompletedTodoMethod = TodoGrpc.getGetUncompletedTodoMethod) == null) {
      synchronized (TodoGrpc.class) {
        if ((getGetUncompletedTodoMethod = TodoGrpc.getGetUncompletedTodoMethod) == null) {
          TodoGrpc.getGetUncompletedTodoMethod = getGetUncompletedTodoMethod =
              io.grpc.MethodDescriptor.<com.toy.grpc.lib.CommonRequest, com.toy.grpc.lib.GetTodoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUncompletedTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.GetTodoReply.getDefaultInstance()))
              .setSchemaDescriptor(new TodoMethodDescriptorSupplier("getUncompletedTodo"))
              .build();
        }
      }
    }
    return getGetUncompletedTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.toy.grpc.lib.CreateTodoRequest,
      com.toy.grpc.lib.CreateTodoReply> getCreateTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTodo",
      requestType = com.toy.grpc.lib.CreateTodoRequest.class,
      responseType = com.toy.grpc.lib.CreateTodoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.toy.grpc.lib.CreateTodoRequest,
      com.toy.grpc.lib.CreateTodoReply> getCreateTodoMethod() {
    io.grpc.MethodDescriptor<com.toy.grpc.lib.CreateTodoRequest, com.toy.grpc.lib.CreateTodoReply> getCreateTodoMethod;
    if ((getCreateTodoMethod = TodoGrpc.getCreateTodoMethod) == null) {
      synchronized (TodoGrpc.class) {
        if ((getCreateTodoMethod = TodoGrpc.getCreateTodoMethod) == null) {
          TodoGrpc.getCreateTodoMethod = getCreateTodoMethod =
              io.grpc.MethodDescriptor.<com.toy.grpc.lib.CreateTodoRequest, com.toy.grpc.lib.CreateTodoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.CreateTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.CreateTodoReply.getDefaultInstance()))
              .setSchemaDescriptor(new TodoMethodDescriptorSupplier("createTodo"))
              .build();
        }
      }
    }
    return getCreateTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.toy.grpc.lib.UpdateTodoRequest,
      com.toy.grpc.lib.GetTodoReply> getUpdateTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTodo",
      requestType = com.toy.grpc.lib.UpdateTodoRequest.class,
      responseType = com.toy.grpc.lib.GetTodoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.toy.grpc.lib.UpdateTodoRequest,
      com.toy.grpc.lib.GetTodoReply> getUpdateTodoMethod() {
    io.grpc.MethodDescriptor<com.toy.grpc.lib.UpdateTodoRequest, com.toy.grpc.lib.GetTodoReply> getUpdateTodoMethod;
    if ((getUpdateTodoMethod = TodoGrpc.getUpdateTodoMethod) == null) {
      synchronized (TodoGrpc.class) {
        if ((getUpdateTodoMethod = TodoGrpc.getUpdateTodoMethod) == null) {
          TodoGrpc.getUpdateTodoMethod = getUpdateTodoMethod =
              io.grpc.MethodDescriptor.<com.toy.grpc.lib.UpdateTodoRequest, com.toy.grpc.lib.GetTodoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.UpdateTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.GetTodoReply.getDefaultInstance()))
              .setSchemaDescriptor(new TodoMethodDescriptorSupplier("updateTodo"))
              .build();
        }
      }
    }
    return getUpdateTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.toy.grpc.lib.GetTodoRequest,
      com.toy.grpc.lib.GetTodoReply> getUpdateCompletionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCompletion",
      requestType = com.toy.grpc.lib.GetTodoRequest.class,
      responseType = com.toy.grpc.lib.GetTodoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.toy.grpc.lib.GetTodoRequest,
      com.toy.grpc.lib.GetTodoReply> getUpdateCompletionMethod() {
    io.grpc.MethodDescriptor<com.toy.grpc.lib.GetTodoRequest, com.toy.grpc.lib.GetTodoReply> getUpdateCompletionMethod;
    if ((getUpdateCompletionMethod = TodoGrpc.getUpdateCompletionMethod) == null) {
      synchronized (TodoGrpc.class) {
        if ((getUpdateCompletionMethod = TodoGrpc.getUpdateCompletionMethod) == null) {
          TodoGrpc.getUpdateCompletionMethod = getUpdateCompletionMethod =
              io.grpc.MethodDescriptor.<com.toy.grpc.lib.GetTodoRequest, com.toy.grpc.lib.GetTodoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateCompletion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.GetTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.GetTodoReply.getDefaultInstance()))
              .setSchemaDescriptor(new TodoMethodDescriptorSupplier("updateCompletion"))
              .build();
        }
      }
    }
    return getUpdateCompletionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.toy.grpc.lib.GetTodoRequest,
      com.toy.grpc.lib.CommonReply> getDeleteTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTodo",
      requestType = com.toy.grpc.lib.GetTodoRequest.class,
      responseType = com.toy.grpc.lib.CommonReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.toy.grpc.lib.GetTodoRequest,
      com.toy.grpc.lib.CommonReply> getDeleteTodoMethod() {
    io.grpc.MethodDescriptor<com.toy.grpc.lib.GetTodoRequest, com.toy.grpc.lib.CommonReply> getDeleteTodoMethod;
    if ((getDeleteTodoMethod = TodoGrpc.getDeleteTodoMethod) == null) {
      synchronized (TodoGrpc.class) {
        if ((getDeleteTodoMethod = TodoGrpc.getDeleteTodoMethod) == null) {
          TodoGrpc.getDeleteTodoMethod = getDeleteTodoMethod =
              io.grpc.MethodDescriptor.<com.toy.grpc.lib.GetTodoRequest, com.toy.grpc.lib.CommonReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.GetTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.CommonReply.getDefaultInstance()))
              .setSchemaDescriptor(new TodoMethodDescriptorSupplier("deleteTodo"))
              .build();
        }
      }
    }
    return getDeleteTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest,
      com.toy.grpc.lib.CommonReply> getDeleteCompletedTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteCompletedTodo",
      requestType = com.toy.grpc.lib.CommonRequest.class,
      responseType = com.toy.grpc.lib.CommonReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest,
      com.toy.grpc.lib.CommonReply> getDeleteCompletedTodoMethod() {
    io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest, com.toy.grpc.lib.CommonReply> getDeleteCompletedTodoMethod;
    if ((getDeleteCompletedTodoMethod = TodoGrpc.getDeleteCompletedTodoMethod) == null) {
      synchronized (TodoGrpc.class) {
        if ((getDeleteCompletedTodoMethod = TodoGrpc.getDeleteCompletedTodoMethod) == null) {
          TodoGrpc.getDeleteCompletedTodoMethod = getDeleteCompletedTodoMethod =
              io.grpc.MethodDescriptor.<com.toy.grpc.lib.CommonRequest, com.toy.grpc.lib.CommonReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteCompletedTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.CommonReply.getDefaultInstance()))
              .setSchemaDescriptor(new TodoMethodDescriptorSupplier("deleteCompletedTodo"))
              .build();
        }
      }
    }
    return getDeleteCompletedTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest,
      com.toy.grpc.lib.CommonReply> getDeleteUncompletedTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUncompletedTodo",
      requestType = com.toy.grpc.lib.CommonRequest.class,
      responseType = com.toy.grpc.lib.CommonReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest,
      com.toy.grpc.lib.CommonReply> getDeleteUncompletedTodoMethod() {
    io.grpc.MethodDescriptor<com.toy.grpc.lib.CommonRequest, com.toy.grpc.lib.CommonReply> getDeleteUncompletedTodoMethod;
    if ((getDeleteUncompletedTodoMethod = TodoGrpc.getDeleteUncompletedTodoMethod) == null) {
      synchronized (TodoGrpc.class) {
        if ((getDeleteUncompletedTodoMethod = TodoGrpc.getDeleteUncompletedTodoMethod) == null) {
          TodoGrpc.getDeleteUncompletedTodoMethod = getDeleteUncompletedTodoMethod =
              io.grpc.MethodDescriptor.<com.toy.grpc.lib.CommonRequest, com.toy.grpc.lib.CommonReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteUncompletedTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.toy.grpc.lib.CommonReply.getDefaultInstance()))
              .setSchemaDescriptor(new TodoMethodDescriptorSupplier("deleteUncompletedTodo"))
              .build();
        }
      }
    }
    return getDeleteUncompletedTodoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TodoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoStub>() {
        @java.lang.Override
        public TodoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoStub(channel, callOptions);
        }
      };
    return TodoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TodoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoBlockingStub>() {
        @java.lang.Override
        public TodoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoBlockingStub(channel, callOptions);
        }
      };
    return TodoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TodoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoFutureStub>() {
        @java.lang.Override
        public TodoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoFutureStub(channel, callOptions);
        }
      };
    return TodoFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TodoImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GET
     * </pre>
     */
    public void getTodo(com.toy.grpc.lib.GetTodoRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTodoMethod(), responseObserver);
    }

    /**
     */
    public void getAllTodo(com.toy.grpc.lib.CommonRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllTodoMethod(), responseObserver);
    }

    /**
     */
    public void getCompletedTodo(com.toy.grpc.lib.CommonRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCompletedTodoMethod(), responseObserver);
    }

    /**
     */
    public void getUncompletedTodo(com.toy.grpc.lib.CommonRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUncompletedTodoMethod(), responseObserver);
    }

    /**
     * <pre>
     * POST
     * </pre>
     */
    public void createTodo(com.toy.grpc.lib.CreateTodoRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.CreateTodoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTodoMethod(), responseObserver);
    }

    /**
     * <pre>
     * PUT
     * </pre>
     */
    public void updateTodo(com.toy.grpc.lib.UpdateTodoRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTodoMethod(), responseObserver);
    }

    /**
     * <pre>
     * PATCH
     * </pre>
     */
    public void updateCompletion(com.toy.grpc.lib.GetTodoRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCompletionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DELETE
     * </pre>
     */
    public void deleteTodo(com.toy.grpc.lib.GetTodoRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.CommonReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTodoMethod(), responseObserver);
    }

    /**
     */
    public void deleteCompletedTodo(com.toy.grpc.lib.CommonRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.CommonReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCompletedTodoMethod(), responseObserver);
    }

    /**
     */
    public void deleteUncompletedTodo(com.toy.grpc.lib.CommonRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.CommonReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUncompletedTodoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTodoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.toy.grpc.lib.GetTodoRequest,
                com.toy.grpc.lib.GetTodoReply>(
                  this, METHODID_GET_TODO)))
          .addMethod(
            getGetAllTodoMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.toy.grpc.lib.CommonRequest,
                com.toy.grpc.lib.GetTodoReply>(
                  this, METHODID_GET_ALL_TODO)))
          .addMethod(
            getGetCompletedTodoMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.toy.grpc.lib.CommonRequest,
                com.toy.grpc.lib.GetTodoReply>(
                  this, METHODID_GET_COMPLETED_TODO)))
          .addMethod(
            getGetUncompletedTodoMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.toy.grpc.lib.CommonRequest,
                com.toy.grpc.lib.GetTodoReply>(
                  this, METHODID_GET_UNCOMPLETED_TODO)))
          .addMethod(
            getCreateTodoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.toy.grpc.lib.CreateTodoRequest,
                com.toy.grpc.lib.CreateTodoReply>(
                  this, METHODID_CREATE_TODO)))
          .addMethod(
            getUpdateTodoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.toy.grpc.lib.UpdateTodoRequest,
                com.toy.grpc.lib.GetTodoReply>(
                  this, METHODID_UPDATE_TODO)))
          .addMethod(
            getUpdateCompletionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.toy.grpc.lib.GetTodoRequest,
                com.toy.grpc.lib.GetTodoReply>(
                  this, METHODID_UPDATE_COMPLETION)))
          .addMethod(
            getDeleteTodoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.toy.grpc.lib.GetTodoRequest,
                com.toy.grpc.lib.CommonReply>(
                  this, METHODID_DELETE_TODO)))
          .addMethod(
            getDeleteCompletedTodoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.toy.grpc.lib.CommonRequest,
                com.toy.grpc.lib.CommonReply>(
                  this, METHODID_DELETE_COMPLETED_TODO)))
          .addMethod(
            getDeleteUncompletedTodoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.toy.grpc.lib.CommonRequest,
                com.toy.grpc.lib.CommonReply>(
                  this, METHODID_DELETE_UNCOMPLETED_TODO)))
          .build();
    }
  }

  /**
   */
  public static final class TodoStub extends io.grpc.stub.AbstractAsyncStub<TodoStub> {
    private TodoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET
     * </pre>
     */
    public void getTodo(com.toy.grpc.lib.GetTodoRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllTodo(com.toy.grpc.lib.CommonRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCompletedTodo(com.toy.grpc.lib.CommonRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetCompletedTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUncompletedTodo(com.toy.grpc.lib.CommonRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetUncompletedTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * POST
     * </pre>
     */
    public void createTodo(com.toy.grpc.lib.CreateTodoRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.CreateTodoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PUT
     * </pre>
     */
    public void updateTodo(com.toy.grpc.lib.UpdateTodoRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PATCH
     * </pre>
     */
    public void updateCompletion(com.toy.grpc.lib.GetTodoRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCompletionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DELETE
     * </pre>
     */
    public void deleteTodo(com.toy.grpc.lib.GetTodoRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.CommonReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCompletedTodo(com.toy.grpc.lib.CommonRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.CommonReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCompletedTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUncompletedTodo(com.toy.grpc.lib.CommonRequest request,
        io.grpc.stub.StreamObserver<com.toy.grpc.lib.CommonReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUncompletedTodoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TodoBlockingStub extends io.grpc.stub.AbstractBlockingStub<TodoBlockingStub> {
    private TodoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET
     * </pre>
     */
    public com.toy.grpc.lib.GetTodoReply getTodo(com.toy.grpc.lib.GetTodoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.toy.grpc.lib.GetTodoReply> getAllTodo(
        com.toy.grpc.lib.CommonRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.toy.grpc.lib.GetTodoReply> getCompletedTodo(
        com.toy.grpc.lib.CommonRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetCompletedTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.toy.grpc.lib.GetTodoReply> getUncompletedTodo(
        com.toy.grpc.lib.CommonRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetUncompletedTodoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * POST
     * </pre>
     */
    public com.toy.grpc.lib.CreateTodoReply createTodo(com.toy.grpc.lib.CreateTodoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTodoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PUT
     * </pre>
     */
    public com.toy.grpc.lib.GetTodoReply updateTodo(com.toy.grpc.lib.UpdateTodoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTodoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PATCH
     * </pre>
     */
    public com.toy.grpc.lib.GetTodoReply updateCompletion(com.toy.grpc.lib.GetTodoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCompletionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DELETE
     * </pre>
     */
    public com.toy.grpc.lib.CommonReply deleteTodo(com.toy.grpc.lib.GetTodoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.toy.grpc.lib.CommonReply deleteCompletedTodo(com.toy.grpc.lib.CommonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCompletedTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.toy.grpc.lib.CommonReply deleteUncompletedTodo(com.toy.grpc.lib.CommonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUncompletedTodoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TodoFutureStub extends io.grpc.stub.AbstractFutureStub<TodoFutureStub> {
    private TodoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.toy.grpc.lib.GetTodoReply> getTodo(
        com.toy.grpc.lib.GetTodoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTodoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * POST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.toy.grpc.lib.CreateTodoReply> createTodo(
        com.toy.grpc.lib.CreateTodoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTodoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PUT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.toy.grpc.lib.GetTodoReply> updateTodo(
        com.toy.grpc.lib.UpdateTodoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTodoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PATCH
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.toy.grpc.lib.GetTodoReply> updateCompletion(
        com.toy.grpc.lib.GetTodoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCompletionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DELETE
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.toy.grpc.lib.CommonReply> deleteTodo(
        com.toy.grpc.lib.GetTodoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.toy.grpc.lib.CommonReply> deleteCompletedTodo(
        com.toy.grpc.lib.CommonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCompletedTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.toy.grpc.lib.CommonReply> deleteUncompletedTodo(
        com.toy.grpc.lib.CommonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUncompletedTodoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TODO = 0;
  private static final int METHODID_GET_ALL_TODO = 1;
  private static final int METHODID_GET_COMPLETED_TODO = 2;
  private static final int METHODID_GET_UNCOMPLETED_TODO = 3;
  private static final int METHODID_CREATE_TODO = 4;
  private static final int METHODID_UPDATE_TODO = 5;
  private static final int METHODID_UPDATE_COMPLETION = 6;
  private static final int METHODID_DELETE_TODO = 7;
  private static final int METHODID_DELETE_COMPLETED_TODO = 8;
  private static final int METHODID_DELETE_UNCOMPLETED_TODO = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TodoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TodoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TODO:
          serviceImpl.getTodo((com.toy.grpc.lib.GetTodoRequest) request,
              (io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply>) responseObserver);
          break;
        case METHODID_GET_ALL_TODO:
          serviceImpl.getAllTodo((com.toy.grpc.lib.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply>) responseObserver);
          break;
        case METHODID_GET_COMPLETED_TODO:
          serviceImpl.getCompletedTodo((com.toy.grpc.lib.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply>) responseObserver);
          break;
        case METHODID_GET_UNCOMPLETED_TODO:
          serviceImpl.getUncompletedTodo((com.toy.grpc.lib.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply>) responseObserver);
          break;
        case METHODID_CREATE_TODO:
          serviceImpl.createTodo((com.toy.grpc.lib.CreateTodoRequest) request,
              (io.grpc.stub.StreamObserver<com.toy.grpc.lib.CreateTodoReply>) responseObserver);
          break;
        case METHODID_UPDATE_TODO:
          serviceImpl.updateTodo((com.toy.grpc.lib.UpdateTodoRequest) request,
              (io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply>) responseObserver);
          break;
        case METHODID_UPDATE_COMPLETION:
          serviceImpl.updateCompletion((com.toy.grpc.lib.GetTodoRequest) request,
              (io.grpc.stub.StreamObserver<com.toy.grpc.lib.GetTodoReply>) responseObserver);
          break;
        case METHODID_DELETE_TODO:
          serviceImpl.deleteTodo((com.toy.grpc.lib.GetTodoRequest) request,
              (io.grpc.stub.StreamObserver<com.toy.grpc.lib.CommonReply>) responseObserver);
          break;
        case METHODID_DELETE_COMPLETED_TODO:
          serviceImpl.deleteCompletedTodo((com.toy.grpc.lib.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.toy.grpc.lib.CommonReply>) responseObserver);
          break;
        case METHODID_DELETE_UNCOMPLETED_TODO:
          serviceImpl.deleteUncompletedTodo((com.toy.grpc.lib.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.toy.grpc.lib.CommonReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TodoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TodoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.toy.grpc.lib.TodoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Todo");
    }
  }

  private static final class TodoFileDescriptorSupplier
      extends TodoBaseDescriptorSupplier {
    TodoFileDescriptorSupplier() {}
  }

  private static final class TodoMethodDescriptorSupplier
      extends TodoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TodoMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TodoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TodoFileDescriptorSupplier())
              .addMethod(getGetTodoMethod())
              .addMethod(getGetAllTodoMethod())
              .addMethod(getGetCompletedTodoMethod())
              .addMethod(getGetUncompletedTodoMethod())
              .addMethod(getCreateTodoMethod())
              .addMethod(getUpdateTodoMethod())
              .addMethod(getUpdateCompletionMethod())
              .addMethod(getDeleteTodoMethod())
              .addMethod(getDeleteCompletedTodoMethod())
              .addMethod(getDeleteUncompletedTodoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
