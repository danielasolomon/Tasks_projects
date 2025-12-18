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
//    record Event(Long id, String name, String city){};
//
//    private final List<Event> events = List.of(
//            new Event(1L,"Rock concert", "Bucharest"),
//            new Event(2L,"Painting meetup", "Brasov"),
//            new Event(3L,"Games night", "Medias")
//    );

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


//    @GetMapping("/events")
//    public List<Event> getEvents() {
//        return events;
//    }
//
//    @GetMapping("/events/city/{city}")
//    public List<Event> getByCity(@PathVariable String city) {
//        return events.stream()
//                .filter(e ->e.city.equalsIgnoreCase(city))
//                .toList();
//    }

}
