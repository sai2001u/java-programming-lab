###  1.JAVA BASIC PROGRAMS
##   a)Java Program to Add two Numbers
  
 public class AddTwoNumbers {

	public static void main(String[] args)
	{
              int num1 = 5,num2 = 15,sum;
		sum = num1 + num2;
		System.out.println("sum of these numbers:"+sum);
	}
 }
![Screenshot (79)](https://user-images.githubusercontent.com/69143912/121499446-06069100-c9fb-11eb-8b2a-194699d3c2b7.png)


  ##  b)Java Program to Check Even or Odd Number

import java.util.Scanner;
public class Odd_Even
{
  public static void main(String[] args)
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number you want to check:");
                n = s.nextInt();
                if(n % 2 == 0)
               {
        	
		System.out.println("The given number"+n+" is Even");
        	
               }
        else
        {
        	System.out.println("The given number "+n+" is Odd");
        }
	
	}
	
}
![Screenshot (82)](https://user-images.githubusercontent.com/69143912/121501438-e1131d80-c9fc-11eb-8439-fade7c462620.png)


  ##  c)Java Program to add two binary numbers


  public class AddTwoBinaryNumbers 
{

	public static void main(String[] args)
	{
	
		  String binaryNumber1 = "10101", binaryNumber2 = "10001";

		   
		  Integer integer1 = Integer.parseInt(binaryNumber1, 2);
		  Integer integer2 = Integer.parseInt(binaryNumber2, 2);

		  
		  Integer output = integer1 + integer2;
		  
		  
		  System.out.println(Integer.toBinaryString(output));

		 }
	}
![Screenshot (85)](https://user-images.githubusercontent.com/69143912/121504428-a19a0080-c9ff-11eb-89b4-790c76ece12e.png)


##  d)Java Program to add two complex numbers


public class ComplexNumber {
	
	   double real, img;
		
	   
	   ComplexNumber(double r, double i){
		this.real = r;
		this.img = i;
	   }
		
	   public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
	   {
		
	        ComplexNumber temp = new ComplexNumber(0, 0);

	        temp.real = c1.real + c2.real;
	        temp.img = c1.img + c2.img;
	        
	        
	        return temp;
	    }
	    public static void main(String args[]) {
		ComplexNumber c1 = new ComplexNumber(5.5, 4);
		ComplexNumber c2 = new ComplexNumber(1.2, 3.5);
	        ComplexNumber temp = sum(c1, c2);
	        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
	    }
	}

![Screenshot (87)](https://user-images.githubusercontent.com/69143912/121505817-c773d500-ca00-11eb-8865-5e0834af7a57.png)

 ## e)Java Program to Multiply two Numbers
 import java.util.Scanner;


public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");

        
        int num1 = scan.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        
        scan.close();
        
        
        int product = num1*num2;
        
        
        System.out.println("Output: "+product);


	}

}
![Screenshot (89)](https://user-images.githubusercontent.com/69143912/121506520-6ac4ea00-ca01-11eb-910f-6c70e7f44ffb.png)


  ## f)Java Program to check Leap Year
    
    import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		int year;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter any Year:");
    	year = scan.nextInt();
    	scan.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");


	}

}
![Screenshot (91)](https://user-images.githubusercontent.com/69143912/121507062-ed4da980-ca01-11eb-9f3a-74cf8b6e3a45.png)

##  g)Java Program to check whether input character is vowel or consonant

import java.util.Scanner;

public class vowelconstantfinder {

	public static void main(String[] args) {
		
		char character;
        Scanner sacnner = new Scanner(System.in);
 
        System.out.print("Enter an Alphabet : ");
        character = sacnner.next().charAt(0);
 
        if(character=='a' || character=='A' || character=='e' || character=='E' ||
        character=='i' || character=='I' || character=='o' || character=='O' ||
        character=='u' || character=='U'){
            System.out.print(character+" is a Vowel");
        }else{
            System.out.print(character+ " is a Consonant");
        }
	}

}
![Screenshot (93)](https://user-images.githubusercontent.com/69143912/121507613-6b11b500-ca02-11eb-954e-360387b8867c.png)

## h)Java Program to calculate compound interest
  
  public class compoundintrest {
    public void calculate(int p, int t, double r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compoundintrest obj = new compoundintrest();
    	obj.calculate(2000, 5, .08, 12);

		
		
	}

}
![Screenshot (95)](https://user-images.githubusercontent.com/69143912/121508077-dc516800-ca02-11eb-8d08-c227b3c31a22.png)

## i)Java Program to calculate simple interest

 import java.util.Scanner;


public class simpleintrest {

	public static void main(String[] args) {
		
		float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        scan.close();
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +sinterest);


	}

}
![Screenshot (97)](https://user-images.githubusercontent.com/69143912/121508430-35b99700-ca03-11eb-96c7-0fc21f361d75.png)


## j)Java Program to find quotient and remainder
  public class quoientandrem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int num1 = 15, num2 = 2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);


	}

}![Screenshot (99)](https://user-images.githubusercontent.com/69143912/121508678-7ca78c80-ca03-11eb-9c20-4efa9c3a48d4.png)

## k)Java Program to calculate power of a number
public class powerofanumber {

	public static void main(String[] args) {
		
		int base = 3, exponent = 4;

        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
}
![Screenshot (103)](https://user-images.githubusercontent.com/69143912/121509134-f770a780-ca03-11eb-9deb-4bf5e8d7cdc4.png)





