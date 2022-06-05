package q08;

public class Funcionario {
    String nome = "";
    private double salario = 0.00;
    private  double abono = 0.00;

    private double liquido = 0.00;

    private boolean condition;

    //     Funcionario (int tamanho){
//        Funcionario[] asas = new Funcionario[tamanho];
//    }
//
//    Funcionario(String nome, double salario){
//       this.nome = nome;
//       this.salario = salario;
//    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    void setAbono() {


        if (this.salario <= 1000.00) {

            this.abono = this.salario * 0.2;

        } else if (this.salario > 1000.00 && this.salario <= 2000.00) {

            this.abono = this.salario * 0.1;

        } else if (this.salario > 2000.00) {

            this.abono = this.salario * 0.1;

        }

    }


    void checkLiquid() {

        if (this.salario > 2000.00) {
           this.liquido = this.salario - this.abono;
           this.condition = false;
        } else {
            this.liquido = this.salario + this.abono;
            this.condition = true;
        }


    }

    String conditionStatement(){
        String conditionMessage = " ";
        if (this.condition){
            conditionMessage = "Bonus: ";
        }else{
            conditionMessage = "Desconto: ";
        }

        return conditionMessage;
    }

    void showFuncionario(){
        setAbono();
        checkLiquid();
        System.out.println("Funcionario "+this.nome);
        System.out.println("Salario: "+this.salario);
        System.out.println(conditionStatement()+this.abono);
        System.out.println("Salario Liquido: "+this.liquido);
    }
}
