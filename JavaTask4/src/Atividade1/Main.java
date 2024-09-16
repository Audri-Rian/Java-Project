package Atividade1;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        
        Tipo tipoAlimentacao = new Tipo(1, "Alimentação");
        Pratileira pratileiraComida = new Pratileira("Comidas",5);
        
        Produto produto = new Produto(
            1, 
            "Arroz", 
            "Arroz branco",
            10.50,
            100,
            tipoAlimentacao,
            LocalDateTime.now().plusDays(30), 
            2024,
            pratileiraComida
        );
        
        
        System.out.println("ID: " + produto.getId());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Tipo: " + produto.getTipo().getNome()); 
        System.out.println("Validade: " + produto.getValidade());
        System.out.println("Ano de Produção: " + produto.getProducao());
        System.out.println("Corredor: "+produto.getPratileira().getCorredor());
    }
}