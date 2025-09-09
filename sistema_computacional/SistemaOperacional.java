package sistema_computacional;

public class SistemaOperacional {
    private Double TempoDeExecucao;

    public Double getTempoDeExecucao() {
        return TempoDeExecucao;
    }
    public void setTempoDeExecucao(Computador computador, Programa programa) {
        TempoDeExecucao = programa.getQuantidadeOperacoes() / (computador.getOperacoesPorSegundo() * computador.getNucleosComputador());
    }

    public Boolean executarPrograma(Computador computador, Programa programa) {
        setTempoDeExecucao(computador, programa);
        if (computador.getMemoriaRAM() < programa.getMemoriaRAMAlocada()) {
                    System.out.println("Erro na execução do programa.");
                    System.out.println("Tempo de execução: " +TempoDeExecucao);
                    return false;
        } else {
            if (computador.getSSD() < programa.getSSDOcupado()) {
                System.out.println("Programa executado com sucesso, erro na instalação do programa.");
                System.out.println("Tempo de execução: " +TempoDeExecucao);
            } else {
                    System.out.println("Programa executado com sucesso.");
                    System.out.println("Tempo de execução: " +TempoDeExecucao);
            }
            return true;
        }
    }
}