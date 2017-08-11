package models;

public class Attendee {
    private String name;
    private String company;
    private String email;
    private int age;
//    Event event;

    public Attendee(String name, String company, String email, int age){
        this.setName(name);
        this.setCompany(company);
        this.setEmail(email);
        this.setAge(age);
//        this.event = event;
        Event.getAllAttendees().add(this);
    }


    //Getters + Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
