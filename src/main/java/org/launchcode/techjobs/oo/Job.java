package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    //Constructor to initialize a Unique ID
    public Job() {
        id = nextId;
        nextId++;
    }

    // Constructor to initialize all fields and call the default constructor to initialize ID
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // Call the default constructor to initialize the id field.
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // Custom equals method to consider two Job objects "equal" when their id fields match
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    // Custom hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Custom toString method
    @Override
    public String toString() {
        return String.format(
                "\nID: %d\nName: %s\nEmployer: %s\nLocation: %s\nPosition Type: %s\nCore Competency: %s\n",
                id,
                name != null && !name.isEmpty() ? name : "Data not available",
                employer != null && !employer.getValue().isEmpty() ? employer.getValue() : "Data not available",
                location != null && !location.getValue().isEmpty() ? location.getValue() : "Data not available",
                positionType != null && !positionType.getValue().isEmpty() ? positionType.getValue() : "Data not available",
                coreCompetency != null && !coreCompetency.getValue().isEmpty() ? coreCompetency.getValue() : "Data not available"
        );
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    // Getters for each field EXCEPT nextId
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    // Setters for each field EXCEPT nextID and id
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

