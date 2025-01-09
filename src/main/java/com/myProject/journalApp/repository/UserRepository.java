package com.myProject.journalApp.repository;

import com.myProject.journalApp.entity.JournalEntry;
import com.myProject.journalApp.entity.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <Users, ObjectId> {
    Users findByUserName(String username);
    void deleteByUserName(String name);
}
