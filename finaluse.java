class finaluse
{
public static void main(String args[])
{
final int num=20; 
System.out.println(num);  
//num=25
System.out.println(num);  
 SBI s=new SBI();
 s.fixeddeposit();
}
 }       




class RBI
{
public void fixeddeposit()
{
Sysytem.out.println("This is RBI");
}

   }


class SBI extends RBI
{
public void fixeddeposit()
{
System.out.println("Fixed deposit in SBI"); 
} 
}

