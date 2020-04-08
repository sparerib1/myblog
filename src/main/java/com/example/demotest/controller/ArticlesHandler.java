package com.example.demotest.controller;

import com.example.demotest.entity.Articles;
import com.example.demotest.entity.Message;
import com.example.demotest.repository.ArticlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticlesHandler {
    @Autowired
    private ArticlesRepository articlesRepository;
@GetMapping("/findAll")
    public List<Articles> findAll(){
    return articlesRepository.findAll();

    }
    @PostMapping("/save")
    public String save(@RequestBody Articles articles){
    Articles result=   articlesRepository.save(articles);
    if(result !=null){
        return "success";
    }
    else {
        return "error";
    }
    }
    @GetMapping("/findAll/{page}/{size}")
    public Page<Articles> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page,size);
        return articlesRepository.findAll(request);
    }
    @PutMapping("/update")
    public String update(@RequestBody Articles articles){
    Articles result=articlesRepository.save(articles);
    if(result !=null){
        return "success";
    }
    else {
        return "error";
    }

    }
    @GetMapping("/findById/{id}")
    public Articles findById(@PathVariable("id") Integer id){
        return articlesRepository.findById(id).get();
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        articlesRepository.deleteById(id);

    }
}
