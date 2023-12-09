from flask import Flask, request, jsonify
from flask_restx import Resource, Api
from todo_client import *
import asyncio

app = Flask(__name__)
api = Api(
    app,
    version='1.0',
    title='Todo API',
    description='A simple Todo API with gRPC',
    license='MIT'
)

@api.route('/todos')
class Todo(Resource):
    def get(self):
        return jsonify(asyncio.run(get_todos()))

    def post(self):
        params = request.get_json()
        return jsonify(post_todo(params))

@api.route('/todos/<int:todo_id>')
class Todo_id(Resource):
    def get(self, todo_id):
        return jsonify(get_todo_id(todo_id))

    def put(self, todo_id):
        params = request.get_json()
        return jsonify(put_todo_id(todo_id, params))

    def patch(self, todo_id):
        return jsonify(patch_todo_id(todo_id))

    def delete(self, todo_id):
        return jsonify(delete_todo_id(todo_id))

@api.route('/todos/completed')
class Todo_completed(Resource):
    def get(self):
        return jsonify(asyncio.run(get_todos_completed()))
    
    def delete(self):
        return jsonify(delete_todos_completed())

@api.route('/todos/uncompleted')
class Todo_uncompleted(Resource):
    def get(self):
        return jsonify(asyncio.run(get_todos_uncompleted()))
    
    def delete(self):
        return jsonify(delete_todos_uncompleted())

if __name__ == "__main__":
    app.run(debug=True)