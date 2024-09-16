package Atividade2;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-8533613379", 
                                "HarperCollins", 
                                1954, 
                                1200, 
                                "Fantasia", 
                                true, 
                                "Português", 
                                99.90);
        

        System.out.println(livro.toString());
    }
}

