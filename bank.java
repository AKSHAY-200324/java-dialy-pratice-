class bank{
public static void main(String args[])
{
atm a1=new atm();
Thread t1=new Thread(()->{
a1.withdraw(51000);
});

Thread t2=new Thread(()->{
a1.deposit(10000);
});
t1.start();
t2.start();
}
 }

class atm
{
int amt=50000;
synchronized void withdraw(int money){
System.out.println("will withdraw");
if(this.amt<money){
System.out.println("less amount; waiting for deposit");
try{wait();}catch(Exception e){System.out.println(e);}
}
this.amt-=money;
System.out.println("withdraw sucesfull");
}

synchronized void deposit(int money){
System.out.println("depositing");
this.amt+=money;
System.out.println("deposit completed");
notify();
} 
 

  }

