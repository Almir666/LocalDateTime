package com.almir.localdatetimeex.event;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class EventTime {
    @JsonProperty("time")
    @JsonFormat(pattern = "yyyy:MM:dd:'##':HH:mm:ss:SS",shape = JsonFormat.Shape.STRING, locale = "ru_RU", timezone = "UTC")
    private LocalDateTime time;

    public EventTime(LocalDateTime time) {
        this.time = time;
    }
}
