package org.example.city_events.controllers;

import org.example.city_events.models.Event;
import org.example.city_events.services.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/events")
public class CityEventsController {

    private final EventService eventService;

    public CityEventsController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getEvents() {
        return eventService.getEvents();
    }

    @GetMapping("/city/{city}")
    public List<Event> getByCity(@PathVariable String city) {
        return eventService.getEventsByCity(city);
    }

}
