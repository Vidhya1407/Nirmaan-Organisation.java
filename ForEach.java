package day11;

public class ForEach {
	public static void main(String[] args) {

//input type of array
		int[] nums= {10,20,30,40,50,60};
		int l=nums.length;//len
//for loop:		
		for (int i=0;i<l-1;i++ ) {
			System.out.println("index : "+i+"   value : "+nums[i]);//i prints only index values
			}
//foreach loop:		it use SEMICOLON
		for(int num:nums) {
			System.out.println(num);
		}
	System.out.println("...................................\n");
//input taken from the user
 
	int[] number=new int[7];//int[7] mensions length of the array only
	number[0]=11;
	number[1]=12;
	number[2]=13;
	number[3]=14;
	number[4]=15;
	number[5]=16;
	number[6]=17;
	
	for(int ans:number) {
		System.out.println(ans);
	}
	System.out.println("...................................\n");
//foreach loop ADDING
	int total=0;
	for(int ans:number) {
		total+=ans;
		System.out.println(total);
	}
	System.out.println("\ntotal value : "+total);
	System.out.println("...................................\n");
	
	}
	}
	
