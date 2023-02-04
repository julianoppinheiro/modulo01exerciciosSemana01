import java.util.ArrayList;
import java.util.Scanner;

public class Semana01Exercicio06 {

    public static void main(String[] args) {


        // Exercicio 6.1
        //
        /*
        Double[] valores = new Double[10];

        valores[0] = 1.0;
        valores[1] = 2.0;
        valores[2] = 3.0;
        valores[3] = 4.0;
        valores[4] = 5.0;
        valores[5] = 6.0;
        valores[6] = 7.0;
        valores[7] = 8.0;
        valores[8] = 9.0;
        valores[9] = 10.0;
        for (int i = 0 ; i < valores.length ; i++) {
            System.out.println("Valor do array: " + valores[i]);
        }
        Double soma = 0.0;
        for (Double d : valores) {
            soma += d;
        }
        System.out.println("Total da soma do array: " + soma);

        */


        //Exercicio 6.1

           //Criamos as variáveis necessárias para executar o programa

            // Criamos um arraylist que é a lista de nomes
            ArrayList<String> listaNomes = new ArrayList<>();
            // instanciamos o Scanner para ler a entrada do usuario
            Scanner entrada = new Scanner(System.in);
            // variavel para receber o nome digitado
            String nomeDigitado ;
            // variavel de controle do laço while
            boolean controle = true;
            // iniciamos uma estrutura de laço while
            while (controle) {
                // imprimir no console
                System.out.println("Digite o nome ou FIM para finalizar");
                // atribui valor para variavel nomeDigitado
                nomeDigitado = entrada.nextLine();

                // estrutura de decisão para determinar se fim ou alimentar a lista
                if ( nomeDigitado.equals("FIM")){
                    controle = false;
                } else {
                    // adiciona nome a lista
                    listaNomes.add(nomeDigitado);
                }
            }

            // percorrendo a lista de nomes e imprimindo no console
            for ( String nome : listaNomes ){
                System.out.println("Nome: " + nome);
            }

        // utilizando o forEach e buscando o nome pedro
        for (String nome : listaNomes) {
            if (nome.equals("Pedro")) {
                System.out.println("Temos o nome " + nome + " na Array");
            }
        }

        // imprimir a array quando estivert fazio
        if(listaNomes.isEmpty()){
            System.out.println("Array está vazia: " + listaNomes);
        }
        else {
            System.out.println("Array não está vazio, veja: " + listaNomes);
        }

        //imprimindo o tamanho da array
        System.out.println("Tamanho do array: " +listaNomes.toArray().length);

        //remover sempre o 1 da array
        System.out.println("Foi excluido a array 1");
        listaNomes.remove(1);
        System.out.println("Imprimindo a lista: " + listaNomes);

        // ao final limpar a lista
        System.out.println("Excluindo a array...");
        listaNomes.clear();

        //imprimindo o tamanho da array novamente com a lista
        System.out.println("Tamanho do array: " +listaNomes.toArray().length);
        System.out.println("Imprimindo a lista: " + listaNomes);
    }
}