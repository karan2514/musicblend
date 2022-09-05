//package com.musicblend.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.musicblend.exception.RecordNotFoundException;
//import com.musicblend.model.User;
//import com.musicblend.repo.UserRepository;
//
//@Service
//public class UserService {
//	
//	 @Autowired
//	 private UserRepository repository;
//	 
//	 /*
//	  * TODO: Get the List of Shops
//	  */
//	 public List<User> getAllUsers(){
//	  List<User> list =  (List<User>)repository.findAll();
//	  return list;
//	 }
//	 /*
//	  * TODO: Get Shop by Id.
//	  */
//	 public User getUserById(Integer id) throws RecordNotFoundException {
//	  
//	  Optional<User> user = repository.findById(id);
//	  if(user!=null) {
//	   return user.get();
//	  }
//	  else
//	  {
//	   throw new RecordNotFoundException("Not found");
//	  }
//	 }
//	 /*
//	  * TODO: Save into db
//	  */
//	 public User saveOrUpdateUser(User user) {
//	  if(user.getId() == null) {
//	  return repository.save(user);}
//	  else {
//	   Optional<User> sOptional = repository.findById(user.getId());
//	   if(sOptional!=null) {
//	    User user2 = sOptional.get();
//	    user2.setFirstname(user.getFirstname());
//	    user2.setLastname(user.getLastname());
//	    user2.setEmail(user.getEmail());
//	    user2.setPassword(user.getPassword());
//	    user2.setUsername(user.getUsername());
//	    user2.setPassword(user.getPassword());
//	    user2 = repository.save(user2);
//	    return user2;
//	   }
//	   else {
//		 user = repository.save(user);
//	    return user;
//	   
//	  }
//	 }
//	}
//	 public void deleteUser(Integer id) {  
//	  repository.deleteById(id);
//	 }
//
//}
