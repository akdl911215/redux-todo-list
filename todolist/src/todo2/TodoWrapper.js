import React, { useState } from 'react';
import { fetchPage } from './todoService';

const initState = {
    page: 1,
    size: 10,
    type: '',
    keyword: '',
};

const TodoWrapper = () => {
    const [cri, setCri] = useState(initState);
    const [current, setCurrent] = useState(0);
    const [result, setResult] = useState({});

    const loadPage = async () => {
        const result = await fetchPage(cri);
        setResult(result);
    };

    const movePage = (pageNum) => {
        setCri({ ...cri, page: pageNum });
    };

    const moveRead = (tno) => {
        setCurrent(tno);
    };

    const changeCri = (key, value) => {
        console.log('changeCri', key, value);

        cri.type = key;
        cri.keyword = value;

        console.log(cri);

        setCri(...cri);
    };
};
