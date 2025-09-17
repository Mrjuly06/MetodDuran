package sistemagestion;

public class Partida {
    private int id;
    private String fechaHora;
    private String resultado;
    private Equipo equipo1;
    private Equipo equipo2;
    private Juego juego;
    private Arbitro arbitro;

    public Partida(int id, String fechaHora, Equipo equipo1, Equipo equipo2, Juego juego, Arbitro arbitro) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.juego = juego;
        this.arbitro = arbitro;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }
}
