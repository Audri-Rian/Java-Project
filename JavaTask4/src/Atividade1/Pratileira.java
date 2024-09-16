package Atividade1;
public class Pratileira {
    private String nome;
    private int corredor;

    public Pratileira(String nome, int corredor){
        this.nome = nome;
        this.corredor = corredor;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getCorredor(){
        return corredor;
    }

    public void setCorredor(int corredor){
        this.corredor= corredor;
    }
}
