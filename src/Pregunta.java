

import java.util.Scanner;

class Pregunta {

    private String pregunta;
    private Respuesta[] respuestasPosibles;
    private int premio;
    private boolean correcto;

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }

    public Pregunta(String pregunta, Respuesta[] respuestasPosibles, int premio) {
        this.pregunta = pregunta;
        this.respuestasPosibles = respuestasPosibles;
        this.premio = premio;
    }

    public int getPremio() {
        return premio;
    }

    public void preguntar() {

        Scanner sc = new Scanner(System.in);

        System.out.println(this.pregunta);
        char letraCorrecta = 'A';
        for (Respuesta opcion : this.respuestasPosibles) {
            if (opcion.esCorrecta()) {
                letraCorrecta = opcion.getLetra();
            }
            System.out.print(String.valueOf(opcion.getLetra()) + ")" + opcion.getRespuesta() + " ");
        }
        System.out.println("\nElige: ");
        char letraElegidaPorElUsuario = sc.next().toUpperCase().charAt(0);
        if (letraElegidaPorElUsuario == letraCorrecta) {
            this.setCorrecto(true);
            System.out.println("CORRECTO!!!" + "acabas de sumar" + " " + this.premio + " " + "a tu PREMIO acumulado ");
        } else {
            
            this.setCorrecto(false);
            System.out.println("Incorrecto, la respuesta correcta era "+" " + String.valueOf(letraCorrecta) +" "+ "MUY BUEN INTENTO!!! Muchas Gracias por participar, su acumulado fue de"+" " + 0);
        }
    }

}
      
            
       

