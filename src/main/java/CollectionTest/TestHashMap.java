package CollectionTest;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static <K,V> HashMap<V,K> changeKeyToValue(Map<K,V> map){
        HashMap<V,K> rev = new HashMap<>();
        map.entrySet().stream().forEach(e->rev.put(e.getValue(),e.getKey()));
        return rev;
    }
}
