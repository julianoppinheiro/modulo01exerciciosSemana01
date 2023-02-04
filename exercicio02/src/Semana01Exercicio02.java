import java.util.Scanner;

public class Semana01Exercicio02 {
     /*
    Solicite número de faltas, 3 notas de 0.0 a 10.0 , após a terceira nota apresente o resultado de aprovação,
    para aprovação o aluno deve possuir média superior a 7.0 e
    presença superior a 80% e o número total de aulas é 20 ;
     */

    public static void main(String[] args) {

        // Definição das variáveis
        double nota1, nota2, nota3, media, qtqPresencaNecessaria, quantidadeFaltas, porcentagemAprovacao, totalAulas;

        // instancia do Scanner para capturar as entradas no console
        Scanner entradaUsario = new Scanner(System.in);

        // solicitar o numero de falta
        System.out.println("Digite o porcentual de presença necessária para ser aprovado: ");
        porcentagemAprovacao = entradaUsario.nextDouble();

        System.out.println("Digite a quantidade total de faltas: ");
        totalAulas = entradaUsario.nextDouble();

        qtqPresencaNecessaria = (porcentagemAprovacao * totalAulas) / 100;

        System.out.println("Se a quantidade de presenças do aluno for menor que o " + qtqPresencaNecessaria +
                "% ele será reprovado");

        System.out.println("Digite a quantidade de faltas do(a) aluno(a): ");
        quantidadeFaltas = entradaUsario.nextDouble();

        if (qtqPresencaNecessaria > (totalAulas - quantidadeFaltas)) {
            System.out.println("Aluno reprovado por faltas!");
        } else {
            System.out.println("A presença do aluno foi de: " +
                    ((((totalAulas - quantidadeFaltas) * 100) / 20)) + "%");

            // Imprimir no console solicitando as notas e atribuindo valor as variáveis através da entrada no console
            System.out.println("Digite a nota 1:");
            nota1 = entradaUsario.nextDouble();

            do {
                System.out.println("Nota inválida, digite um valor entre 0.0 e 10.0");
                nota1 = entradaUsario.nextDouble();
            }
            while (nota1 <= -1 || nota1 >= 10.1);{
            };

            System.out.println("Digite a nota 2:");
            nota2 = entradaUsario.nextDouble();

            System.out.println("Digite a nota 3:");
            nota3 = entradaUsario.nextDouble();

            // Atribuindo valor a variável média através de cálculo matemático
            media = ((nota1 + nota2 + nota3) / 3);

            System.out.println("\nA nota final do aluno é " + media);

            // Utilizando if - else
            if (media > 7.0) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado!");
            }
            entradaUsario.close();
        }
    }
}