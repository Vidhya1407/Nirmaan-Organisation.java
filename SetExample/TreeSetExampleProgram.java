package SetExample;

import java.util.TreeSet;

public class TreeSetExampleProgram {
	/*TREESET(C):
		 *  It is implementation class for SortedSet(I),NavigableSet(I).
		 *  Duplicate values-->Not allowed.
		 *  Insertion Order-->Maintained.(Natural Sorting Order)
		 *  Underlying DS is Binary SEarch Tree.
		 *  Heterogeneous Object are Not Allowed
    */ 
	public static void main(String[] args) {
		//create tree Set
		TreeSet<String> treeSet=new TreeSet<>();
		treeSet.add("Banana");
		treeSet.add(null);
		treeSet.add("Apple");
		treeSet.add("Orange");
		treeSet.add("Cherry");
		treeSet.add("Mango");
		treeSet.add("Grape");
		System.out.println("TreeSet stores elements in Sorted Order:\n"+treeSet);

	}

}
