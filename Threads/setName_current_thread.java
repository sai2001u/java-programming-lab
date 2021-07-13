public class setName_current_thread
{
public static void main(String args[])
{
Thread t = Thread.currentThread();

System.out.println(" Current Thread Name : " + t);
t.setName("Gabber");
System.out.println("After Changing the Name : " +t);
}
}
