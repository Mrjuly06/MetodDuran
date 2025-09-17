package sistemagestion;

public class Main {
    public static void main(String[] args) {
        // Crear Categoría y Juego
        Categoria categoria = new Categoria("MOBA");
        Juego juego = new Juego("League of Legends", categoria);

        // Crear Jugadores
        Jugador j1 = new Jugador("Carlos Pérez", "Shadow", 1500);
        Jugador j2 = new Jugador("Luis Gómez", "Dragon", 1450);
        Jugador j3 = new Jugador("Ana López", "Star", 1600);
        Jugador j4 = new Jugador("María Ruiz", "Phoenix", 1550);

        // Crear Equipos y asignar jugadores
        Equipo equipo1 = new Equipo("Team Alpha", "Latam");
        equipo1.agregarJugador(j1);
        equipo1.agregarJugador(j2);

        Equipo equipo2 = new Equipo("Team Omega", "EU");
        equipo2.agregarJugador(j3);
        equipo2.agregarJugador(j4);

        // Crear Árbitro
        Arbitro arbitro = new Arbitro("Jorge Morales", "LIC-123");

        // Crear Partida
        Partida partida1 = new Partida(1, "2025-09-20 15:00", equipo1, equipo2, juego, arbitro);
        partida1.setResultado("Team Alpha gana 1-0");

        // Crear Torneo y agregar partida y equipos
        Torneo torneo = new Torneo("Copa Internacional", "2025-09-15", "2025-09-30");
        torneo.agregarEquipo(equipo1);
        torneo.agregarEquipo(equipo2);
        torneo.agregarPartida(partida1);

        // Mostrar en consola (simple demostración)
        System.out.println("=== Torneo Creado ===");
        System.out.println("Nombre: " + torneo.getNombre());
        System.out.println("Juego: " + juego.getNombre() + " (" + categoria.getNombre() + ")");
        System.out.println("Partida 1: " + equipo1.getNombre() + " vs " + equipo2.getNombre());
        System.out.println("Resultado: " + partida1.getResultado());
        System.out.println("Árbitro: " + arbitro.getNombre());
    }
}
