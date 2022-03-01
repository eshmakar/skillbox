package com.test;

import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.util.Date;

public class TestAiroport {
    public static void main(String[] args) {
//        Airport instance = Airport.getInstance();
//        System.err.println("__________________________");
//        System.out.println(instance.getTerminals());
//        Set<String> sets = new TreeSet<>();
//        instance.getAllAircrafts()
//                .forEach(e-> sets.add(e.getModel()));
//        sets.forEach(System.out::println);

        Aircraft aircraft = new Aircraft("new Model");
        System.out.println(aircraft.getModel());

        Flight flight = new Flight("098", null, new Date(),new Aircraft("second model"));
        System.out.println(flight);

        Terminal terminal = new Terminal("One");
        System.out.println(terminal.getFlights());
        System.out.println(terminal.getParkedAircrafts());


    }
}
