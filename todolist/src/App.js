import logo from './logo.svg';
import './App.css';
import Todo from './todo/Todo';
import MovieList from './movie/MovieList';
import MovieKiosk from './movie/MovieKiosk';
import MovieCard from './movie/MovieCard';

const App = () => {
    return (
        <div className="App">
            <MovieList />
        </div>
    );
};

export default App;
