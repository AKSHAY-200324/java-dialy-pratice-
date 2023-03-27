class library{
public static void main(String args[])
{
book b1=new book();
Thread t1=new Thread(b1);
t1.start();
}
 }

class book implements Runnable{
public void run(){
System.out.println("iam akshay from Thread class" );
}
 } 