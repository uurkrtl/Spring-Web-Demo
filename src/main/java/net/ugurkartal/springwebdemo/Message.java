package net.ugurkartal.springwebdemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Message {
    private String id;
    private String name;
    private String message;
}