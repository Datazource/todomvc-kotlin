package todomvc.event

enum class EventType {
    CLEAR_COMPLETED,
    ADD_TODO,
    COMPLETE_TODO,
    TOGGLE_COMPLETED_ON_ALL,
    EDIT_TODO,
    DELETE_TODO,
    CANCEL_TODO_EDIT,
    FINISH_TODO_EDIT,
    TODOS_EMPTY_OR_NO_LONGER_EMPTY,
    TODO_CHANGED,
    TODO_EDIT_FINISHED
}