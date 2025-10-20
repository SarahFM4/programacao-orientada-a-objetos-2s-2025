public class Colecao implements ItemEmprestavel {
    private String proprietario;
    private Integer qt_itens;


    public Colecao(String proprietario, Integer qt_itens) {
        this.proprietario = proprietario;
        this.qt_itens = qt_itens;
    }


    public String getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getQt_itens() {
        return this.qt_itens;
    }

    public void setQt_itens(Integer qt_itens) {
        this.qt_itens = qt_itens;
    }

    public void descricao() {
        System.out.println("Proprietário: " + getProprietario());
        System.out.println("Quantidade de itens: " + getQt_itens());
    }
    
}
