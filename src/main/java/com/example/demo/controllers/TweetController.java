package com.example.demo.controllers;

import com.example.demo.models.Tweet;
import com.example.demo.repositories.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tweets")
@CrossOrigin(origins = "*")
public class TweetController {

    @Autowired
    private TweetRepository tweetRepository;

    @GetMapping
    public List<Tweet> getAll() {
        return tweetRepository.findAll();
    }

    @PostMapping
    public Tweet save(@RequestBody Tweet tweet) {
        return tweetRepository.save(tweet);
    }
}
