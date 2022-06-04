package q06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Perguntas {

    String enunciado;
    String[] alternativas;
   private String resposta;
    // List <String> lista;


    public Perguntas(String enunciado, String[] alternativas, String resposta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.resposta = resposta;
    }

    /*
     * @Construtor de perguntas
     *
     * */
    Perguntas() {
        alternativas = new String[4];
        // lista = new ArrayList<>();
    }

    void setEnunciado(String enunciado) {

        this.enunciado = enunciado;

    }


    void setAlternativas(String optionA, String optionB, String optionC, String optionD) {

        this.alternativas[0] = optionA;
        this.alternativas[1] = optionB;
        this.alternativas[2] = optionC;
        this.alternativas[3] = optionD;

    }


    void setResposta(String resposta) {

        this.resposta = resposta;

    }

    String getPergunta() {

        String resp = " ";
        resp = this.enunciado + "\nA)" + this.alternativas[0] + "\nB)" + this.alternativas[1] + "\nC)" + this.alternativas[2] + "\nD)" + this.alternativas[3];
        return resp;

    }

    String getResposta() {
        return this.resposta;
    }



    @Override
    public String toString() {
        return   enunciado + "\n" +
                "A)" +  alternativas[0] +"\n"+
                "B)"+  alternativas[1] +"\n"+
                "C)"+  alternativas[2] +"\n"+
                "D)"+  alternativas[3] +"\n"
                ;
    }
}

