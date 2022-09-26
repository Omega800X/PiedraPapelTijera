import java.util.Scanner;
public class Juego {
    private final int RONDAS = 5;

    public void jugar() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < RONDAS; i++) {
            Respuesta respJugador;
            Respuesta respMaquina = Respuesta.obtenerRespuestaAleatoria();
            String input;

            while(true){
                System.out.println("Ingrese Piedra, Papel o Tijera.");
                input = sc.nextLine().toUpperCase();
                
                if(input.equalsIgnoreCase("piedra") ||
                        input.equalsIgnoreCase("tijera") ||
                        input.equalsIgnoreCase("papel")) {
                    break;
                }
            }
            respJugador = Respuesta.valueOf(input);
            System.out.println("Respondiste: " + respJugador);
            System.out.println("La máquina respondió: " + respMaquina);
            System.out.println(this.evaluar(respJugador, respMaquina));
        }
        sc.close();
    }

    public String evaluar(Respuesta resp1, Respuesta resp2) {
        String res = "";
        switch(resp1){
            case PIEDRA:
                switch(resp2) {
                    case PIEDRA:
                        res = "Empate";
                        break;
                    case TIJERA:
                        res = "Gana el jugador.";
                        break;
                    case PAPEL:
                        res = "Gana la máquina.";
                        break;
                }
                break;
            case PAPEL:
                switch(resp2) {
                    case PAPEL:
                        res = "Empate";
                        break;
                    case PIEDRA:
                        res = "Gana el jugador.";
                        break;
                    case TIJERA:
                        res = "Gana la máquina.";
                        break;
                }
                break;
            case TIJERA:
                switch(resp2) {
                    case TIJERA:
                        res = "Empate";
                        break;
                    case PAPEL:
                        res = "Gana el jugador.";
                        break;
                    case PIEDRA:
                        res = "Gana la máquina.";
                        break;
                }
                break;
        }

        return res;
    }
}
