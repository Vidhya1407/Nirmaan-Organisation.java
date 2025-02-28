package lambdaEx;
import java.util.*;
 
public class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> names=Arrays.asList("Sandhiya","Anitha","Banu","Chandhana","Vinothini","Monika","Gayathri");
        
        names.sort((a,b)->a.compareTo(b));//sorting using lambda
        System.out.println("Sorted Names : \n"+names);
	}

}
