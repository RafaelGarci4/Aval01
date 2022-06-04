package q06;

import java.util.Scanner;
public class principal extends Quizz{
   // Quizz quizz = new Quizz();
//   public void optionA (){
//       String nome;
//       Scanner leitor = new Scanner(System.in);
//
//       System.out.println("\n Entre com seu nome de usuario : ");
//       nome = leitor.nextLine();
//       quizz.setUserName(nome);
//
//   }

//   void quizz(Perguntas esseQuizz){
//
//
//   }


//    public static void menu() {
//
//        Scanner reader = new Scanner(System.in);
//        Perguntas[] esseQuizz;
//        int option;
//        do {
//            System.out.println("atividade avaliativa 06 : Quizz\n");
//            System.out.println("Selecione alguma das opcoes para progredir\n");
//            System.out.println("1) Comecar Quizz \n 2) Sair do Quizz\n");
//
//            option = reader.nextInt();
//
//            if (option == 1 ) {
//
//                optionA();
//                esseQuizz = quizz.popular();
//
//            }
//
//        } while ((option == 1 || option == 2));
//
//        for (int i = 0; i <= 9 ; i++){
//          System.out.println(esseQuizz[i]);
//       }
//    }

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

        System.out.println(quizz.userName+"\n"+quizz.acertadas+"\n"+quizz.erradas+"\n");








//        String[] perguntas = new String[5];
//
//
//        for (int i = 0; i <= 5-1; i++){
//            System.out.println("pergunta de numero "+i );
//            perguntas[i] = leitor.nextLine();
//
//        }
//
//        for (int y = 0; y <= perguntas.length - 1; y = y +1){
//
//            System.out.println(perguntas[y]);
//
//        }



    }
}
