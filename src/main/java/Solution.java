import java.util.*;

public class Solution {
    public String sortVowels(String s) {
        char[] chars = s.toCharArray();
        List<Integer> indexes = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        Set<Character> vowels = new HashSet<>(List.of('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'));
        for (int i = 0; i < chars.length; i++) {
            if(vowels.contains(chars[i])){
                indexes.add(i);
                characters.add(chars[i]);
            }
        }
        Collections.sort(characters);
        for (int i = 0; i < indexes.size(); i++) {
            chars[ indexes.get(i)] = characters.get(i);
        }
        return String.valueOf(chars);
    }
}
