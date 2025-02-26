
package MapExample;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapExampleProgram {
/*HashMap:
 *Un-Ordered
 *Key-->No duplicate
 *Value-->Duplicate allowed
 *Only one NULL key is allowed
 *No Synchronization,if use multithread,it has synchronized explicitely
 *load factor=0.75
 *capacity=16
 */
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap=new HashMap<>();
		//to insert an element PUT method is used.
		hashMap.put(1,"Toyoto");
		hashMap.put(2,"Honda");
		hashMap.put(3,"BMW");
		hashMap.put(6,"Audi");
		hashMap.put(null,"Audi");
		hashMap.put(5,"Benz");
		hashMap.put(4,"Tesla");
		hashMap.put(null,null);

		System.out.println("HashMap output : "+hashMap);
		
		//to make a copy of the existing map.
		HashMap<Integer, String> duplicateHashMap=new HashMap<>();
		duplicateHashMap.putAll(hashMap);
		System.out.println("Duplicate Map : "+duplicateHashMap);
		
		//clear to delete the map content.
		duplicateHashMap.clear();
		System.out.println("After clearing : "+duplicateHashMap);
		
		//to check if the KEY present or not in the map-->it returns True or False.
		System.out.println("Does the map has Key 1 : "+hashMap.containsKey(1));
		System.out.println("Does the map has Key 8 : "+hashMap.containsKey(8));
		
		//to check if the VALUE present or not in the map-->it returns True or False.
		System.out.println("Does the map has Value 'Tesla' : "+hashMap.containsValue("Tesla"));//case sensitive
		System.out.println("Does the map has Value 'Nissan' : "+hashMap.containsValue("Nissan"));
		
		//Clone the map-->it show all elements with keys and values.
		System.out.println("Cloned Map : "+hashMap.clone());
		
		//Check if the map is Empty or Not-->returns Boolean.
		System.out.println("is empty the map : "+hashMap.isEmpty());
		
		//fetch the value
		System.out.println(hashMap.get(3));
		
		//to shows the set of Keys. Bcz,set does not gives duplicates.so,it named as keySet.
		System.out.println("key set : "+hashMap.keySet());
		
		//to shows all values.
		System.out.println("All Values : "+hashMap.values());

       //Entry set-->it shows what it contains.
		System.out.println("Entry Set : "+hashMap.entrySet());
		
		//iterate
		System.out.println("Iterating ");
		for(Integer key:hashMap.keySet()) {
			System.out.println("Key: "+key+", Value: "+hashMap.get(key));
		}

		
		HashMap<String, String> anotherHashMap=new HashMap<>();
		//PUT method is to insert an element
		anotherHashMap.put("R", "Red");
		anotherHashMap.put("G", "Green");
		anotherHashMap.put("Y", "Yellow");
		anotherHashMap.put("N", "Navy Blue");
		anotherHashMap.put(null, "Blue");
		anotherHashMap.put("O", "Orange");
		anotherHashMap.put("W", "White");
		anotherHashMap.put("P","Pink");
		anotherHashMap.put("P",null);
		
		System.out.println("\nOne more HashMap Example for un-ordering : \n"+anotherHashMap);
		
		
		Iterator<Entry<String, String>> iterator=anotherHashMap.entrySet().iterator();
		System.out.println("\nby iterating...");
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}


	}

}
