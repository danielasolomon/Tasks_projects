package org.example.city_events.services;

import org.example.city_events.models.Event;
import org.example.city_events.repo.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    public List<Event> getEventsByCity(String city) {
        return eventRepository.findByCityIgnoreCase(city);
    }
}
