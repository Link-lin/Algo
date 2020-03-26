import java.util.*;

class LRUCache {

    int size = 0;
    int used = 0;
    HashMap<Integer, Integer> map;
    List<Integer> list;

    public LRUCache(int capacity) {
        size = capacity;
        list = new LinkedList<>();
        map = new HashMap<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            // 调整lru
            int s = list.remove(list.indexOf(key));
            list.add(s);
            return map.get(key);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
        System.out.println();
        return -1;
    }

    public void put(int key, int value) {
        if (used + 1 > size) {
            if (this.get(key) != -1) {
                int lru = list.remove(0);
                map.remove(lru);
                used--;
            }
        }
        map.put(key, value);
        list.add(key);
        used++;
    }
}