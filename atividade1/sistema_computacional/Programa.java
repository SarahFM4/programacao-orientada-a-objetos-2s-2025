package atividade1.sistema_computacional;

public class Programa {
    private Integer memoriaRAMAlocada;
    private Integer SSDOcupado;
    private Integer nucleosPrograma;
    private Integer quantidadeOperacoes;
    private String nome;

    public Programa(Integer memoriaRAMAlocada, Integer SSDOcupado, Integer nucleosPrograma, Integer quantidadeOperacoes, String nome) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.SSDOcupado = SSDOcupado;
        this.nucleosPrograma = nucleosPrograma;
        this.quantidadeOperacoes = quantidadeOperacoes;
        this.nome = nome;
    }

    public Integer getMemoriaRAMAlocada() {
        return memoriaRAMAlocada;
    }
    public void setMemoriaRAMAlocada(Integer memoriaRAMAlocada) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
    }

    public Integer getSSDOcupado() {
        return SSDOcupado;
    }
    public void setSSDOcupado(Integer SSDOcupado) {
        this.SSDOcupado = SSDOcupado;
    }

    public Integer getNucleosPrograma() {
        return nucleosPrograma;
    }
    public void setNucleosPrograma(Integer nucleosPrograma) {
        this.nucleosPrograma = nucleosPrograma;
    }

    public Integer getQuantidadeOperacoes() {
        return quantidadeOperacoes;
    }
    public void setQuantidadeOperacoes(Integer quantidadeOperacoes) {
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public String getNome() {
        return nome;
    }
    public void setName(String nome) {
        this.nome = nome;
    }


}