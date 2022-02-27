package me.toy.system.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {

    @GetMapping("/")
    public ResponseEntity<Void> health() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }
}
