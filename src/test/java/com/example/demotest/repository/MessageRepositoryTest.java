package com.example.demotest.repository;

import com.example.demotest.entity.Message;
import org.aspectj.apache.bcel.Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MessageRepositoryTest {
    @Autowired
    private MessageRepository messageRepository;
    @Test
    void findAll(){
        System.out.println(messageRepository.findAll());
    }
    @Test
    void save(){
        Message message=new Message();
        message.setComment("11111");
        message.setNickname("zs");
        Message message1= messageRepository.save(message);
        System.out.println(message1);
    }

}