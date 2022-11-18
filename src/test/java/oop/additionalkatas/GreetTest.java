package oop.additionalkatas;

import org.testng.annotations.Test;

import java.time.LocalTime;

import static org.testng.Assert.assertEquals;

public class GreetTest {

    private Greeter greeter = new Greeter();
    private String name = "Hidelbrando";
    private String expectedOutputMorning = "Good morning Hidelbrando.";
    private String expectedOutputEvening = "Good evening Hidelbrando.";
    private String expectedOutputNight = "Good night Hidelbrando.";
    private String expectedOutput = "Hello Hidelbrando.";

    @Test
    public void itShouldGreet() {
        LocalTime time = LocalTime.now();
        if(time.isAfter(LocalTime.of(6,1)) && time.isBefore(LocalTime.of(12,0))) {
            assertEquals(greeter.greet(name), expectedOutputMorning);
        } else if (time.isAfter(LocalTime.of(18,0)) && time.isBefore(LocalTime.of(22,0))) {
            assertEquals(greeter.greet(name), expectedOutputEvening);
        } else if (time.isAfter(LocalTime.of(22,1)) && time.isBefore(LocalTime.of(6,0))) {
            assertEquals(greeter.greet(name), expectedOutputNight);
        } else {
            assertEquals(greeter.greet(name), expectedOutput);
            assertEquals(greeter.greet("    " + name + "   "), expectedOutput);
            assertEquals(greeter.greet("hidelbrando"), expectedOutput);
        }
    }
}
