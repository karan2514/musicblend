//
//package com.musicblend.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.musicblend.exception.RecordNotFoundException;
//import com.musicblend.model.User;
//import com.musicblend.service.UserService;
//
//@Controller
//public class UserController {
//
//	@Autowired
//	 private UserService service;
//	 @GetMapping("/users")
//	 public String home(User user, Model model) {
//	  List<User> list = service.getAllUsers();
//	  model.addAttribute("list", list);
//	  return "Users";
//	 }
////	 @GetMapping("/registration")
////	 public String showAddForm(User user, Model model) {
////		 //model.addAttribute("user", new User()); 
////	  return "registration";
////	 }
//	 @PostMapping("/save")
//	 public String create(User user, Model model) {
//	  service.saveOrUpdateUser(user);
//	  return "SuccessRegistration";
//	 }
//	 @RequestMapping(path = { "/update","/update/{id}"})
//	 public String update(Model model,@PathVariable("id") Integer id) throws RecordNotFoundException {
//	  if(id!=null) {
//	   User user2 = service.getUserById(id);
//	   model.addAttribute("user", user2);
//	  }else {
//	   model.addAttribute("user", new User());
//	  }
//	  return "Users";
//	 }
//	 @RequestMapping(path = { "/delete/{id}"})
//	 public String delete(Model model, @PathVariable("id") Integer id) {
//	  service.deleteUser(id);
//	  return "redirect:/";
//	 }
//}
