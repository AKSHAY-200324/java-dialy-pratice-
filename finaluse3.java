class finaluse2
{
public static void main(String args[])
{

SBI s=new SBI(); 
s.fixeddeposit(); 
}
}
  final class RBI
{
public void fixedeposit()
{ 
System.out.println("Fixed deposit in RBI"); 
} 
  }
 

class SBI extends RBI
{
public void fixeddeposit()
{
System.out.println("Fixed deposit in SBI"); 
} 
  }