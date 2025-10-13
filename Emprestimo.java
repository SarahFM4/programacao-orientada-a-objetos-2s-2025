package atividade2;

public class Emprestimo {
    private String dataEmprestimo;
    private String dataDevolucao;
    private Pessoa pessoa;
    private Material material;

    public Emprestimo(String dataEmprestimo, String dataDevolucao, Pessoa pessoa, Material material) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.pessoa = pessoa;
        this.material = material;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do Empréstimo: ");
        System.out.println("Data do empréstimo: " + getDataEmprestimo());
        System.out.println("Data da devolução: " + getDataDevolucao());
        System.out.println("\nInformações da pessoa vinculada:");
        pessoa.exibirInfo();
        System.out.println("\nInformações do material vinculado:");
        material.descricao();
    }
}