package MapExample;

import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExampleProgram {
/*TREEMAP(C):
 *The elements will be on Natural Sorting Order or Alphabetic order
 *Keys -->Duplicates allowed
 *Values-->Duplicates not allowed
 *NULL key is NOT allowed
 */
	public static void main(String[] args) {
		TreeMap<Integer,String> treeMap=new TreeMap<>();
		//PUT method is to insert an element
		treeMap.put(2,"Apple");
		treeMap.put(1,"Orange");
		treeMap.put(5,"Pinapple");
		treeMap.put(10,"Grapes");
		treeMap.put(6,"Banana");
		treeMap.put(4,"Grapes");
		treeMap.put(4,"Papaya");//the same key will overrides the value
		treeMap.put(7,"Dragon Fruit");
		treeMap.put(6,null);//No null Key
		System.out.println("TreeMap Output : "+treeMap);
		
		//accesing values
		System.out.println("Value of key 7 : "+treeMap.get(7));
		System.out.println("Value of key 0 : "+treeMap.get(0));
		
		//remove the entry
		treeMap.remove(6);
		System.out.println("After removing key 6 :"+treeMap);
		
		System.out.println("All keys : "+treeMap.keySet());
		
		//iterate
		System.out.println("Iterating ");
		for(Integer key:treeMap.keySet()) {
			System.out.println("Key: "+key+", Value: "+treeMap.get(key));
		}
		
		System.out.println("\nusing iterator ...");
		Iterator<Integer> objIterator=treeMap.descendingKeySet().descendingIterator();
		for(Integer k:treeMap.keySet()) {
			
			System.out.println(treeMap.get(k));
		}
				


	}

}
