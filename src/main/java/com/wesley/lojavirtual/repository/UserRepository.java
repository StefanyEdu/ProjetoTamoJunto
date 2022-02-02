package com.wesley.lojavirtual.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.lojavirtual.model.User;

public interface UserRepository  extends JpaRepository<User, UUID> {
	
	
	//Exemplo de como pode chamar os find -Ele representa tua interface
	User findByNikename(String nikename) throws DataAccessException ;
	
	
	
}
