package day3;

public class OperatorsExample {
/*	
1. Arithmetic Operators (+, -, *, /, %).
2. Relational Operators (==, !=, >, <, >=, <=).
3. Logical Operators (&&, ||, !).
4. Bitwise Operators (&, |, ^, ~).
5. Assignment Operators (+=, -=, *=, /=, %=).
6. Unary Operators (++, --).
7. Ternary Operator (? :)
8. Shift Operators (<<, >>, >>>).
*/ 
	    public static void main(String[] args) {
	        // 1. Arithmetic Operators
	        int a = 10, b = 20;
	        System.out.println("Arithmetic Operators:");
	        System.out.println("Addition: " + (a + b)); // 30
	        System.out.println("Subtraction: " + (b - a)); // 10
	        System.out.println("Multiplication: " + (a * b)); // 200
	        System.out.println("Division: " + (b / a)); // 2
	        System.out.println("Modulus: " + (b % a)); // 0

	        // 2. Relational (Comparison) Operators
	        System.out.println("\nRelational Operators:");
	        System.out.println("a == b: " + (a == b)); // false
	        System.out.println("a != b: " + (a != b)); // true
	        System.out.println("a > b: " + (a > b)); // false
	        System.out.println("a < b: " + (a < b)); // true
	        System.out.println("a >= b: " + (a >= b)); // false
	        System.out.println("a <= b: " + (a <= b)); // true

	        // 3. Logical Operators
	        boolean x = true, y = false;
	        System.out.println("\nLogical Operators:");
	        System.out.println("x && y: " + (x && y)); // false
	        System.out.println("x || y: " + (x || y)); // true
	        System.out.println("!x: " + (!x)); // false

	        // 4. Bitwise Operators
	        System.out.println("\nBitwise Operators:");
	        System.out.println("a & b: " + (a & b)); // 0 (binary AND)
	        System.out.println("a | b: " + (a | b)); // 30 (binary OR)
	        System.out.println("a ^ b: " + (a ^ b)); // 30 (binary XOR)
	        System.out.println("~a: " + (~a)); // -11 (binary NOT)

	        // 5. Assignment Operators
	        int c = 5;
	        System.out.println("\nAssignment Operators:");
	        c += 5; // c = c + 5
	        System.out.println("c += 5: " + c); // 10
	        c *= 2; // c = c * 2
	        System.out.println("c *= 2: " + c); // 20
	        c -= 3; // c = c - 3
	        System.out.println("c -= 3: " + c); // 17
	        c /= 4; // c = c / 4
	        System.out.println("c /= 4: " + c); // 4
	        c %= 3; // c = c % 3
	        System.out.println("c %= 3: " + c); // 1

	        // 6. Unary Operators
	        int d = 10;
	        System.out.println("\nUnary Operators:\nd = "+d);
	        System.out.println("d++: " + (d++)); // 10 (post-increment)
	        System.out.println("++d: " + (++d)); // 12 (pre-increment)
	        System.out.println("d--: " + (d--)); // 12 (post-decrement)
	        System.out.println("--d: " + (--d)); // 10 (pre-decrement)

	        // 7. Ternary Operator
	        System.out.println("\nTernary Operator:");
	        int max = (a > b) ? a : b;
	        System.out.println("Maximum of a and b: " + max); // 20

	        // 8. Shift Operators
	        System.out.println("\nShift Operators:");
	        System.out.println("a << 2: " + (a << 2)); // 40 (left shift)
	        System.out.println("a >> 2: " + (a >> 2)); // 2 (right shift)
	        System.out.println("a >>> 2: " + (a >>> 2)); // 2 (unsigned right shift)
	    }

}