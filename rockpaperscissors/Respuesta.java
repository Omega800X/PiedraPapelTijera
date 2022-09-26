import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Respuesta {
    PIEDRA,
    PAPEL,
    TIJERA;

    private static final List<Respuesta> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Respuesta obtenerRespuestaAleatoria() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
