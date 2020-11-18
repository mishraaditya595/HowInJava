
import java.util.*;
interface studentinfo
{
    void setinfo(String name, int Class, String address);
}
class Attendance implements studentinfo
{
    String name;
    int Class;
    String address;
    public void setinfo(String name, int Class, String address)
    {
        this.name=name;
        this.Class=Class;
        this.address=address;
    }
    
    int attend;
    int total;
    
    void Setattendence(int attend , int total)
    {
       this.attend=attend;
       this.total=total;
    }
    
    void Showattendence()
    {
        int per=attend*100/total;
        System.out.println(name);
        System.out.println(Class);
        System.out.println(address);
        
        if(per<50)
            System.out.println("very low attendance");
        else if(per>70)
            System.out.println("good attendance");
        else
            System.out.println("low attendance");
    }
}

class main
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();
        //in.nextLine();
        int Class=in.nextInt();
        in.nextLine();
        String address=in.nextLine();
        //in.nextLine();
        int attend=in.nextInt();
        int total=in.nextInt();
        Attendance a= new Attendance();
        a.setinfo(name,Class,address);
        a.Setattendence(attend,total);
        a.Showattendence();
    }
}
