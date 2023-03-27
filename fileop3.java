class fileop3
{
public static void main(String args[])
{
try
{
File f1=new File("E:akshay.txt");
Scanner bs=new Scanner(System.in);
if(f1.createNewfile())
{
System.out.println("Enter some data");
String data=bs.nextLine();
FileWriter fw=new FileWriter("E:akshay.txt");
fw.write(data);
fw.close();
}
			else{
				System.out.println("Error: file already existed");
			}


		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}
}