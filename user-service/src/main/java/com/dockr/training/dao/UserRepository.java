package com.dockr.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dockr.training.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
