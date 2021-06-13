import { configureStore } from '@reduxjs/toolkit';
import todoSlice from '../todo/todoSlice';
import movieSlice from '../movie/movieSlice';

export default configureStore({
    reducer: {
        todo: todoSlice,
        movie: movieSlice,
        todo2: todoSlice,
    },
});
