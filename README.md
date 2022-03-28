# Portfólio-T
##### Portfólio do primeiro trimestre / Técnico (Contém trabalhos feitos durante o primeiro trimestre do ensino médio)
----------------------------------------------------------------------------------------------------------------
## Sobre mim
##### Sou Gabriel Barroso Zendron, tenho 16 anos e estudo atualmente no Sesi Senai-SJ. Aproveito o tempo livre para estudar e programar em Python e HTML5 visto no canal [Curso em vídeo](https://www.youtube.com/c/CursoemV%C3%ADdeo), além de aprender Inglês no colégio e Japonês em cursos pagos na busca de alcançar a fluência de ambos. Focando atualmente em aprender Power BI para a análise de dados de empresa, algo que nos dias de hoje está em falta, busco ingressar cedo nessa parte do mercado de trabalho para me adaptar nas novas linguagens e tipos de análises que podem surgir.
## Conquistas e Trabalhos:
* ###### *Alcançar o N4 em Japonês*
* ###### *Conseguir criar um site*
* ###### *Acabar curso de cores fornecido pela Bradesco*
* ###### *Finalizar cursos de Japonês*
* ###### *Certificado do Hellow (alocado no final do portfólio)*
------------------------------------------------------------------
## Descrição do Portfólio
##### *O portfólio terá conteúdos sobre:*  
###### **Fundamentos de TI + exemplos** → **Lógica computacional + exemplos** →  **Fundamentos de Design + exemplos**
-----------------------------------------------------------------------------
#### Toda matéria vista em Lógica computacional:
~~~javascript
Códigos de Java:

comandos:
!=  →  diferente
">"  →  maior que 
<  →  menor que
>=  →  maior igual 
<=  →  menor que
&&  →   e
||  →  ou
++  →  soma mais 1 na variavel
--  →  subtrai menos 1 na variavel
%  →  resto da divisão
==  →  comparação
=   →  recebe (torna igual, iguala etc)
!  →  negação

numéricos:
int → números inteiros
float → números com casas decimais
long → números inteiros extensos 
double → números com muitas casas decimais


caracteres:
char → 1 caracter
string → conjunto de caracteres

binário:
boolean → verdadeiro ou falso

Exemplos: 

1* 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {//Início do método main
		Scanner bofao = new Scanner(System.in);//Criação do Scanner
		System.out.println("Digite um número");//Mensagem para digitar algo
		int n = bofao.nextInt();//Variável 'n' recebe o valor digitado no Scanner
		int i = 0;//Variável 'i' recebe o valor '0'
		while(i < n){//Enquanto 'i' for menor do que 'n', faça:
		    int j = i;//Variável 'j' recebe o valor da variável 'i'
		    int d = 0;//Variável 'd' recebe o valor '0'
		    while(j > 0){//Enquanto 'j' for maior do que '0', faça:
		        if(i % j == 0){//Se o RESTO da divisão de 'i' por 'j' for 0, faça:
		            d++;//Adicione +1 ao valor da variável 'd'
		        }//Fim do if
		        j--;//Subtrai -1 ao valor da variável 'j'
		    }//Fim do while
		    if(d == 2){//Se o valor da variável 'd' for igual a '2', faça:
		        System.out.println(i);//Mensagem informando o valor de 'i'
		    }//Fim do if
		    i ++;//Adiciona +1 ao valor da variável 'i'
		}//Fim do while
	}//Fim do método main
}


2*
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner batata = new Scanner(System.in);
		System.out.println("Digite um número:");
		int passos = batata.nextInt();
		int i = 0;
		while(i < passos){
		    i = i + 1;
		     if(i % 2 ==0){
		    System.out.println(i);
		    }
		}
	}
}
~~~
