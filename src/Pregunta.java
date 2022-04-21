

import java.util.Scanner;
//clase pregunta, creada para realizar el proceso tanto de seleccion como de clasificacion de las preguntas

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

    //metodo preguntar, metodo en el cual se realiza el proceso de preguntar y de validacion de las respuestas del jugador
    public void preguntar() {
        //se inicializa el scanner utilizado para capturar la respuesta del usuario
        Scanner sc = new Scanner(System.in);
        //se presenta la pregunta al jugador
        System.out.println(this.pregunta);
        char letraCorrecta = 'A';
        //se recorre el grupo de posibles respuestas y se selecciona la correcta y se muestran las 4 opciones al jugador
        for (Respuesta opcion : this.respuestasPosibles) {
            if (opcion.esCorrecta()) {
                letraCorrecta = opcion.getLetra();
            }
            System.out.print(String.valueOf(opcion.getLetra()) + ")" + opcion.getRespuesta() + " ");
        }
        //se captura la respuesta del jugador y se evalua con la respuesta correcta de la pregunta
        System.out.println("\nElige: ");
        char letraElegidaPorElUsuario = sc.next().toUpperCase().charAt(0);
        //se realiza la validacion de ser correcta se muestra el mesaje de felicitacion 
        if (letraElegidaPorElUsuario == letraCorrecta) {
            this.setCorrecto(true);
            System.out.println("CORRECTO!!!" + "acabas de sumar" + " " + this.premio + " " + "a tu PREMIO acumulado ");
        }//de ser incorrecta se cortara el juego con un brake en la clase cuestionario, se presentara el mensaje final de felicitacion y agradecimiento por participar sin darle la oportunidad de continuar 
        else {

            this.setCorrecto(false);
            System.out.println("Incorrecto, la respuesta correcta era " + " " + String.valueOf(letraCorrecta) + " " + "MUY BUEN INTENTO!!! Muchas Gracias por participar, su acumulado fue de" + " " + 0);
        }
    }

}
