/*
O cálculo dos DVs é executado em duas etapas usando para isto o módulo de divisão 11 (módulo de divisão é a parte inteira do resultado de uma divisão):

Para calcular o 1º dígito verificador
Cada um dos nove primeiros números do CPF é multiplicado por um peso que começa de 10 e que vai sendo diminuido de 1 a cada passo, somando-se as parcelas calculadas:
sm = (5*10)+(4*9)+(6*8)+(4*7)+(7*6)+(1*5)+(4*4)+(2*3)+(9*2) = 249;
Calcula-se o dígito através da seguinte expressão:
11 - (sm % 11) = 11 - (249 % 11) = 11 - 7 = 4
obs. Se o resto da divisão (operador %) calculado for 10 ou 11, o dígito verificador será 0; nos outros casos, o dígito verificador é o próprio resto.

Para calcular o 2º dígito verificador
Cada um dos dez primeiros números do CPF, considerando-se aqui o primeiro DV, é multiplicado por um peso que começa de 11 e que vai sendo diminuido de 1 a cada passo, somando-se as parcelas calculadas:
sm = (5*11)+(4*10)+(6*9)+(4*8)+(7*7)+(1*6)+(4*5)+(2*4)+(9*3)+(4*2) = 299;
Calcula-se o dígito através da seguinte expressão:
11 - (sm % 11) = 11 - (299 % 11) = 11 - 2 = 9
obs. se o resto da divisão (operador %) calculado for 10 ou 11, o dígito verificador será 0; nos outros casos, o dígito verificador é o próprio resto.

*/

package validaCPF;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		   Scanner ler = new Scanner(System.in);

           String CPF;

           System.out.printf("Informe um CPF: ");
           CPF = ler.next();

           System.out.printf("\nCPF Válido: ");
               // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
           if (ValidaCPF.isCPF(CPF) == true)
              System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
           else System.out.printf("Erro, CPF invalido !!!\n");
           }
		}
