package com.example.demotest.repository;

import com.example.demotest.entity.Articles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticlesRepository extends JpaRepository<Articles,Integer> {

}
