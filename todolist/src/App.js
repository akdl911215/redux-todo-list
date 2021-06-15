import logo from './logo.svg';
import './App.css';
import Todo from './todo/Todo';
import TodoList from './todo2/TodoList';
import TodoRegister from './todo2/TodoRegister';
import TodoListContainer from './todo2/container/TodoListContainer';
import TodoWrapper from './todo2/TodoWrapper';

const App = () => {
    return (
        <div className="App">
            <TodoWrapper />
        </div>
    );
};

export default App;
