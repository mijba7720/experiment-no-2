//Base class Parent with static variable bank_balance=1000 and two methods i.e Deposit() and Withdraw() 
//Method implementation is two argument , no return type where the money value is either deposited or withdraw from bank_balance. 
//Create  child classe i.e Son inherits the Parent class.
//Create the 2 object and call methods Deposit() and Withdraw() 
//Check final bank balance at end. ( as per ur Deposit() and Withdraw)
impor0tclass Parent{
    static int bank_balance=1000;
    Scanner sc=new Scanner(System.in);
    int deposit()
    {
        System.out.println("Enter the deposite Amount: ");
        int amt1=sc.nextInt();
        int Total_amt1=amt1+bank_balance;
        System.out.println("Total Amount: "+Total_amt1);
    }
    int withdraw() 
    {
        System.out.println("Enter the Withdraw Amount: ");
        int amt2=sc.nextInt();
        int Total_amt2=bank_balance-amt2;
        System.out.println("Total Amount: "+Total_amt2);
    }
}
class Child extends Parent
{
    
}   
class Bank_Balance
{
    public static void main(String[] args)
    {
         Child c1=new Child();
         c1.deposit();
         c1.withdraw(); 
         Child c2=new Child();
         c2.deposit();
         c2.withdraw(); 
    }
}
