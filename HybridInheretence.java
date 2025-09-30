class Grandfather
{
    void grand()
    {
        System.out.println("I am Grandfather");
    }
}
class Father extends Grandfather
{
    void fath()
    {
        System.out.println("I am Father");
    }
}
class Son extends Father
{
    void son()
    {
        System.out.println("I am son");
    }
}
class Daughter extends Father
{
    void daughter()
    {
        System.out.println("I am Daughter");
    }
}
class HybridInheretence
{
    public static void main(String[] args)
    {
        Son s=new Son();
        s.son();
        s.fath();
        s.grand();

         Daughter d=new  Daughter();
        d.daughter();
        d.fath();
        d.grand();
    }
}