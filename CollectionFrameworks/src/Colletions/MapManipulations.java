package Colletions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//displayHashMap(); 
		//displayTreeMap();
		showHashTable();
	}
	
	/**
	 * Values in hash map are not ordered or not sorted
	 * Remove duplicates in the key
	 * 
	 * @return
	 */
	public static Map<Integer, String> displayHashMap(){
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(10, "abc");
		hashMap.put(20, null);
		hashMap.put(30, null);
		hashMap.put(40, "abc");
		hashMap.put(40, "cde");
		hashMap.put(50, "efg");
		
		for (Integer key : hashMap.keySet()) {
			System.out.println(key + ", " + hashMap.get(key));
		}
		return hashMap;
	}
	
	/**
	 * Values in Linked hash map are inserted order or not sorted
	 * Remove duplicates in the key
	 * @return
	 */
	public static Map<Integer, String> displayLinkedHashMap(){
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(10, "abc");
		linkedHashMap.put(20, null);
		linkedHashMap.put(30, null);
		linkedHashMap.put(40, "abc");
		linkedHashMap.put(40, "cde");
		linkedHashMap.put(50, "efg");
		
		for (Integer key : linkedHashMap.keySet()) {
			System.out.println(key + ", " + linkedHashMap.get(key));
		}
		return linkedHashMap;
	}
	
	/**
	 * Sort according to the key. Remove duplicates of the key 
	 */
    public static void displayTreeMap(){
		
		SortedMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(10, "abc");
		treeMap.put(20, null);
		treeMap.put(30, null);
		treeMap.put(40, "abc");
		treeMap.put(40, "cde");
		treeMap.put(50, "efg");
		treeMap.put(50, "fgh");
		
		for (Map.Entry<Integer, String> mapEntry : treeMap.entrySet()) {
			System.out.println(mapEntry.getKey() + ", " + mapEntry.getValue());
		}
	}
    
    /**
     * Not ordered and not sorted but Thread safe 
     */
    public static void showHashTable(){
    	
    	Map<String, String> hashTable = new Hashtable<String, String>();
    	hashTable.put("key1", "value1");
    	hashTable.put("key1", "value2");
    	hashTable.put("key2", "value3");
    	hashTable.put("key2", "value3");
    	hashTable.put("key4", "");
    	hashTable.put("key5",  "");
    	//hashTable.put(null, null); either key or value can not be null
    	
    	System.out.println("=========Map.entry=========================");
    	for (Map.Entry<String, String> mapEntry : hashTable.entrySet()) {
			System.out.println(mapEntry.getKey() + ", " + mapEntry.getValue());
		}
    	
    	System.out.println("=========Map.keySet()=======================");
    	for (String key : hashTable.keySet()) {
    		System.out.println(key + ", " + hashTable.get(key));
		}
    	
    	System.out.println("=========Map.values=======================");
    	for (String value : hashTable.values()) {
    		System.out.println(value);
		}
    }

}
