package q07;

public class user {

    private String nome;
    private String senha;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String getSenha() {
        return senha;
    }


    public void setSenha(String senha){
        this.senha = senha;
    }


    public Boolean checkUser(String inputNome,String inputSenha ){
        boolean resp = false;

        if (this.senha.equals(inputSenha) && this.nome.equals(inputNome) ){
            resp = true;
        }

        return resp;
    }
}

