package ListExample;

import java.lang.annotation.ElementType;
import java.util.Enumeration;
import java.util.Vector;

import javax.lang.model.util.Elements;

public class VectorListExampleProgram {
	/*VECTOR:
	 * Growable array
	 * Synchronized
	 * Thread Safe
	 * Fast random access 
	 */

	public static void main(String[] args) {
		//create a vector
		Vector<String> vector=new Vector<>();
		
		//add(element)=to add element
		vector.add("Tomato"); 
		vector.add("Onion");
		vector.add("Ladysfinger");
		vector.add(null);
		
		//add(index,element)=to add an element by using index
		vector.add(0, "Brinjal");
		vector.add(5, "Carrot");
		vector.addElement("Drumstick");
		
		System.out.println("Vegetables : "+vector);
		
		//get(index)=to get the element by using index
		System.out.println("Element at index 2 - "+vector.get(2));
		
		//getFirst()=get first element in a vector list
		System.out.println("First element : "+vector.getFirst());
		//getLast()=get last element in a vector list
		System.out.println("Last element : "+vector.getLast());
		
		vector.remove(0);//remove(index)=remove element by index 
		System.out.println("After removing index 0 : "+vector);
		
		vector.removeElementAt(3);
		System.out.println("Remove 3rd element :"+vector);
		
		//indexOf(index)=to print the value at the index
        System.out.println("Index of Onion :"+vector.indexOf("Onion"));
        System.out.println("Index of Tomato :"+vector.indexOf("Tomato"));
        System.out.println("Index of Potato :"+vector.indexOf("Potato"));
        
        //isEmpty()=to check the list empty or not.
        System.out.println("Is list is empty? "+vector.isEmpty());
        
        //capacity()=gets current capacity
        System.out.println("Capacity of vector "+vector.capacity());
        
        //set(index,element)=add element by using specific index
        vector.set(1, "Potato");
        System.out.println(vector);
        
        //contains(element)=to chect placed or not.returns boolean
        System.out.println("Contains tomato? "+vector.contains("tomato"));
        
        vector.ensureCapacity(10);
        
        vector.trimToSize();
       //trim vector to current size.
        
        //iteration
        System.out.println("\nIterator using Enumeration:");
        Enumeration<String> objEnumeration=vector.elements();
        	while(objEnumeration.hasMoreElements()) {
        		System.out.println(objEnumeration.nextElement());
        	}
        
        
        vector.clear();//clear()=delete all in a vector
        System.out.println("\nAfter clearing the vector : "+vector);

	}

}
