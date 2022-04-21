
class Respuesta {

    private String respuesta;
    private char letra;
    private boolean correcta;

    public Respuesta(String respuesta, char letra, boolean correcta) {
        this.respuesta = respuesta;
        this.letra = letra;
        this.correcta = correcta;
    }

    public String getRespuesta() {
        return this.respuesta;
    }

    public char getLetra() {
        return this.letra;
    }

    public boolean esCorrecta() {
        return this.correcta;
    }

}
