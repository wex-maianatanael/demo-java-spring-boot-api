package com.example.api.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
    public MessageResponse sayHello(@RequestParam(defaultValue = "world") String name) {
        return new MessageResponse("Hello " + name + "!");
    }

    public static class MessageResponse{
        private String message;

        public MessageResponse(String message){
            this.message = message;
        }

        public String getMessage(){
            return message;
        }

        public void setMessage(String message){
            this.message = message;
        }
    }
}
