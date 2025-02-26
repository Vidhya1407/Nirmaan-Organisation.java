package MapExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
/*LinkedHashMap-->
 * Inserting order maintained
 * Keys-->No duplicates
 * Values-->Duplicates allowed
 * only one Null key is Allowed
 *No Synchronization,if use multithread,it has synchronized explicitely
 */
public class LinkedHashMapExampleProgram {

	public static void main(String[] args) {
		LinkedHashMap<Character, String> linkedHashMap=new LinkedHashMap<>();
		//PUT method is to insert an element
		linkedHashMap.put('R', "Red");
		linkedHashMap.put(null,"Pink");
		linkedHashMap.put('G', "Green");
		linkedHashMap.put('Y', "Yellow");
		linkedHashMap.put('N', "Navy Blue");
		linkedHashMap.put('B', "Blue");
		linkedHashMap.put('O', "Orange");
		linkedHashMap.put('W', "White");
		linkedHashMap.put('P',"Pink");
		linkedHashMap.put(null,null);//if entering the same key, it overrides the recent value.
		linkedHashMap.put('N',null);

		System.out.println("linkedHashMap Output : "+linkedHashMap);
		
		//to make a copy of the existing map.
				LinkedHashMap<Character, String> duplicateLinkedHashMap=new LinkedHashMap<>();
				duplicateLinkedHashMap.putAll(linkedHashMap);
				System.out.println("Duplicate Map : "+duplicateLinkedHashMap);
				
				//clear to delete the map content.
				duplicateLinkedHashMap.clear();
				System.out.println("After clearing Duplicate map : "+duplicateLinkedHashMap);
				
				//to check if the KEY present or not in the map-->it returns True or False.
				System.out.println("Does the map has Key A : "+linkedHashMap.containsKey('A'));
				System.out.println("Does the map has Key G : "+linkedHashMap.containsKey('M'));
				
				//to check if the VALUE present or not in the map-->it returns True or False.
				System.out.println("Does the map has Value 'Blue' : "+linkedHashMap.containsValue("Blue"));//case sensitive
				System.out.println("Does the map has Value 'Black' : "+linkedHashMap.containsValue("Black"));
				
				//Clone the map-->it show all elements with keys and values.
				System.out.println("Cloned Map : "+linkedHashMap.clone());
				
				//Check if the map is Empty or Not-->returns Boolean.
				System.out.println("is empty the map : "+linkedHashMap.isEmpty());
				
				//fetch the value
				System.out.println("index 2 : "+linkedHashMap.get(2));
				System.out.println("G for : "+linkedHashMap.get('G'));
				
				//to shows the set of Keys. Bcz,set does not gives duplicates.so,it named as keySet.
				System.out.println("key set : "+linkedHashMap.keySet());
				
				//to shows all values.
				System.out.println("All Values : "+linkedHashMap.values());

		       //Entry set-->it shows what it contains.
				System.out.println("Entry Set : "+linkedHashMap.entrySet());
			   
				//iterate
				System.out.println("Iterating ");
				for(Character ch:linkedHashMap.keySet()) {
					System.out.println("Key: "+ch+", Value: "+linkedHashMap.get(ch));
				}

	}

}
