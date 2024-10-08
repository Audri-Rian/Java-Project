public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String telefone, String email, String endereco) {
        if (nome.isEmpty() || cpf.isEmpty()) { // Se nome e cpf for vazio Throw(lança)
            throw new IllegalArgumentException("Nome e CPF são obrigatórios.");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
