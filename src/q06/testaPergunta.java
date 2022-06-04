package q06;

public class testaPergunta {


    public static void main(String[] args) {

        Perguntas pergunta = new Perguntas();



        Perguntas p = new Perguntas("Pergunta 1", new String[]{"a", "b", "c", "d"},"b");
        System.out.println(pergunta.getPergunta());

    }
}
