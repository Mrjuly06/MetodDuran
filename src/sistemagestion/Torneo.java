package sistemagestion;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private String nombre;
    private String fechaInicio;
    private String fechaFin;
    private List<Partida> partidas = new ArrayList<>();
    private List<Equipo> equipos = new ArrayList<>();

    public Torneo(String nombre, String fechaInicio, String fechaFin) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void agregarPartida(Partida partida) {
        partidas.add(partida);
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public String getNombre() {
        return nombre;
    }
}
