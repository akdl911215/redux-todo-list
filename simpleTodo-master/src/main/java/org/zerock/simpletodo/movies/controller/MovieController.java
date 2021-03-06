package org.zerock.simpletodo.movies.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.simpletodo.movies.service.MovieRankService;

@Controller
@Log4j2
@RequiredArgsConstructor
public class MovieController {

    private final MovieRankService movieRankService;

    private String beforeResult;

    // @Mapping 에서는 produces와 conumes이 존재
    // 이것드은 JSON을 사용하기 위한 것.
    @GetMapping(value = "/getMovies", produces = "application/json")
    @ResponseBody
    public String getData() throws Exception {
        log.info("도착햇나요");

        if(beforeResult != null){
            return beforeResult;
        }

        beforeResult = movieRankService.getMovieRank();

        return beforeResult;
    }

}
