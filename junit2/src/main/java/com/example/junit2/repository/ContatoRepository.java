package com.example.junit2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.junit2.model.ContatoModel;


public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}
