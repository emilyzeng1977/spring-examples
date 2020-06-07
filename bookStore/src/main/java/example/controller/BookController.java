package example.controller;

import example.model.Book;
import example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private IBookService bookService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/books1")
    public List<Book> getCities() {

        List<Book> cities = bookService.findAll();

        return cities;
    }
}
