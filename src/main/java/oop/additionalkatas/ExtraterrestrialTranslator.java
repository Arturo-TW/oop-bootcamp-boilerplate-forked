package oop.additionalkatas;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class ExtraterrestrialTranslator {
   public enum Languages {
        SPANISH,
        MARTIAN
    }

    private static BiMap<String, String> alphabetMap = HashBiMap.create();

    static {
        alphabetMap.put("e", "€");
        alphabetMap.put("s", "$");
        alphabetMap.put("j", "£");
        alphabetMap.put("y", "¥");
        alphabetMap.put("p", "₽");
        alphabetMap.put("m", "₼");
        alphabetMap.put("t", "₸");
        alphabetMap.put("a", "₳");
        alphabetMap.put("c", "₵");
        alphabetMap.put("f", "₣");
        alphabetMap.put("g", "₲");
        alphabetMap.put("n", "₪");
        alphabetMap.put("hola", "$₳ludo$");
        alphabetMap.put("adios", "h₳$₸₳ ₽ro₪₸o");
    }

    public static String translateSpanishToMartian(String message, Languages language) {
        StringBuilder response = new StringBuilder();
        String[] words = message.split(" ");
        for (String word : words) {
            if(language.equals(Languages.SPANISH)){
                if(alphabetMap.containsKey(word.replace(",", ""))) {
                    response.append(alphabetMap.get(word)).append(" "); //todo: fix this
                }
            }
        }

        return response.toString();
    }
}
