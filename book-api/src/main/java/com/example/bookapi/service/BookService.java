package com.example.bookapi.service;

import com.example.bookapi.model.Book;
import com.example.bookapi.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository repo;
    private final AuthService auth;

    public BookService(BookRepository repo, AuthService auth) {
        this.repo = repo;
        this.auth = auth;
    }

    public Book getBook(Long id, String token) {

        // 1️⃣ Authentication
        if (!auth.isValid(token)) {
            throw new RuntimeException("Unauthorized");
        }

        // 2️⃣ Validation
        if (id <= 0) {
            throw new RuntimeException("Invalid ID");
        }

        // 3️⃣ DB query
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }
}
