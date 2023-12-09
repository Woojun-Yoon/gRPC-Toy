from google.protobuf.json_format import MessageToDict 
import grpc
import todo_pb2
import todo_pb2_grpc

# Todo

async def get_todos() -> None:
	response = []
	async with grpc.aio.insecure_channel('localhost:9090') as channel:
		stub = todo_pb2_grpc.TodoStub(channel)
		async for todo in stub.getAllTodo(todo_pb2.CommonRequest()):
			response.append(MessageToDict(todo))
		return response

def post_todo(params):
	with grpc.insecure_channel('localhost:9090') as channel:
		stub = todo_pb2_grpc.TodoStub(channel)
		response = stub.createTodo(todo_pb2.CreateTodoRequest(
			title = params['title'], 
			description = params['description']))
		response = MessageToDict(response)
	return response


# Todo_id

def get_todo_id(todo_id):
	with grpc.insecure_channel('localhost:9090') as channel:
		stub = todo_pb2_grpc.TodoStub(channel)
		response = stub.getTodo(todo_pb2.GetTodoRequest(
			id = todo_id))
		response = MessageToDict(response)
	return response

def put_todo_id(todo_id, params):
	with grpc.insecure_channel('localhost:9090') as channel:
		stub = todo_pb2_grpc.TodoStub(channel)
		response = stub.updateTodo(todo_pb2.UpdateTodoRequest(
			id = todo_id,
			title = params['title'], 
			description = params['description']))
		response = MessageToDict(response)
	return response

def patch_todo_id(todo_id):
	with grpc.insecure_channel('localhost:9090') as channel:
		stub = todo_pb2_grpc.TodoStub(channel)
		response = stub.updateCompletion(todo_pb2.GetTodoRequest(
			id = todo_id))
		response = MessageToDict(response)
	return response

def delete_todo_id(todo_id):
	with grpc.insecure_channel('localhost:9090') as channel:
		stub = todo_pb2_grpc.TodoStub(channel)
		response = stub.deleteTodo(todo_pb2.GetTodoRequest(
			id = todo_id))
		response = MessageToDict(response)
	return response

# Todo_completed

async def get_todos_completed() -> None:
	response = []
	async with grpc.aio.insecure_channel('localhost:9090') as channel:
		stub = todo_pb2_grpc.TodoStub(channel)
		async for todo in stub.getCompletedTodo(todo_pb2.CommonRequest()):
			response.append(MessageToDict(todo))
		return response

def delete_todos_completed():
	with grpc.insecure_channel('localhost:9090') as channel:
		stub = todo_pb2_grpc.TodoStub(channel)
		response = stub.deleteCompletedTodo(todo_pb2.CommonRequest())
		response = MessageToDict(response)
	return response

# Todo_uncompleted

async def get_todos_uncompleted() -> None:
	response = []
	async with grpc.aio.insecure_channel('localhost:9090') as channel:
		stub = todo_pb2_grpc.TodoStub(channel)
		async for todo in stub.getUncompletedTodo(todo_pb2.CommonRequest()):
			response.append(MessageToDict(todo))
		return response

def delete_todos_uncompleted():
	with grpc.insecure_channel('localhost:9090') as channel:
		stub = todo_pb2_grpc.TodoStub(channel)
		response = stub.deleteUncompletedTodo(todo_pb2.CommonRequest())
		response = MessageToDict(response)
	return response