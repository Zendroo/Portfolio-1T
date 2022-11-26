import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {

        Scanner nm = new Scanner(System.in);
        System.out.println("Nome do aluno");
        String nome = nm.next();
        System.out.println("Digite as notas");
        float nota1 = nm.nextInt();
        float nota2 = nm.nextInt();
        float nota3 = nm.nextInt();
        float resultado = (nota1 + nota2 + nota3)/3;

        System.out.println("a média de "+nome+" é "+resultado);

    }

}
