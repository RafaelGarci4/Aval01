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

    public String getUserName() {
        return userName;
    }

    public int getAcertadas() {
        return acertadas;
    }

    public int getErradas() {
        return erradas;
    }

    String pontuacao() {

        String resp = "";
        resp = "\nUsuario: " + getUserName() + "\nAcertos: " + getAcertadas() + "\nErros: " + getErradas() + "\n";
        return resp;
    }

    void comecar(Perguntas[] perguntas) {


    }

    void popular() {

        Perguntas[] arrayDePerguntas = new Perguntas[10];
        arrayDePerguntas[0] = new Perguntas("O que o mito a caixa de pandora queria explicar?", new String[]{"A origem dos bens", "A origem dos males", "A origem de pandora", "A origem do Olimpo"}, "b");
        arrayDePerguntas[1] = new Perguntas("Quando Ícaro morreu, a ilha de Creta começou a se chamar o que?", new String[]{"Icaro", "Dedalo", "Icaria", "Rio de Janeiro"}, "c");
        arrayDePerguntas[2] = new Perguntas("Zeus é filho de quem?", new String[]{"Urano", "Poseidon", "Pedro", "Cronos"}, "d");
        arrayDePerguntas[3] = new Perguntas("De acordo com a mitologia grega, quem foi o primeiro deus?", new String[]{"Pablo", "Caos", "Zeus", "Urano"}, "b");
        arrayDePerguntas[4] = new Perguntas("Quem são os 3 deuses principais?", new String[]{"Zeus, Poseidon, Hades", "Apolo, Afrodite, Hera", "Hermes, Atena, Ares", "Uguinho, Zezinho, Luizinho"}, "a");
        arrayDePerguntas[5] = new Perguntas("Quem é a esposa de Zeus?", new String[]{"Hera", "Atena", "Afrodite", "Micalateia"}, "a");
        arrayDePerguntas[6] = new Perguntas("Por quem a ninfa eco se apaixonou?", new String[]{"Hercules", "Perseu", "Narciso", "Luizera"}, "c");
        arrayDePerguntas[7] = new Perguntas("Quem matou a Medusa?", new String[]{"Atena", "Perseu", "Hercules", "Capitao Nascimento"}, "b");
        arrayDePerguntas[8] = new Perguntas("Quem é deus dos titãs e deus do tempo?", new String[]{"Hermes", "Relogius", "Hades", "Cronos"}, "d");
        arrayDePerguntas[9] = new Perguntas("Com quem Urano teve filhos?", new String[]{"Persefone", "Afrodite", "Gaia", "Cervosia"}, "c");

        nPerguntas = arrayDePerguntas;

    }

}


