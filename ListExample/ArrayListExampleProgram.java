package ListExample;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleProgram {
	/*In an ArrayList,
        We can store Objects(String,Integer,Boolean,Double,Character,...) and 
        non-primitive type(int.boolean,double,xhar,...)
    
    *Duplicates allowed
    *Insertion order not maintained
    *Growable array
    *Heterogeneous Object(if no generics)
    *No synchronization,No thread Safe
    *Default capacity=10
    *load factor=1 or 100% 
    *Implements Random Access(Best for Search),Serializable & Clonable interfaces
    *BEST-->Search operation
    *WORST-->Insertion and Deletion Operation
    */
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		//to add an element
		list.add(1);
		list.add('G');
		list.add(99);
		list.add(56);
		list.add("String ");
		list.add("Java");
		//to add an element by using index 
		list.add(0, "index 0");
		list.add(1, 100);
		list.add(3,"index 3");
		System.out.println("List  =  "+list);
		//to access an item in a list
		System.out.println("index 0: "+list.get(0));
		System.out.println("index 1: "+list.get(1));
		System.out.println("index 2: "+list.get(2));
		System.out.println("index 5: "+list.get(5));
		
		list.addFirst(1000);      //to add an element in a list as First
		list.addLast("last");     //to add an element in a list as Last
		System.out.println("Add First & Last - "+list);
		
		list.set(0, "fruits");    //to change an item by using index
		list.set(7, 7.45);
		System.out.println("After changing - "+list);
		
		list.remove(0);           //to remove an item by index
		list.remove("Java");      //to remove an item by value
		System.out.println("After Removing - "+ list);
		
		ArrayList<Integer> intList=new ArrayList<>();
		intList.add(1);
		intList.add(6);
		intList.add(79);
		intList.add(23);
		System.out.println("Integer List - "+intList);
		ArrayList<String> strList=new ArrayList<String>();
		strList.add("one");
		strList.add("two");
		strList.add("four");
		System.out.println("String List - "+strList);
		
		list.addAll(strList);    //to add a another list in a list
		list.addAll(intList);
		System.out.println(list);
		
		list.addAll(0, strList);  //to add a list by choosing index
		System.out.println(list);
		
		System.out.println(strList.contains("one"));  //it check an item is placed on not and it returns boolean.
		System.out.println(intList.contains(1090));
		System.out.println(list.containsAll(strList)); //it check a list is placed or not.
		
		System.out.println(list.clone());   //it creates a shallow copy of a list.
		
		ArrayList<String> strList1=new ArrayList<String>();
		strList1.add("one");
		strList1.add("two");
		strList1.add("four");
		System.out.println("String List 1 - "+strList1); //if both list contains same item in same order,it returns "True",otherwise "false".
		System.out.println("String List 2 - "+strList);
		System.out.println("Both List are Equal - "+strList.equals(strList1));
		
		strList.set(0, "two");
		strList.set(1, "one");
		System.out.println("String List 1 - "+strList1);
		System.out.println("String List 2 - "+strList);
		System.out.println("Both List are Equal - "+strList.equals(strList1));
		System.out.println();
		
		ArrayList<Object> arrayList=new ArrayList<>();
		arrayList.add(404);
		arrayList.add(3.90f);
		arrayList.add("Hurry up!");
		arrayList.add(1000);
		arrayList.add('J');
		arrayList.add(8.30f);
		arrayList.add("Welcome");
		arrayList.add(false);
		arrayList.add('w');
		arrayList.add(1);
		arrayList.add(45);
		arrayList.add(319);
        System.out.println("LIST - "+arrayList);

		//seperate lists for different datatypes
		ArrayList<Integer> integerList=new ArrayList<>();
		ArrayList<String> stringList=new ArrayList<String>();
		ArrayList<Float> floatList=new ArrayList<>();
		ArrayList<Boolean> booleanList=new ArrayList<>();

		//using for-each loop to separate the values.
		for(Object obj:arrayList) {
			if (obj instanceof Integer) {
				integerList.add((Integer) obj);
			}else if(obj instanceof Float) {
				floatList.add((Float)obj);
			}else if(obj instanceof Boolean) {
				booleanList.add((Boolean)obj);
			}else if (obj instanceof String) {
				stringList.add((String)obj);
			}
		}
		
		System.out.println("Integer Values : "+integerList);
		System.out.println("Float values : "+ floatList);
		System.out.println("String values : "+stringList);
		System.out.println("Boolean values : "+booleanList);
		
	}

}

		

