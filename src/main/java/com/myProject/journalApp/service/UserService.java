package com.myProject.journalApp.service;

import com.myProject.journalApp.entity.JournalEntry;
import com.myProject.journalApp.entity.Users;
import com.myProject.journalApp.repository.JournalEntryRepository;
import com.myProject.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public void saveNewUsers(Users user){userRepository.save(user);
    }
    public void saveEntry(Users user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("USER"));

        userRepository.save(user);
    }
    public List<Users> getAll(){
        return userRepository.findAll();
    }
    public Optional<Users> findById(ObjectId id){
        return userRepository.findById(id);
    }
    public void delete(ObjectId id){
        userRepository.deleteById(id);
    }
    public Users findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
