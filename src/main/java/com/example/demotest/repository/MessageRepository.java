package com.example.demotest.repository;

import com.example.demotest.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Integer> {

}
