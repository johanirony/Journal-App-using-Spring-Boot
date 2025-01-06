package com.myProject.journalApp.controllers;


import com.myProject.journalApp.JournalApplication;
import com.myProject.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/_journal")
public class JournalEntryController {
    private Map<Long,JournalEntry> journalEntries = new HashMap<>();
    @GetMapping("/abc")
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping("/abc")
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(),myEntry);
        return true;
    }
    @GetMapping("/abc/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
        return journalEntries.get(myId);
    }
    @DeleteMapping ("/abc/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId){
        return journalEntries.remove(myId);
    }
    @PutMapping ("/abc/{Id}")
    public JournalEntry updateJournalEntryById(@PathVariable Long Id,@RequestBody JournalEntry entry){
        return journalEntries.put(Id,entry);
    }


}
