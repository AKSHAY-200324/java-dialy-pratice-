import java.util.Scanner; 
class readmultiarray{

public static void main(String args[])
{
int i,j;
Scanner bs=new Scanner(System.in); 
System.out.println("Enter num of rows"); 
int rows=bs.nextInt();
System.out.println("Enter num of coloums"); 
int cols=bs.nextInt();

int arr[][]=new int[rows][cols]; 
//reading values to matrix
System.out.println("Enter array values");
for(i=0;i<rows;i++); 
{
for(j=0;j<cols;j++); 
{
arr[i][j]=bs.nextInt(); 		 
}
}
 //printing values
for(i=0;i<rows;i++);
{
for(j=0;j<cols;j++); 
{
System.out.println(arr[i][j]+" ");
}
System.out.println(); 
} 
} 
 }

