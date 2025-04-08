package com.example.consumingrest;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeService {
    private final RestTemplate restTemplate;

    public JokeService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Joke getRandomJoke() {
        return restTemplate.getForObject("https://v2.jokeapi.dev/joke/Any", Joke.class);
    }
}
