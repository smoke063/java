import java.util.HashMap;
import java.util.Map;

public class Hw_5_1 {
    public Map<String, Integer> countWordsInStr(String str) {

        String[] words = str.toLowerCase()
                .trim()
                .replaceAll("[!\"#$%&'()*+,-./:;-<=>?@\\[\\]^_`{|}~]", "")
                .split("\\s*(\\s|,|!|\\.)\\s*");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : words) {
            Integer count = map.getOrDefault(s, 0);
            map.put(s, ++count);
        }

        System.out.println(map);

        return map;
    }
}
