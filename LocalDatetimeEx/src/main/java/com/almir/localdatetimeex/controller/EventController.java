package com.almir.localdatetimeex.controller;

import com.almir.localdatetimeex.event.EventTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/event")
public class EventController {
    @GetMapping
    public EventTime getEventTime() {
        return new EventTime(LocalDateTime.now());
    }
}
