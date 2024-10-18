package Task3;

import Task2.Cafe;

import java.util.ArrayList;

//3.g A class named Main
public class Main {

    public static void main(String[] args) {

        //3.g Created a new ArrayList named rooms
        ArrayList<Room> rooms = new ArrayList<Room>();

        //3.g Instantiate 3 different rooms
        Room room1 = new Room(2,4);
        Room room2= new Room(4,8);
        Room room3 = new Room(8,16);

        //3.h Added the three rooms to a collection named roomList
        ArrayList<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        //3.i Instantiated a new building
        Building building1  = new Building(roomList, 2);


        System.out.println(countLampsInBuilding(building1));

        System.out.println(countWindowsInBuilding(building1));

        System.out.println(countRoomsInBuilding(building1));

        System.out.println(isNormal(building1));



    }

    //3.j A method that takes an object of type Building and returns the total number of lamps in the entire building
    public static int countLampsInBuilding(Building building){
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps(); // Add lamps from the current room
        }
        return totalLamps;
        }

    //3.j A method that takes an object of type Building and returns the total number of windows in the entire building
    public static int countWindowsInBuilding(Building building){
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows(); // Add lamps from the current room
        }
        return totalWindows;
    }

    //3.j A method that takes an object of type Building and returns the total number of rooms in the entire building
    public static int countRoomsInBuilding(Building building){
        return building.getRooms().size();
    }

    //3.k A method that takes an object of type building as argument. The method returns true if the building number of floors is greater than or equal to its number of rooms. If not it should return false.
    public static boolean isNormal(Building building){
        if (building.getNumberOfFloors() >= countRoomsInBuilding(building)){
            return true;
        } else {
            return false;
        }
    }
    }
