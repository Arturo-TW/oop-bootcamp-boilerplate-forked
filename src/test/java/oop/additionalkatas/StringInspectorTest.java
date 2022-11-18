package oop.additionalkatas;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class StringInspectorTest {

    @Test
    public void itShouldReturnDuplicates() {
        String[] input = new String[]{"a", "c", "a", "a", "d", "e", "c", "w"};
        assertEquals(StringInspector.findDuplicates(input), List.of("a", "c"));
    }
}
