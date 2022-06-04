package q07;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class principal extends user {

static void loginState(String user, String senha, user usuario){

    //instanciar o formato HORA : MINUTO para verificar o horario
    SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
    Date data = new Date();
    String dataString = formato.format(data);

    if (usuario.checkUser(user, senha)) {

        if (dataString.compareTo("06:00") >= 0 && dataString.compareTo("11:59") <= 0) {

            System.out.println("Bom dia, você se logou ao nosso sistema");

        } else if (dataString.compareTo("12:00") >= 0 && dataString.compareTo("17:59") <= 0) {

            System.out.println("Boa tarde, você se logou ao nosso sistema");

        } else if (dataString.compareTo("18:00") >= 0 && dataString.compareTo("23:59") <= 0) {

            System.out.println("Boa noite, você se logou ao nosso sistema");

        } else if (dataString.compareTo("00:00") >= 0 && dataString.compareTo("05:59") <= 0) {

            System.out.println("Boa madrugada, você se logou ao nosso sistema");
        }

    } else {

        System.out.println("Usuário e/ou senha incorretos.");

    }

}
    public static void main(String[] args) {
        //Criar um novo usuario
        user usuario = new user();

        //instanciar um leitor para o terminal
        Scanner read = new Scanner(System.in);

        //Usuario e senhas a serem verificados
        String user = "";
        String senha = "";

        //Envia para o sistema o imput o usuario
        System.out.println("usuario :");
        user = read.nextLine().trim();

        System.out.println("senha :");
        senha = read.nextLine().trim();

    loginState(user,senha,usuario);



    }
}