package JavaProblems;

import java.util.HashMap;
import java.util.Map;
public class CountCharacterOccurencesString {
    public static void main(String[] args) {
        String str = "Goutham Rajanna";
        countOfChars(str);
        duplicateCharsRemoval(str);
    }
        public static void countOfChars(String name){
            Map<Character, Integer> charMap = new HashMap<>();
            for(char c: name.toCharArray())
            {
                if(c!=' ')
                {
                    charMap.put(c,charMap.getOrDefault(c,0)+1);
                }
                System.out.println(charMap);
            }
            System.out.println(charMap);
        }
        public static void duplicateCharsRemoval(String name){
        Map<Character,Integer> characterIntegerMap=new HashMap<>();
        for (char c: name.toCharArray())
        {
            if (c != ' ') characterIntegerMap.put(c,characterIntegerMap.getOrDefault(c,0)+1);

        }
            StringBuilder sb= new StringBuilder();
            for (char c: name.toCharArray())
            {
                if (characterIntegerMap.containsKey(c)&&characterIntegerMap.get(c)==1) sb.append(c);
                System.out.println(sb.toString());
            }
        }
    }



























