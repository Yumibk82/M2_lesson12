import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;
public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Hang",38);
        hashMap.put("Tuan",38);
        hashMap.put("Minh",11);
        hashMap.put("Linh",5);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Hang",38);
        linkedHashMap.put("Tuan",38);
        linkedHashMap.put("Minh",11);
        linkedHashMap.put("Linh",5);
        System.out.println("The age for "+ "Minh "+linkedHashMap.get("Minh"));
    }
}
