package com.example.demotest.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ArticlesRepositoryTest {
    @Autowired
    private ArticlesRepository articlesRepository;
    @Test
 void findAll(){
        System.out.println(articlesRepository.findAll());
 }
}