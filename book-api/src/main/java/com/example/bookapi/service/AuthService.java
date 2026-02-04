package com.example.bookapi.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    // super simple demo token
    private static final String VALID_TOKEN = "secret123";

    public boolean isValid(String header) {

        if (header == null || !header.startsWith("Bearer ")) {
            return false;
        }

        String token = header.substring(7);

        return VALID_TOKEN.equals(token);
    }
}
