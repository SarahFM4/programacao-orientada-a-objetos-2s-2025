package atividade1.sistema_computacional;

public abstract class Main {
    public static void main(String[] args) {
        Computador computador = new Computador(4, 120, 4, 4.2);
        SistemaOperacional windows = new SistemaOperacional();
        Programa DOOM = new Programa(3, 5, 6, 8, "DOOM");
        Programa RedDeadRedemption2 = new Programa(4, 150, 3, 5, "Red Dead Redemption 2");
        Programa CallOfDuty = new Programa(6, 15, 2, 5, "Call Of Duty");

        windows.executarPrograma(computador, DOOM);
        windows.executarPrograma(computador, RedDeadRedemption2);
        windows.executarPrograma(computador, CallOfDuty);
    }
}