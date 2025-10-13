package atividade2;

public class Revista extends Material {
    private String edicao;

    public Revista(String titulo, Integer anoPublicacao, String edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
    @Override
    public void descricao() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + getEdicao());
    }
}
