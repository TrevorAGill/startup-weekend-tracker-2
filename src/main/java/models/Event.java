package models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Event {
    int id;
    private String name;
    private String description;
    private static ArrayList<Attendee> allAttendees = new ArrayList<Attendee>();
    private static ArrayList<Event> allEvents = new ArrayList<Event>();
    private static int eventListSize;

    //Constructor
    public Event(String name,String description){
        this.name = name;
        this.description = description;
        this.allAttendees = allAttendees;
        eventListSize++;
        this.id = eventListSize;
        allEvents.add(this);
    }

    public static Event createNewEvent(){
        Event newEvent = new Event("Test Event","Test Description");
        return newEvent;
    }

    public static ArrayList<Event> clearAllEvents(ArrayList<Event> allEvents){
        allEvents.clear();
        return allEvents;
    }

    public static ArrayList<Attendee> clearAllAttendees(ArrayList<Attendee> allAttendees){
        allAttendees.clear();
        return allAttendees;
    }

    public static Event findById(int id){
        for(Event event : allEvents){
            if(id == event.id){
                return event;
            }
        }
        return null;
    }

    public void updateEvent(String newName, String newDescription){
        this.name = newName;
        this.description = newDescription;
    }

    //Getters + Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Attendee> getAllAttendees() {
        return allAttendees;
    }

    public static void setAllAttendees(ArrayList<Attendee> allAttendees) {
        Event.allAttendees = allAttendees;
    }

    public static ArrayList<Event> getAllEvents() {
        return allEvents;
    }

    public static void setAllEvents(ArrayList<Event> allEvents) {
        Event.allEvents = allEvents;
    }
}
