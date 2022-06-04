package q07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class principal extends user{


    public static void main(String[] args) {
        user usuario = new user();
        Scanner read = new Scanner(System.in);
        String user = "";
        String senha = "";
        String userT = "Rafael";
        String senhaT = "1234";
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
        Date data = new Date();
        String dataString = formato.format(data);
        System.out.println(dataString);
        System.out.println(data.getClass());


        System.out.println("usuario :");
        user = read.nextLine().trim();
        usuario.setNome(user);

        System.out.println("senha :");
        senha = read.nextLine().trim();
        usuario.setSenha(senha);


        if (usuario.checkUser(user,senha)) {

            if (dataString.compareTo("06:00") >= 0 && dataString.compareTo("11:59") <= 0) {
                System.out.println("Bom dia, você se logou ao nosso sistema");
            } else {
                if (dataString.compareTo("12:00") >= 0 && dataString.compareTo("17:59") <= 0) {
                    System.out.println("Boa tarde, você se logou ao nosso sistema");
                } else {
                    if (dataString.compareTo("18:00") >= 0 && dataString.compareTo("23:59") <= 0) {
                        System.out.println("Boa noite, você se logou ao nosso sistema");
                    } else {
                        if (dataString.compareTo("00:00") >= 0 && dataString.compareTo("05:59") <= 0) {
                            System.out.println("Boa madrugada, você se logou ao nosso sistema");
                        }
                    }
                }


            }

        }else{
            System.out.println("Usuário e/ou senha incorretos.");
        }

    }
}
