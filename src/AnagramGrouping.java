import java.util.*;

public class AnagramGrouping{
        public static List<List<String>> groupAnagrams(String[] strings){
            Map<String, List<String>> anagramGropus = new HashMap<>();

            for (String string : strings) {
                char[] charArray = string.toCharArray();
                Arrays.sort(charArray);
                String sortedString = new String(charArray);

                if(anagramGropus.containsKey(sortedString)){
                    anagramGropus.get(sortedString).add(string);
                } else {
                    List<String> group = new ArrayList<>();
                    group.add(string);
                    anagramGropus.put(sortedString, group);
                }
                
            }

            return new ArrayList<>(anagramGropus.values());
            
        }

        public static void main(String[] args) {
            String[] strings = {"cook", "save", "taste", "aves", "vase", "state", "map"};
            List<List<String>> anagramGroups = groupAnagrams(strings);

            for (List<String> group : anagramGroups) {
                System.out.println(group);
            }
        }

    }