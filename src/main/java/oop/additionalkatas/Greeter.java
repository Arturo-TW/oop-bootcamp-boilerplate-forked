package oop.additionalkatas;

import java.time.LocalTime;

public class Greeter {

    public String greet(String name) {
        StringBuilder outputBuilder = new StringBuilder();
        var trimmedName = name.trim();
        var firstLetter = trimmedName.substring(0,1).toUpperCase();
        var restOfName = trimmedName.substring(1);
        var greetingBegin = getGreetingBasedInTime();
        return outputBuilder.append(greetingBegin)
                .append(firstLetter)
                .append(restOfName)
                .append(".")
                .toString();
    }

    private String getGreetingBasedInTime() {
        LocalTime time = LocalTime.now();
        var greeting = "Hello ";
        if(time.isAfter(LocalTime.of(6,0)) && time.isBefore(LocalTime.of(12,0))) {
            greeting = "Good morning ";
        } else if(time.isAfter(LocalTime.of(18,0)) && time.isBefore(LocalTime.of(22,0))) {
            greeting = "Good evening ";
        } else if(time.isAfter(LocalTime.of(22,1)) && time.isBefore(LocalTime.of(6,1))) {
            greeting = "Good night ";
        }
        return greeting;
    }
}
