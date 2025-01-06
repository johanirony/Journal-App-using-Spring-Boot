package com.myProject.journalApp.controllers;


import com.myProject.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerv2 {

    @GetMapping("/abc")
    public List<JournalEntry> getAll(){
        return null;
    }
    @PostMapping("/abc")
    public boolean createEntry(@RequestBody JournalEntry myEntry){

        return true;
    }
    @GetMapping("/abc/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
        return null;
    }
    @DeleteMapping ("/abc/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId){

        return null;
    }
    @PutMapping ("/abc/{Id}")
    public JournalEntry updateJournalEntryById(@PathVariable Long Id,@RequestBody JournalEntry entry){
        return null;
    }


}
