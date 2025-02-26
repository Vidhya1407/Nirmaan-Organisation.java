package ListExample;

import java.util.LinkedList;

public class LinkedListExampleProgram {
	/*LINKEDLIST:
	 * It is implemented doubly linked list.
	 * It suited for Insertion and Deletion
	 * It is Not Best for Retrieving(search) the data
	 * maintained insertion order
	 * duplicates allowed 
	 */
	public static void main(String[] args) {
		//create simple linked list
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.add("Apple");//add an element
		linkedList.add("Banana");
		linkedList.add(0, "Cherry");//add elements using index
		linkedList.add(3, null);
		linkedList.add("Grape");
		linkedList.add(5,"Watermelon");
		linkedList.add(null);
		linkedList.add(4,"Strawberry");

		System.out.println("Output : "+linkedList);
		
		linkedList.addFirst("Mango");//add first element
		linkedList.addLast("Orange");//add last elemrnt
		
		System.out.println("After adding First and Last : \n"+linkedList);
		
		System.out.println("Element at index 4 : "+linkedList.get(4));//get(index)
		
		System.out.println("First Element :"+linkedList.getFirst());//getFirst()=get first element
		System.out.println("Last Element : "+linkedList.getLast());//getLast()=get last element
		
		linkedList.remove(2);//remove(index)=remove element by index
		System.out.println("After removing index 2 : "+linkedList);
		linkedList.remove("Grape");//remove(element)=remove specific element
		System.out.println("After removing null:"+linkedList);
		
		linkedList.removeFirst();//removeFirst()=remove first element
		linkedList.removeLast();//removeLast()=remove last element
		System.out.println("After removing First and Last element: \n"+linkedList);
		 
        System.out.println("Size Of linkedList : "+linkedList.size());//size()=size of the list
        
        System.out.println("Contains banana? "+linkedList.contains("Banana"));//contains(element)=to check placed or not.if placed returs true,otherwise false.
        
        linkedList.set(1, "Pinapple");//set(index,element)=add element by using specific index
        System.out.println(linkedList);
        
        //indexOf(index)=to print the value at the index 
        System.out.println("Index of Cherry:"+linkedList.indexOf("Cherry"));
        System.out.println("Index of Apple:"+linkedList.indexOf("Apple"));
        
        System.out.println("Is list is empty? "+linkedList.isEmpty());//isEmpty()=to check the list empty or not.
        
        System.out.println("\nIterating the fruits....");
        for(String fruits:linkedList) {
        	System.out.println(fruits);
        }
               
        linkedList.clear();//clear()=delete all in a list
        System.out.println("After clearing the list : "+linkedList);

	}

}
