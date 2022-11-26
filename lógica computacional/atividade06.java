import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        tarefa(); 
    }
    public static void tarefa (){
    Scanner nm = new Scanner(System.in);
        System.out.println("A temperatura está em:");
        String r1 = nm.next();
        if(r1.equals("Celcius"))
        {
            Scanner cnm = new Scanner(System.in);
            System.out.println("Digite sua temperatura em Celcius.");
            float ctemp = cnm.nextFloat();
            float frslt = ((ctemp* 9/5) + 32);
            
            System.out.println("O resultado é: "+frslt);
        }
        else if(r1.equals("Fahrenheit"))
        {
            Scanner fnm = new Scanner(System.in);
            System.out.println("Digite sua temperatura em Fahrenheit.");
            float ftemp = fnm.nextFloat();
            float crslt = ((ftemp - 32) * 5/9);
            
            System.out.println("O resultado é: "+crslt);
        }
        else
        {
            System.out.println("Você deve responder com Celcius ou Fahrenheit");
            
            tarefa();
        }
        
    }
        
}
