import java.util.Scanner; //Bliblioteca para poder importa o scanner do java

public class AtvdTalles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Digite um número: ");
        double numero1 = scanner.nextDouble(); 

        System.out.println("Digite outro número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Primeiro número digitado: " + numero1);
        System.out.println("Segundo número digitado: " + numero2);

        System.out.println("Digite o operador logico: ");

        char operation = scanner.next().charAt(0);

        double result;

        switch (operation) {

            case '+':
                result = numero1 + numero2;
                break;

            case '-':
                result = numero1 - numero2;
                break;

            case '*':
                result = numero1 - numero2;
                break;

            case '/':
                result = (numero2 != 0) ? (numero1 / numero2) : 0; //Operador Ternário para poder diminuir o tamanho do código
                if (numero2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitido");
                }
                break;
            default:
                System.out.println("Operação inválida!");
                scanner.close();
                return;
        }

        System.out.println("O resultado é: " + result);

        scanner.close();
    }
}