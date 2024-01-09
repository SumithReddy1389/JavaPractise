package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Amit");
        map.put(2, "Amit");
        map.put(3, "Amit");
        map.put(4, "Amit");

        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" : "+ m.getValue());
        }

        map.putIfAbsent(4,"four");
        map.putIfAbsent(5,"four");
        System.out.println(map);

        map.remove(4);
        map.remove(5, "four");
        System.out.println(map);

        if(!map.containsKey(4)){
            map.put(4, "FOUR");
        }
        System.out.println(map);

        map.replace(1,"one");

        if(map.containsValue("FOUR")){
            System.out.println("Found FOUR");
            map.replace(4,"FOUR","four");
        }
        System.out.println(map);

        map.replaceAll((key,value) -> value.replace("Amit","Sumith").toLowerCase());
        System.out.println(map);

        String v = map.getOrDefault(5, "Not Found");
        System.out.println("Value for key 4: " + v);

        // forEach
        map.forEach((key,value) -> {
//            value.contains("i");
//            System.out.println(value.indexOf("i"));
            int n = value.length();
            String r=" ";
            for(int i =n-1 ; i >= 0 ;--i){
                r += String.valueOf(value.charAt(i));
            }
            System.out.println("Reverse Values:"+r);
        });
        System.out.println(map);

//        entrySet()
//        returns a set view of all the entries of a hashmap
//        Note: The set view means all entries of the hashmap are viewed as a set. Entries are not converted to a set.

        for(Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println(e.getKey() + e.getValue());
        }
        System.out.println("Keys: "+map.keySet());
        System.out.println("Values: "+map.values());

        String returnedValue = map.merge(2, "Reddy", (oldValue, newValue) -> oldValue + " " + newValue);
        System.out.println(2 + returnedValue);
        System.out.println(map);

        String c = map.computeIfAbsent(5, key -> "FIVE");
        System.out.println("Computed: " + c);
        System.out.println(map);

        String c1 = map.computeIfPresent(5, (key,value) -> value = "Present");
        System.out.println("Computed: " + c1);
        System.out.println(map);
    }

}
