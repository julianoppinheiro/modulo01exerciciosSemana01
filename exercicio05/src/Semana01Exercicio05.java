import java.util.Scanner;

public class Semana01Exercicio05 {
    public static void main(String[] args) {

/*
        // Parte 5.1 - Usando o While

        int numero = 1, soma = 0; // Variáveis

        // Instrução/impressão de texto no terminal
       System.out.println("Caso você queira sair do programa, digite 0.");

        // Instância do objeto Scanner, para receber dados do usuário
        Scanner teclado = new Scanner(System.in);

        // Laço de repetição While
        while (numero != 0) { // enquanto a condição for verdadeira
            System.out.printf("Digite um número para ser somado: ");
            numero = teclado.nextInt();
            soma = soma + numero;
            System.out.println("O total da soma no momento é: " + soma);
        }
*/

        // Parte 5.2 - Usando Do While

/*
        int numero = 0, soma = 0; // Declaração das variáveis

        Scanner teclado = new Scanner(System.in); // Ler o que for digitado

        System.out.println("Caso queira sair do programa. Digite 0."); // Instrução ao usuário

        do { // Laço de Repetição Do While
            System.out.printf("\nDigite um valor para ser somado: ");
            numero = teclado.nextInt();
            soma = soma + numero;
            System.out.println("Total da soma é: " + soma);
        }
        while (numero != 0);

*/


   // Parte 5.3 - Usando o For

        double nota1, nota2, media;

        Scanner teclado = new Scanner(System.in);

        for (int contador = 1; contador < 11; contador++) {
            System.out.println("----- ALUNO " + contador +" -------");
            System.out.println("Digite a nota 1: ");
            nota1 = teclado.nextDouble();

            System.out.println("Digite a nota 2: ");
            nota2 = teclado.nextDouble();

            media = (nota1 + nota2) / 2;

            System.out.println("Média do aluno: " + media);

            if (media <= 3) {
                System.out.println("Aluno Reprovado");
            }
            else if(media > 3 && media < 7){
                System.out.println("Exame Final");
            }
            else if(media >= 7){
                System.out.println("Aluno Aprovado");
            }
            else
                System.out.println("Algo de errado aconteceu na nota.");
        }
    }
}