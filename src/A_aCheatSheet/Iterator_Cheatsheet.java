package A_aCheatSheet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterator_Cheatsheet {
    HashMap<Integer, String> hashmap;
    public Iterator_Cheatsheet(HashMap<Integer, String> hashmap) {
        this.hashmap = hashmap;
    }

    //DECLARING AND INITIALIZING AN ITERATOR
    Iterator<Map.Entry<Integer, String>> iterator = hashmap.entrySet().iterator(); //Usually within the scope of a method

    // PRINTING A HASHMAP USING ITERATOR
    public void printHashMapUsingIterator(HashMap<Integer, String> hashMap) {
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    // USING ITERATOR: FIND A HASHMAP ENTRY WITH THE HIGHEST KEY
    public Map.Entry<Integer, String> findEntryWithHighestKeyUsingIterator(HashMap<Integer, String> hashMap) {
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        Map.Entry<Integer, String> entryWithHighestKey = null;
        Integer highestKey = null;

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();

            if (highestKey == null || key > highestKey) {
                highestKey = key;
                entryWithHighestKey = entry;
            }
        }
        return entryWithHighestKey;
    }

    //REMOVE A PARTICULAR ENTRY IN HASHMAP USING ITERATOR
    public void removeEntryByKey(HashMap<Integer, String> hashMap, int keyToRemove) {
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (entry.getKey() == keyToRemove) {
                iterator.remove(); // Remove the entry with the specified key
            }
        }
    }

    //REMOVE THE LAST ENTRY IN HASHMAP USING ITERATOR
    public void removeLastEntry(HashMap<Integer, String> hashMap) {
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        Map.Entry<Integer, String> lastEntry = null;

        while (iterator.hasNext()) {
            lastEntry = iterator.next();
        }

        if (lastEntry != null) {
            hashMap.remove(lastEntry.getKey());
        }
    }

    //REMOVE THE LAST ENTRY IN A HASHMAP USING ITERATOR
    public void removeFirstEntry(HashMap<Integer, String> hashMap) {
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();

        if (iterator.hasNext()) {
            Map.Entry<Integer, String> firstEntry = iterator.next();
            iterator.remove();
        }
    }
}