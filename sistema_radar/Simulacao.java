package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro("ACLR300", 0, 1976, "Comodoro");

        Radar radar = new Radar("Pistão Sul", 60);

        radar.avaliarVelocidade(opala);

        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.setVelocidade(-60);
        opala.acelerar();

        radar.avaliarVelocidade(opala);
    }
}
