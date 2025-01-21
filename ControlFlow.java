package day4;

public class ControlFlow {
	public static void main(String[] args) {
/*
1.if-else Statement: Checks conditions and executes code accordingly.

2. switch Statement: Handles multiple cases for a variable and performs specific actions.

3. for Loop: Executes a block of code a specific number of times.

4. while Loop: Executes code repeatedly as long as the condition is true.

5. do-while Loop: Executes code at least once and then checks the condition.

6. break and continue: 
       break exits the loop entirely.
       continue skips the current iteration and moves to the next.

7. Nested Loops: Executes one loop inside another to handle multi-dimensional structures.
*/	
//.........................................................................................	
/*
 // 1. if else:
 System.out.println("\n1.if-else Statement: \n\t\tChecks conditions and executes code accordingly.");

  int num = 5;
     if (num > 0) {
         System.out.println(num + " is positive.");
     } else if (num < 0){
         System.out.println(num + " is negative.");
     } else {
         System.out.println(num + " is zero.");
         }
}
//2.Switch statement:
    System.out.println("\n2.switch Statement: \n\t\tHandles multiple cases for a variable and performs specific actions.");

    int day = 3; // Representing Wednesday
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        default:
            System.out.println("Weekend");
    }
	}
 
//3. For Loop: Executes a block of code a specific number of times.
	       System.out.println("\n3.for Loop: \n\t\tExecutes a block of code a specific number of times");

	       for (int i = 1; i <= 5; i++) {
	            System.out.println("Value of i: " + i);
	        }
	  }
	  
//4.while
       System.out.println("\n4.while Loop: \n\t\tExecutes code repeatedly as long as the condition is true.");

        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }}
        
//5.do while
         System.out.println("\n5.do-while Loop: \n\t\tExecutes code at least once and then checks the condition.");

	        int counter = 1;
	        do {
	            System.out.println("Counter: " + counter);
	            counter++;
	        } while (counter <= 5);
         }	
           
//6.Break and Continue
        System.out.println("\n6.break and continue: \r\n"+"\n\t\tbreak exits the loop entirely.\r\n"+ "\n\t\tcontinue skips the current iteration and moves to the next.");

        for (int j = 1; j <= 10; j++) {
            if (j == 6) {
                break; // Exit the loop when j equals 6
            }
            if (j % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("j = " + j);
        }	  
 }*/
 
 //7.nested loop:
        System.out.println("\n7.Nested Loops: \n\t\tExecutes one loop inside another to handle multi-dimensional structures.");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
	}
  
}
