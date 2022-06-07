package q06;

import javax.management.InvalidAttributeValueException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class principal extends Quizz{
    public static void main(String[] args) throws InputMismatchException {
        Quizz quizz = new Quizz();

        Scanner reader = new Scanner(System.in);

        int option;
        do {
            //Iniciando pelo menu
            System.out.println("atividade avaliativa 06 : Quizz\n");
            System.out.println("Selecione alguma das opcoes para progredir\n");
            System.out.println("| 1) Comecar Quizz |\n| 2) Sair do Quizz |\n");
            //ler a opcao do usuario

            option = reader.nextInt();


        //se nenhuma das duas for selecionada repetir
        } while ((option != 1 && option != 2));

        //iniciar o quizz
        if (option == 1 ) {

            String nome;
            Scanner leitor = new Scanner(System.in);

            System.out.println("\n Entre com seu nome de usuario : ");
            nome = leitor.nextLine();
            quizz.setUserName(nome);
            quizz.popular();

            Perguntas[] esseQuiz = quizz.getnPerguntas();
            Scanner resposta = new Scanner(System.in);

            //mostrar o quizz com as alternativas
            for (int i = 0; i <= 9 ; i++){
                System.out.println(esseQuiz[i]);
                System.out.println("\nSelecione sua alternativa : ");
                String alternativa =  resposta.nextLine().toLowerCase(Locale.ROOT);
                quizz.checkPergunta(alternativa,i);
            }

            System.out.println(quizz.pontuacao());
        }else{
            System.out.println("Obrigado por jogar");
        }





    }
}
