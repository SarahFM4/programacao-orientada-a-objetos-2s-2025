package atividade1.sistema_computacional;

public class Computador {
    private Integer memoriaRAM;
    private Integer SSD;
    private Integer nucleosComputador;
    private Double operacoesPorSegundo;

    public Computador(Integer memoriaRAM, Integer SSD, Integer nucleosComputador, Double operacoesPorSegundo) {
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.nucleosComputador = nucleosComputador;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    public Integer getMemoriaRAM() {
        return memoriaRAM;
    }
    public void setMemoriaRAM(Integer memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public Integer getSSD() {
        return SSD;
    }
    public void setSSD(Integer SSD) {
        this.SSD = SSD;
    }

    public Integer getNucleosComputador() {
        return nucleosComputador;
    }
    public void setNucleosComputador(Integer nucleosComputador) {
        this.nucleosComputador = nucleosComputador;
    }

    public Double getOperacoesPorSegundo() {
        return operacoesPorSegundo;
    }
    public void setOperacoesPorSegundo(Double operacoesPorSegundo) {
        this.operacoesPorSegundo = operacoesPorSegundo;
    }
}