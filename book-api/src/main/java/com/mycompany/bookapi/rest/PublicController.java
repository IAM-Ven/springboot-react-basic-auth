package com.mycompany.bookapi.rest;

import com.mycompany.bookapi.service.BookService;
import com.mycompany.bookapi.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

    private final UserService userService;
    private final BookService bookService;

    public PublicController(UserService userService, BookService bookService) {
        this.userService = userService;
        this.bookService = bookService;
    }

    @GetMapping("/numberOfUsers")
    public Integer getNumberOfUsers() {
        return userService.getUsers().size();
    }

    @GetMapping("/numberOfBooks")
    public Integer getNumberOfBooks() {
        return bookService.getBooks().size();
    }

}
