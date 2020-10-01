import java.util.*;
interface Mammal
{
    void eat();
}
interface WingedAnimal
{
    void flap();
}
interface Animal
{
    void eat();
}
class Bat implements Animal,Mammal,WingedAnimal
{
    public void eat()
    {
        System.out.println("Bat can eat");
    }
    public void flap()
    {
        System.out.println("Bat can flap");
    }
    public void breathe()
    {
        System.out.println("Bat can breathe");
    }
}
class Main
{
    public static void main(String args[])
    {
        Bat bat1 = new Bat();
        bat1.eat();
        bat1.breathe();
        bat1.flap();
    }
}