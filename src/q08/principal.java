package q08;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class principal extends Funcionario{

    static void cadastrarFunc(int n,Scanner read, Funcionario[] listaFuncionarios){

        for (int i = 0; i < n ; i++){

            Funcionario f = new Funcionario();
            read.nextLine();
            System.out.println("Nome do funcionario " + i);
            String nome = read.nextLine();
            f.setNome(nome);

            System.out.println("Insira o salario do funcionario ("+f.getNome()+") :");
            double salario = read.nextDouble();

            f.setSalario(salario);

            listaFuncionarios[i] = f;

        }
    }
    public static void main(String[] args) {
        //Novo Scanner
        Scanner read = new Scanner(System.in);
        //Ler numero de funcionario a cadastrar
        System.out.print("Numero de funcionarios: ");
        int n = read.nextInt();
        //Instanciar lista de funcionarios
        Funcionario[] listaFuncionarios = new Funcionario[n];

        cadastrarFunc(n,read,listaFuncionarios );

        for (int i =0; i < n; i++){
            listaFuncionarios[i].showFuncionario();
            System.out.println("\n");

        }

    }


}
