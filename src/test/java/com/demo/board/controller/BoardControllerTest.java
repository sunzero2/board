package com.demo.board.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardControllerTest {
    @Autowired
    BoardController boardController;

    @Test
    public void shouldReturnDefaultMessage() {
        String returnMessage = boardController.getBoards();
        Assertions.assertEquals("boards", returnMessage);
    }
}
