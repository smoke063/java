import java.util.HashMap;
import java.util.Map;

public class Hw_5_2 {

    public Map<String, Integer> countWordInStr(String str, String word) {

        String[] words = str.toLowerCase()
                .trim()
                .replaceAll("[!\"#$%&'()*+,-./:;-<=>?@\\[\\]^_`{|}~]", "")
                .split("\\s*(\\s|,|!|\\.)\\s*");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : words) {
            if (word.toLowerCase().equals(s)) {
                Integer count = map.getOrDefault(s, 1);
                map.put(word, ++count);
            }
        }
        System.out.println(map);
        
        return map;
    }
}
