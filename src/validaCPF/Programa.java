/*
O c�lculo dos DVs � executado em duas etapas usando para isto o m�dulo de divis�o 11 (m�dulo de divis�o � a parte inteira do resultado de uma divis�o):

Para calcular o 1� d�gito verificador
Cada um dos nove primeiros n�meros do CPF � multiplicado por um peso que come�a de 10 e que vai sendo diminuido de 1 a cada passo, somando-se as parcelas calculadas:
sm = (5*10)+(4*9)+(6*8)+(4*7)+(7*6)+(1*5)+(4*4)+(2*3)+(9*2) = 249;
Calcula-se o d�gito atrav�s da seguinte express�o:
11 - (sm % 11) = 11 - (249 % 11) = 11 - 7 = 4
obs. Se o resto da divis�o (operador %) calculado for 10 ou 11, o d�gito verificador ser� 0; nos outros casos, o d�gito verificador � o pr�prio resto.

Para calcular o 2� d�gito verificador
Cada um dos dez primeiros n�meros do CPF, considerando-se aqui o primeiro DV, � multiplicado por um peso que come�a de 11 e que vai sendo diminuido de 1 a cada passo, somando-se as parcelas calculadas:
sm = (5*11)+(4*10)+(6*9)+(4*8)+(7*7)+(1*6)+(4*5)+(2*4)+(9*3)+(4*2) = 299;
Calcula-se o d�gito atrav�s da seguinte express�o:
11 - (sm % 11) = 11 - (299 % 11) = 11 - 2 = 9
obs. se o resto da divis�o (operador %) calculado for 10 ou 11, o d�gito verificador ser� 0; nos outros casos, o d�gito verificador � o pr�prio resto.

*/

package validaCPF;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		   Scanner ler = new Scanner(System.in);

           String CPF;

           System.out.printf("Informe um CPF: ");
           CPF = ler.next();

           System.out.printf("\nCPF V�lido: ");
               // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
           if (ValidaCPF.isCPF(CPF) == true)
              System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
           else System.out.printf("Erro, CPF invalido !!!\n");
           }
		}
