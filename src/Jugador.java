
//clase jugador creada para definir los datos del jugador
public class Jugador {

    private String nombre;
    private int puntaje;
    private int score;

    public Jugador(String nombre, int puntaje, int score) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.score = score;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
