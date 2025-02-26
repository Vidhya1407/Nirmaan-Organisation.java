package SetExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExampleProgram {
/*SET(I):
 *  Set is one of the child interfaces of Collection(I)
 *  Duplicate values-->Not allowed.
 *  Insertion Order-->Not maintained.
 *  It can insert Heterogeneous Object(If generic is not used).
 *  .......................................................... 
 * HASHSET(C):
 *  It is implementation class for Set(I).
 *  Duplicate values-->Not allowed.
 *  Insertion Order-->Not maintained.
 *  Underlying DS is HashTable.
 *  Implements Serializable and Cloneable .
 *  Data stored based on hashCode,so it is very effective.
 *  NULL elements are allowed in HashSet.
 *  fill ratio:0.75
 *  default capacity:16.
 */
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");		
		hashSet.add("A");//the return type of add() is boolean.since,Ais already there,it will return false.
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add(null);
		hashSet.add("F");
		
		System.out.println("HashSet : "+hashSet);//insertion order is not followed
		
		hashSet.remove(null);
		System.out.println("After removinf NULL in HashSet : "+hashSet);

		System.out.println("HashSet contains 'E'? "+hashSet.contains("E"));
		
		System.out.println("Is empty ? "+hashSet.isEmpty());
		System.out.println();
		Iterator<String>  iterator=hashSet.iterator();
		System.out.println("Elements in HashSet: ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
				
	
	}

}
