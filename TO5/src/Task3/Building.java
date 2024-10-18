package Task3;

import java.util.ArrayList;

//3.d A class called Building
public class Building {

    //3.d Two instance variable, one of datatype ArrayList<Room> named rooms, another of datatype int named numberOfFloors
    private ArrayList<Room> rooms;
    private int numberOfFloors;


    //3.e Constructor that populates all fields
    public Building(ArrayList<Room> rooms, int numberOfFloors) {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    public ArrayList<Room> getRooms() {
        return rooms; // Return the list of rooms
    }

    //Getters and Setters for the instance variables
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms; // Set the new list of rooms
    }

    public void setNumberOfFloors(int numberOfFlors) {
        this.numberOfFloors = numberOfFlors;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Building with " + numberOfFloors + " floors and " + rooms.size() + " rooms:\n");
        for (Room room : rooms) {
            sb.append(room.toString()).append("\n");
        }
        return sb.toString();
    }
}
