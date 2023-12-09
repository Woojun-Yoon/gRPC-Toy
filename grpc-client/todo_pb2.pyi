from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor

class CommonRequest(_message.Message):
    __slots__ = ()
    def __init__(self) -> None: ...

class CommonReply(_message.Message):
    __slots__ = ("message",)
    MESSAGE_FIELD_NUMBER: _ClassVar[int]
    message: str
    def __init__(self, message: _Optional[str] = ...) -> None: ...

class CreateTodoRequest(_message.Message):
    __slots__ = ("title", "description")
    TITLE_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    title: str
    description: str
    def __init__(self, title: _Optional[str] = ..., description: _Optional[str] = ...) -> None: ...

class CreateTodoReply(_message.Message):
    __slots__ = ("message", "id", "title", "description")
    MESSAGE_FIELD_NUMBER: _ClassVar[int]
    ID_FIELD_NUMBER: _ClassVar[int]
    TITLE_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    message: str
    id: int
    title: str
    description: str
    def __init__(self, message: _Optional[str] = ..., id: _Optional[int] = ..., title: _Optional[str] = ..., description: _Optional[str] = ...) -> None: ...

class GetTodoRequest(_message.Message):
    __slots__ = ("id",)
    ID_FIELD_NUMBER: _ClassVar[int]
    id: int
    def __init__(self, id: _Optional[int] = ...) -> None: ...

class GetTodoReply(_message.Message):
    __slots__ = ("id", "title", "description", "completion")
    ID_FIELD_NUMBER: _ClassVar[int]
    TITLE_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    COMPLETION_FIELD_NUMBER: _ClassVar[int]
    id: int
    title: str
    description: str
    completion: bool
    def __init__(self, id: _Optional[int] = ..., title: _Optional[str] = ..., description: _Optional[str] = ..., completion: bool = ...) -> None: ...

class UpdateTodoRequest(_message.Message):
    __slots__ = ("id", "title", "description")
    ID_FIELD_NUMBER: _ClassVar[int]
    TITLE_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    id: int
    title: str
    description: str
    def __init__(self, id: _Optional[int] = ..., title: _Optional[str] = ..., description: _Optional[str] = ...) -> None: ...
