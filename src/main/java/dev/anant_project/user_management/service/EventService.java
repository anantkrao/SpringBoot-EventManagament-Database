package dev.anant_project.user_management.service;

import dev.anant_project.user_management.data.Event;
import dev.anant_project.user_management.data.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;
    public List<Event> getAllEvent(){
        List<Event> Event = eventRepository.findAll();
        return Event;
    }
    public Event createEvent(Event event){
        return eventRepository.save(event);
    }
    public Event updateEvent(Event event){
        return eventRepository.save(event);
    }
    public void deleteEventById(String id){
        eventRepository.deleteById(id);
    }
}
