package com.crud.clients.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.crud.clients.entity.ClientEntity;

@Component
public interface Jpa extends JpaRepository<ClientEntity, Long> {
	
}