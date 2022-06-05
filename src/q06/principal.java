package q06;

import java.util.Scanner;
public class principal extends Quizz{

    public static void main(String[] args) throws Exception{
        Quizz quizz = new Quizz();

        Scanner reader = new Scanner(System.in);
        Perguntas[] esseQuizz = new Perguntas[10];

        int option;
        do {
            System.out.println("atividade avaliativa 06 : Quizz\n");
            System.out.println("Selecione alguma das opcoes para progredir\n");
            System.out.println("1) Comecar Quizz \n 2) Sair do Quizz\n");

            option = reader.nextInt();

            if (option == 1 ) {

                String nome;
                Scanner leitor = new Scanner(System.in);

                System.out.println("\n Entre com seu nome de usuario : ");
                nome = leitor.nextLine();
                quizz.setUserName(nome);
                quizz.popular();

            }

        } while ((option != 1 && option != 2));

        Perguntas[] esseQuiz = quizz.getnPerguntas();
        Scanner resposta = new Scanner(System.in);

        for (int i = 0; i <= 9 ; i++){
            System.out.println(esseQuiz[i]);
            System.out.println("\nSelecione sua alternativa : ");
           String alternativa =  resposta.nextLine();
           quizz.checkPergunta(alternativa,i);
        }

        System.out.println(quizz.pontuacao());





    }
}
