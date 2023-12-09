# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: todo.proto
# Protobuf Python Version: 4.25.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\ntodo.proto\"\x0f\n\rCommonRequest\"\x1e\n\x0b\x43ommonReply\x12\x0f\n\x07message\x18\x01 \x01(\t\"7\n\x11\x43reateTodoRequest\x12\r\n\x05title\x18\x01 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x02 \x01(\t\"R\n\x0f\x43reateTodoReply\x12\x0f\n\x07message\x18\x01 \x01(\t\x12\n\n\x02id\x18\x02 \x01(\x03\x12\r\n\x05title\x18\x03 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x04 \x01(\t\"\x1c\n\x0eGetTodoRequest\x12\n\n\x02id\x18\x01 \x01(\x03\"R\n\x0cGetTodoReply\x12\n\n\x02id\x18\x01 \x01(\x03\x12\r\n\x05title\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12\x12\n\ncompletion\x18\x04 \x01(\x08\"C\n\x11UpdateTodoRequest\x12\n\n\x02id\x18\x01 \x01(\x03\x12\r\n\x05title\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t2\x92\x04\n\x04Todo\x12+\n\x07getTodo\x12\x0f.GetTodoRequest\x1a\r.GetTodoReply\"\x00\x12/\n\ngetAllTodo\x12\x0e.CommonRequest\x1a\r.GetTodoReply\"\x00\x30\x01\x12\x35\n\x10getCompletedTodo\x12\x0e.CommonRequest\x1a\r.GetTodoReply\"\x00\x30\x01\x12\x37\n\x12getUncompletedTodo\x12\x0e.CommonRequest\x1a\r.GetTodoReply\"\x00\x30\x01\x12\x34\n\ncreateTodo\x12\x12.CreateTodoRequest\x1a\x10.CreateTodoReply\"\x00\x12\x31\n\nupdateTodo\x12\x12.UpdateTodoRequest\x1a\r.GetTodoReply\"\x00\x12\x34\n\x10updateCompletion\x12\x0f.GetTodoRequest\x1a\r.GetTodoReply\"\x00\x12-\n\ndeleteTodo\x12\x0f.GetTodoRequest\x1a\x0c.CommonReply\"\x00\x12\x35\n\x13\x64\x65leteCompletedTodo\x12\x0e.CommonRequest\x1a\x0c.CommonReply\"\x00\x12\x37\n\x15\x64\x65leteUncompletedTodo\x12\x0e.CommonRequest\x1a\x0c.CommonReply\"\x00\x42\x1f\n\x10\x63om.toy.grpc.libB\tTodoProtoP\x01\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'todo_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\020com.toy.grpc.libB\tTodoProtoP\001'
  _globals['_COMMONREQUEST']._serialized_start=14
  _globals['_COMMONREQUEST']._serialized_end=29
  _globals['_COMMONREPLY']._serialized_start=31
  _globals['_COMMONREPLY']._serialized_end=61
  _globals['_CREATETODOREQUEST']._serialized_start=63
  _globals['_CREATETODOREQUEST']._serialized_end=118
  _globals['_CREATETODOREPLY']._serialized_start=120
  _globals['_CREATETODOREPLY']._serialized_end=202
  _globals['_GETTODOREQUEST']._serialized_start=204
  _globals['_GETTODOREQUEST']._serialized_end=232
  _globals['_GETTODOREPLY']._serialized_start=234
  _globals['_GETTODOREPLY']._serialized_end=316
  _globals['_UPDATETODOREQUEST']._serialized_start=318
  _globals['_UPDATETODOREQUEST']._serialized_end=385
  _globals['_TODO']._serialized_start=388
  _globals['_TODO']._serialized_end=918
# @@protoc_insertion_point(module_scope)