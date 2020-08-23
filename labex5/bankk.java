package labex5;
import java.util.Scanner;

/**
 *
 * @author Desktop Pc
 */
public class bankk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        
      Scanner p=new Scanner(System.in);
        int t;
        int ch;
         Bank n;//DYNAMIC METHOD DISPATCH
        do{
        System.out.println("\nEnter the bank in which the boy deposited the money:");
         t=p.nextInt();//
        switch(t)
        {
                case 1:
                 n=new BankA();
        System.out.println(n.getBalance());
                break;
            case 2:
                
            n=new BankB();
        System.out.println(n.getBalance());
                break;
            case 3:
              n=new BankC();
                    System.out.println(n.getBalance());
                break;
                 default:
                  System.out.println("invalid entry");
                break;
            }
        System.out.println("Do u want to conitue:");
        ch=p.nextInt();
        }while(ch==1);
                
  
    }
}
class Bank//super class
{
    int getBalance()
    {
        return 0;
    }
}
class BankA extends Bank//sub class
{
    int getBalance()
    {
        return 1000;
    }
}
class BankB extends Bank
{
    int getBalance()
    {
        return 1500;
    }
}
class BankC extends Bank
{
    int getBalance()
    {
        return 2000;
    }
}