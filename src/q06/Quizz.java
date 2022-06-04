package q06;

public class Quizz extends Perguntas {

    int acertadas;
    int erradas;
    String userName;
    private Perguntas[] nPerguntas;
    // double porcentagem;


    void setUserName(String userName) {
        this.userName = userName;
    }

    public Perguntas[] getnPerguntas() {
        return nPerguntas;
    }

    public void checkPergunta(String optSelected, int i) {


        if (nPerguntas[i].getResposta().equals(optSelected)) {

            System.out.println("Voce acertou !!!\n");
            acertadas++;

        } else {

            System.out.println("Voce errou :(\n");
            erradas++;
        }

    }

    public int getAcertadas() {
        return acertadas;
    }

    public int getErradas() {
        return erradas;
    }

    String pontuacao() {

        String resp = "";
        resp = "\nUsuario: " + userName + "\nAcertos: " + acertadas + "\nErros: " + erradas + "\n";
        return resp;
    }

    void comecar(Perguntas[] perguntas) {


    }

    void popular() {

        Perguntas[] arrayDePerguntas = new Perguntas[10];
        arrayDePerguntas[0] = new Perguntas("Pergunta 1", new String[]{"a", "b", "c", "d"}, "b");
        arrayDePerguntas[1] = new Perguntas("Pergunta 2", new String[]{"a", "b", "c", "d"}, "b");
        arrayDePerguntas[2] = new Perguntas("Pergunta 3", new String[]{"a", "b", "c", "d"}, "b");
        arrayDePerguntas[3] = new Perguntas("Pergunta 4", new String[]{"a", "b", "c", "d"}, "b");
        arrayDePerguntas[4] = new Perguntas("Pergunta 5", new String[]{"a", "b", "c", "d"}, "b");
        arrayDePerguntas[5] = new Perguntas("Pergunta 6", new String[]{"a", "b", "c", "d"}, "b");
        arrayDePerguntas[6] = new Perguntas("Pergunta 7", new String[]{"a", "b", "c", "d"}, "b");
        arrayDePerguntas[7] = new Perguntas("Pergunta 8", new String[]{"a", "b", "c", "d"}, "b");
        arrayDePerguntas[8] = new Perguntas("Pergunta 9", new String[]{"a", "b", "c", "d"}, "b");
        arrayDePerguntas[9] = new Perguntas("Pergunta 10", new String[]{"a", "b", "c", "d"}, "b");

        nPerguntas = arrayDePerguntas;

    }

}


