package dev.anant_project.user_management.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;@Document(collection = "events")
public class Event {    @Id
private String id;
    private String event_type;
    private String event_location;
    private String event_date;
    private String total_members;
    private String event_budget;
    private String extra_description;
    public Event(String id, String event_type, String event_location, String event_date, String total_members,String event_budget,String extra_description) {
        this.id = id;
        this.event_type = event_type;
        this.event_location = event_location;
        this.event_date = event_date;
        this.total_members = total_members;
        this.event_budget = event_budget;
        this.extra_description= extra_description;

    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEvent_type() {
        return event_type;
    }
    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }
    public String getEvent_location() {
        return event_location;
    }
    public void setEvent_location(String event_location) {
        this.event_location = event_location;
    }
    public String getEvent_date() {
        return event_date;
    }
    public void setEvent_date(String event_date) {
        this.event_date = event_date;
    }
    public String getTotal_members() {
        return total_members;
    }
    public void setTotal_members(String total_members) {
        this.total_members = total_members;
    }
    public String getEvent_budget(){
        return event_budget;
    }
    public void setEvent_budget(String event_budget){
        this.event_budget=event_budget;
    }
    public String getExtra_description(){
        return extra_description;
    }
    public void setExtra_description(String extra_description){
        this.extra_description=extra_description;
    }
}