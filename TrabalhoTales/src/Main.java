import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Clientes> clientes = new ArrayList<>();
        ArrayList<Veiculos> veiculos = new ArrayList<>();
        ArrayList<Contrato> contratos = new ArrayList<>();

        // Criar clientes
        Clientes cliente1 = new Clientes("Ana", "123.456.789-00", "99999-9999", "ana@mail.com", "Rua A");
        Clientes cliente2 = new Clientes("Pedro", "987.654.321-00", "98888-8888", "pedro@mail.com", "Rua B");

        clientes.add(cliente1);
        clientes.add(cliente2);

        // Criar veículos

        veiculos.add(new Moto("XYZ-5678", "Harley", "Harley-Davidson", 2020, 150, true));

        // Criar contratos para o cliente 1 (Ana)
        Contrato contrato1 = new Contrato(1, "2024-10-01", "2024-10-05", veiculos.get(0).calcularValorTotal(4), cliente1);
        contratos.add(contrato1);

        // Exibir status de locação de cada cliente
        for (Clientes cliente : clientes) {
            String statusLocacao = cliente.isTemLocacao() ? "tem locação ativa" : "não tem locação ativa";
            System.out.println("Cliente: " + cliente.getNome() + " - Status: " + statusLocacao);
        }

        // Exibir dados de contratos
        for (Contrato contrato : contratos) {
            System.out.println("Contrato Nº: " + contrato.getNumeroContrato() + " - Cliente: " + contrato.getCliente().getNome() + " - Valor Total: " + contrato.getValorTotal());
        }
    }
}