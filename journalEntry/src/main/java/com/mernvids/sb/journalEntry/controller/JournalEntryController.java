package com.mernvids.sb.journalEntry.controller;

import com.mernvids.sb.journalEntry.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries=new HashMap<>();

    @GetMapping("/get")
    public List<JournalEntry> getAll()
    {
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping("/post")
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(),myEntry);
        return true;
    }

    @GetMapping("id/{myID}")
    public JournalEntry getByID(@PathVariable Long myID){
        return journalEntries.get(myID);
    }

    @DeleteMapping("id/{myID}")
    public JournalEntry deleteByID(@PathVariable Long myID){
        return journalEntries.remove(myID);
    }

    @PutMapping("id/{id}")
    public JournalEntry updateByID(@PathVariable Long id, @RequestBody JournalEntry myEntry)
    {
        return journalEntries.put(id,myEntry);
    }
    }

