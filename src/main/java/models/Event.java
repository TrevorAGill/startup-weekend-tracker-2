package models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Event {
    int id;
    private String name;
    private String description;
    private ArrayList<Attendee> allAttendees;
    private static ArrayList<Event> allEvents = new ArrayList<Event>();
    private static int eventListSize;

    //Constructor
    public Event(String name,String description){
        this.name = name;
        this.description = description;
        this.allAttendees = new ArrayList<Attendee>();
        eventListSize++;
        this.id = eventListSize;
        allEvents.add(this);
    }

    public static Event createNewEvent(){
//        ArrayList<Attendee> allAttendees = new ArrayList<Attendee>();
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

    public Attendee findAttendeeById(int attendeeId) {
        Attendee foundAttendee = null;
        for (Attendee thisone : allAttendees) {
            if (thisone.getId() == (attendeeId))
                foundAttendee = thisone;
        }
        return foundAttendee;
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

    public ArrayList<Attendee> getAllAttendees() {
        return allAttendees;
    }

    public void setAllAttendees(Attendee addToEvent) {
        int thisID = addToEvent.getId();
        Attendee thisAttendee = findAttendeeById(thisID);
        allAttendees.add(thisAttendee);
    }

    public static ArrayList<Event> getAllEvents() {
        return allEvents;
    }

    public static void setAllEvents(ArrayList<Event> allEvents) {
        Event.allEvents = allEvents;
    }
}
