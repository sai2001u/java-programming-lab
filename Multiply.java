import java.util.Scanner;
class Multipy{
public static void main(String[] args){
int num1, num2, result;
Scanner sc = new Scanner(System.in);
System.out.println("Enter num1: ");
num1 = sc.nextInt();
System.out.println("Enter num2: ");
num2 = sc.nextInt();
sc.close();
result = num1 * num2;
System.out.println("num1 * num2: " +result);
}
}