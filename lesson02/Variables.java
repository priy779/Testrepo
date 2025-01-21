package com.neotech.lesson02;

public class Variables {

	public static void main(String[] args) {
		//DataType      Name/identifier    operator       value
		int              a                   =             10;
		System.out.println(a);
		
		//2nd way 
		//We declare first, then assign before we use the variable 
	int number2; //I have a int variable called number2 
	
	//This causes a compiler error -> number2 value is not given
	//System.out.println(number2);
	number2 = 20;
	System.out.println(number2);
	
	//We can declare multiple variable in one line
	char var1, var2, var3;
	
	//The upper declaration is exactly the same as:
//	char var1;
//	char var2;
//	char var3;
	
	var1 = '@';
	var2 = '#';
	var3 = '!';
	
	System.out.println(var1);	//At this point var1 = @
	
	//I will re-assign a value to var1
	var1 = '$';
	System.out.println(var1); //At this point var1 = $
	
	//Can I re-assign a value to number2? Yes!
	number2 = 50;
	System.out.println(number2);
	
	
	


	}

}
