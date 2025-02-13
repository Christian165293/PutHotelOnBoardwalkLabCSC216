
package org.example;

public class App {

    public static void main(String[] args) {

        CircularLinkedList<String> monopolyBoard = new CircularLinkedList<>();

        monopolyBoard.append("Go");
        monopolyBoard.append("Mediterranean Avenue");
        monopolyBoard.append("Community Chest");
        monopolyBoard.append("Baltic Avenue");
        monopolyBoard.append("Income Tax");
        monopolyBoard.append("Reading Railroad");
        monopolyBoard.append("Oriental Avenue");
        monopolyBoard.append("Chance");
        monopolyBoard.append("Vermont Avenue");
        monopolyBoard.append("Connecticut Avenue");
        monopolyBoard.append("Jail");
        monopolyBoard.append("St. Charles Place");
        monopolyBoard.append("Electric Company");
        monopolyBoard.append("States Avenue");
        monopolyBoard.append("Virginia Avenue");
        monopolyBoard.append("Pennsylvania Railroad");
        monopolyBoard.append("St. James Place");
        monopolyBoard.append("Community Chest");
        monopolyBoard.append("Tennessee Avenue");
        monopolyBoard.append("New York Avenue");
        monopolyBoard.append("Free Parking");
        monopolyBoard.append("Kentucky Avenue");
        monopolyBoard.append("Chance");
        monopolyBoard.append("Indiana Avenue");
        monopolyBoard.append("Illinois Avenue");
        monopolyBoard.append("B&O Railroad");
        monopolyBoard.append("Atlantic Avenue");
        monopolyBoard.append("Ventnor Avenue");
        monopolyBoard.append("Water Works");
        monopolyBoard.append("Marvin Gardens");
        monopolyBoard.append("Go to Jail");
        monopolyBoard.append("Pacific Avenue");
        monopolyBoard.append("North Carolina Avenue");
        monopolyBoard.append("Community Chest");
        monopolyBoard.append("Pennsylvania Avenue");
        monopolyBoard.append("Short Line");
        monopolyBoard.append("Chance");
        monopolyBoard.append("Park Place");
        monopolyBoard.append("Luxury Tax");
        monopolyBoard.append("Boardwalk");

        for(int i = 0; i < 40; i++) {
            System.out.println(monopolyBoard.current());
            monopolyBoard.step();
        }
System.out.println("\n");
monopolyBoard.printList();
        System.out.println("\n");
        monopolyBoard.doubleDice();
        System.out.println("Landed on: " + monopolyBoard.current());
    }
}
