public class Clientes extends Pessoa {
    private boolean temLocacao; // Flag para indicar se o cliente tem locação ativa

    public Clientes() {
        super();
        this.temLocacao = false;
    }

    public Clientes(String nome, String cpf, String telefone, String email, String endereco) {
        super(nome, cpf, telefone, email, endereco);
        this.temLocacao = false;
    }

    public boolean isTemLocacao() {
        return temLocacao;
    }

    public void setTemLocacao(boolean temLocacao) {
        this.temLocacao = temLocacao;
    }
}
