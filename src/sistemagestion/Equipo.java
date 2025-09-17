package sistemagestion;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String region;
    private List<Jugador> jugadores = new ArrayList<>();

    public Equipo(String nombre, String region) {
        this.nombre = nombre;
        this.region = region;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public String getNombre() {
        return nombre;
    }
}
