package Atividade1;
import java.time.LocalDateTime;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    private Tipo tipo;
    private LocalDateTime validade;
    private int producao;
    private Pratileira pratileira;

    public Produto() {
    }

    public Produto(int id, String nome, String descricao, double preco, int quantidade, Tipo tipo, LocalDateTime validade, int producao, Pratileira pratileira) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.validade = validade;
        this.producao = producao;
        this.pratileira = pratileira;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getValidade() {
        return validade;
    }

    public void setValidade(LocalDateTime validade) {
        this.validade = validade;
    }

    public int getProducao() {
        return producao;
    }

    public void setProducao(int producao) {
        this.producao = producao;
    }
    
    public Pratileira getPratileira(){
        return pratileira;
    }

    public void setPratileira(Pratileira pratileira){
        this.pratileira = pratileira;
    }
}