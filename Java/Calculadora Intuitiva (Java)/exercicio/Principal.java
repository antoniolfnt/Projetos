package exercicio;

import java.util.Scanner;

/**
 *
 * @author Neto
 */
public class Principal {
    public static void main(String[] args) {
        float num1f;
        float num2f;
        float resultado;
        int opcao;
        
        
        System.out.println("BEM VINDO(A) A  CALCULADORA");
        System.out.println("****************************");
        System.out.println("Qual operação deseja fazer?");
        System.out.println("*******************************");
        System.out.println("[+] Adição");
        System.out.println("[-] Subtração");
        System.out.println("[*] Multiplicação");
        System.out.println("[/] Divisão");
        System.out.println("********************************");
        System.out.print("DIGITE A SUA OPÇÃO: ");
        Scanner leitor = new Scanner(System.in);.useDelimiter("\r\n");
        opcao = leitor.nextInt();
       
        
        
        //Estrutura case
        switch (opcao){
            case '+':
        System.out.println("Digite o primeiro número");
                num1f = leitor.nextFloat();
        System.out.println("Digite o segundo número");
                num2f = leitor.nextFloat();
        resultado = num1f + num2f;
        System.out.println("O resultado da Adição é: " + resultado);
                break;
                
                case '-':
        System.out.println("Digite o primeiro número");
                num1f = leitor.nextFloat();
        System.out.println("Digite o segundo número");
                num2f = leitor.nextFloat();
        resultado = num1f - num2f;
                System.out.println("O resultado da Subtração é: " + resultado);
                break;
                
                case '*':
         System.out.println("Digite o primeiro número");
                num1f = leitor.nextFloat();
        System.out.println("Digite o segundo número");
                num2f = leitor.nextFloat();        
        resultado = num1f / num2f;
                System.out.println("O resultado da Divisão é: " + resultado);
                break;
                
                case '/':
         System.out.println("Digite o primeiro número");
                num1f = leitor.nextFloat();
        System.out.println("Digite o segundo número");
                num2f = leitor.nextFloat();
        resultado = num1f * num2f;
                System.out.println("O resultado da Multiplicação é: " + resultado);
                break;
                
                default :
                    System.out.println("**Operação inválida!!**");
                    break;
        }
    }
    
}
