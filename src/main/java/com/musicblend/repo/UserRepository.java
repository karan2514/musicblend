package com.musicblend.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.musicblend.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
