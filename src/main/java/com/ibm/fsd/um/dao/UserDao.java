package com.ibm.fsd.um.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.fsd.um.entity.User;


@Repository
public interface UserDao extends JpaRepository<User, String> {
    public User findByUsername(String username);
}
