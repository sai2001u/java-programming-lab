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













e)Java Program to Multiply two Numbers
f)Java Program to check Leap Year
g)Java Program to check whether input character is vowel or consonant
h)Java Program to calculate compound interest
i)Java Program to calculate simple interest
j)Java Program to find quotient and remainder
k)Java Program to calculate power of a number




