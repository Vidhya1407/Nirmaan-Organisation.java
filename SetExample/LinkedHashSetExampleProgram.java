package SetExample;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExampleProgram {
	 /*  LINKEDHASHSET(C):
		 *  It is implementation class for Set(I).
		 *  Duplicate values-->Not allowed.
		 *  Insertion Order-->Maintained.
		 *  Underlying DS is HashTable+Linked list.
		 *  Implements Serializable and Cloneable .
		 *  Data stored based on hashCode,so it is very effective.
		 *  NULL elements are allowed in LinkedHashSet.
		 *  fill ratio:0.75
		 *  default capacity:16.
	*/
	public static void main(String[] args) {
		
		LinkedHashSet<Object> linkedHashSet=new LinkedHashSet<>();
		linkedHashSet.add(1);
		linkedHashSet.add(1000);
		linkedHashSet.add("A");
		linkedHashSet.add(9.99);
		linkedHashSet.addFirst("First");
		linkedHashSet.addLast("Last");
		
		System.out.println("LinkedHashSet : "+linkedHashSet);//Insertion order is maintained.
		System.out.println("SIZE : "+linkedHashSet.size());
		
		System.out.println("Is empty ? "+linkedHashSet.isEmpty());
		
		System.out.println();

	}

}
