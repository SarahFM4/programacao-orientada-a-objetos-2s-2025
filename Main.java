package atividade2;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Jorge", "jorgecastro@gmail.com", 31072008);
        Livro livro = new Livro("Dom Casmurro", 1899, "Machado de Assis");
        Emprestimo emprestimo = new Emprestimo("26/07/2023", "23/05/2024", usuario, livro);

        emprestimo.exibirDetalhes();
        
        System.out.println("\n");
        
        Funcionario funcionario = new Funcionario("Maria", "mariabibliotecaria@gmail.com", "Bibliotecária");
        Revista revista = new Revista("Veja", 2024, "Edição 2870");
        Emprestimo emprestimo2 = new Emprestimo("01/08/2024", "15/08/2024", funcionario, revista);
        
        emprestimo2.exibirDetalhes();
    }
}