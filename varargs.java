class varargs
{
public static void main(String args[])
{
addition(10,20,35,45,167);
}
public static void addition(int...a)
{
int sum=0;
for(int i:a)
{
sum+=i;
}
System.out.println(sum); 
}
  }
