package dev.anant_project.user_management.controller;

import dev.anant_project.user_management.data.Event;
import dev.anant_project.user_management.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class EventController {
    @Autowired
    private EventService eventService;
    @GetMapping(path="/events")
    public List<Event> getAllEvents(){
        return eventService.getAllEvent();
    }
    @PostMapping(path="/events")
    public Event createEvent(@RequestBody Event event){
        return eventService.createEvent(event);
    }
    @PutMapping(path="/events/{id}")
    public Event updateEvent(@RequestBody Event event, @PathVariable(name = "id") String id){
        event.setId(id);
        eventService.updateEvent(event);
        return event;
    }
    @DeleteMapping(path="/events/{id}")
    public void deleteEventById(@PathVariable String id){
        eventService.deleteEventById(id);
    }
}