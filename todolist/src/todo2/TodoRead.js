import React, { useCallback, useState } from 'react';

const initState = {
    tno: 0,
    title: '',
    content: '',
    regDate: '',
    modDate: '',
}

const TodoRead = ({tno, clearCri}) => {
    
    const [todo, setTodo] = useState(initState)

    const change = useCallback((e) => {
        e.preventDefault();
        e.stopPropagation();
        const target = e.target
        todo[target.name] = target.value

        setTodo({...todo})
    })

    const clickModify = () => {
        modify(todo).then(result => {
            clearCri()
            setTodo({...initState})
        })
    }
    
    const clickRemove = () => {
        remove(todo.tno).then(result => {
            clearCri()
            setTodo({...initState})
        })
    }

    useEffect(() => {
        console.log("todoRead", tno)
        if(tno === 0) {return}
        fetchRead(tno).then(todoObj => setTodo(todoObj))
    }, [tno])
    
    return (<>
        <div>
            <h4>Todo Read/Modify/Remove</h4>
        
            <div>
                <input type={'text'} name={'tno'} value={todo.tno} onChange={change} />
            </div>
            <div>
                <input type={'text'} name={'tno'} value={todo.tno} onChange={change} />
            </div>
            <div>
                <input type={'text'} name={'tno'} value={todo.tno} onChange={change} />
            </div>
            <div>
                <input type={'text'} name={'tno'} value={todo.tno} onChange={change} />
            </div>
            <div>
                <input type={'text'} name={'tno'} value={todo.tno} onChange={change} />
            </div>

            
        </div>
    </>);
};
export default TodoRead;
