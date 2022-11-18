package oop.additionalkatas;

import java.util.HashMap;
import java.util.Map;

public class NatoAlphabet {

    private static Map<Character, String> alphabetMap = new HashMap<>(){{
        put('a', "alpha");
        put('b', "bravo");
        put('c', "charlie");
        put('d', "delta");
        put('e', "echo");
        put('f', "foxtrot");
        put('g', "golf");
        put('h', "hotel");
        put('i', "india");
        put('j', "juliett");
        put('k', "kilo");
        put('l', "lima");
        put('m', "mike");
        put('n', "november");
        put('o', "oscar");
        put('p', "papa");
        put('q', "quebec");
        put('r', "romeo");
        put('s', "sierra");
        put('t', "tango");
        put('u', "uniform");
        put('v', "victor");
        put('w', "whiskey");
        put('x', "xray");
        put('y', "yankee");
        put('z', "zulu");
        put('1', "one");
        put('2', "two");
        put('3', "three");
        put('4', "four");
        put('5', "five");
        put('6', "six");
        put('7', "seven");
        put('8', "eight");
        put('9', "nine");
        put('0', "zero");
        put(' ', "null");
    }};

    public static String encode(String message) {
        validateInput(message.isEmpty());

        StringBuilder encodedMessage = new StringBuilder();
        char[] characters = message.toCharArray();

        for (int i = 0; i < message.length(); i ++) {
            encodeCharacter(encodedMessage, characters[i]);
        }
        return cleanFinalMessage(encodedMessage);
    }

    private static void encodeCharacter(StringBuilder encodedMessage, char character) {
        var currentCharacter = character;
        validateInput(!alphabetMap.containsKey(currentCharacter));

        encodedMessage.append(alphabetMap.get(currentCharacter)).append("-");
    }

    private static String cleanFinalMessage(StringBuilder encodedMessage) {
        var encodedMessageFinal = encodedMessage.toString();
        return encodedMessageFinal.substring(0, encodedMessageFinal.length() - 1);
    }

    public static String decode(String message) {
        StringBuilder decodedMessage = new StringBuilder();
        String[] words = message.split("-");
        for (String word : words) {
            validateInput(!alphabetMap.containsValue(word));

            decodedMessage.append(word.substring(0,1));
        }
        return decodedMessage.toString();
    }

    private static void validateInput(boolean empty) {
        if (empty)
            throw new IllegalArgumentException("Input outside NATO alphabet");
    }
}
