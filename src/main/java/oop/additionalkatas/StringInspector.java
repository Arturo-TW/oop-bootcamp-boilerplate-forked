package oop.additionalkatas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringInspector {

    public static List<String> findDuplicates(String[] input) {
        Map<String, Integer> seenValueMap = new HashMap<>();

        Arrays.stream(input).forEach(i ->  {
            if(seenValueMap.containsKey(i)){
                var currentCounter = seenValueMap.get(i);
                seenValueMap.put(i, currentCounter + 1);
            } else {
                seenValueMap.put(i, 1);
            }
        });

        return seenValueMap
                .entrySet()
                .stream()
                .filter( entry -> entry.getValue() > 1)
                .map( value -> value.getKey())
                .collect(Collectors.toList());
    }
}
