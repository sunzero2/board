package com.demo.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class BoardController {

    @GetMapping("boards")
    public String getBoards() {
        return "boards";
    }
}
