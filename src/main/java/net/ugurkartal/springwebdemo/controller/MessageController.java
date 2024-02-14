package net.ugurkartal.springwebdemo.controller;

import net.ugurkartal.springwebdemo.Message;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    List<Message> messages = new ArrayList<>();

    public MessageController() {
        messages.add(Message.builder().id("1").name("Ugur").message("Hello, World!").build());
        messages.add(Message.builder().id("2").name("Markus").message("Hello, Java!").build());
        messages.add(Message.builder().id("3").name("Betul").message("Hello, Spring!").build());
    }

    @GetMapping
    public List<Message> getAllMessages(){
        return messages;
    }

    @PostMapping
    public Message addMessage (@RequestBody Message message){
        messages.add(message);
        return message;
    }

    @DeleteMapping("/{id}")
    public String deleteByIdMessage(@PathVariable String id){
        messages.stream().filter(m -> m.getId().equals(id)).findFirst().ifPresent(messages::remove);
        return "Deleted: " + id;
    }
}