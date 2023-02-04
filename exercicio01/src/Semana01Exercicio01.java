import java.util.Scanner;
public class Semana01Exercicio01 {
     /*
    Solicite 3 notas de 0.0 a 10.0 , após a terceira nota apresente o resultado de aprovação ,
    para aprovação o aluno deve possuir média superior a 7.0 ;
     */
    public static void main(String[] args) {
        // Definição das variáveis
        double nota1;
        double nota2;
        double nota3;
        double media;

        // instancia do Scanner
        Scanner entradaUsario = new Scanner(System.in);

        // Imprimir no console solicitando as notas e atribuindo valor as variáveis através da entrada no console
        System.out.println("Digite a nota 1: ");
        nota1 = entradaUsario.nextDouble();

        System.out.println("Digite a nota 2: ");
        nota2 = entradaUsario.nextDouble();

        System.out.println("Digite a nota 3: ");
        nota3 = entradaUsario.nextDouble();

        // Atribuindo valor a variável média através de cálculo matemático
        media = ((nota1 + nota2 + nota3) / 3);

        // Utilizando if - else
        if ( media > 7.0 ){
            System.out.println("Aluno aprovado com média " + media);
        } else {
            System.out.println("Aluno reprovado com média " + media);
        }

        // Utilizando operador ternario
        System.out.println(
                ( media > 7.0 ) ? "Aluno aprovado com média " + media : "Aluno reprovado com média " + media);
        }
}