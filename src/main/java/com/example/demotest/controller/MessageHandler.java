package com.example.demotest.controller;

import com.example.demotest.entity.Articles;
import com.example.demotest.entity.Message;
import com.example.demotest.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageHandler {
    @Autowired
    private MessageRepository messageRepository;
    @GetMapping("/findAll/{page}/{size}")
    public Page<Message> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page,size);
        return messageRepository.findAll(request);
    }
    @PostMapping("/save")
    public String save(@RequestBody  Message message){
        Message result=messageRepository.save(message);
        if(result !=null){
            return "success";
        }
        else {
            return "error";
        }
    }
    @GetMapping("/findById/{nicknameid}")
    public Message findById(@PathVariable("nicknameid") Integer nicknameid){
        return messageRepository.findById(nicknameid).get();

    }
    @PutMapping("/update")
    public String update(@RequestBody Message message){
        Message result=messageRepository.save(message);
        if(result !=null){
            return "success";
        }
        else {
            return "error";
        }

    }
    @DeleteMapping("/deleteById/{nicknameid}")
    public void deleteById(@PathVariable("nicknameid") Integer nicknameid){
        messageRepository.deleteById(nicknameid);

    }

}
