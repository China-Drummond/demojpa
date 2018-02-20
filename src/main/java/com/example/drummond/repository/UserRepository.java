package com.example.drummond.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.drummond.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
