
import java.util.Random;
import java.util.Scanner;



import Connection.Connect;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Cuestionario {

    public static int num_aleatorios(int a, int b) {
        Random random = new Random();
        int value = random.nextInt(a + b) + b;

        return (value);

    }
    
    public static void Registro(String a,int b,int c) throws ClassNotFoundException{
        Connect ObjConexion = new Connect();
        try(Connection conn = ObjConexion.connect(); Statement stmt = conn.createStatement()){
                    stmt.executeUpdate(
                        "INSERT INTO historial (nombre,puntaje,score)"
                        + "VALUES("
                        + "'" + a + "'"+","+"'" + b + "'"+","+"'" + c+"'"+");");

                        System.out.println("tabla actualizada");
                } catch(SQLException e){
                    System.out.println(e.getMessage());
                } 
        
        
    }

    public static void main(String[] args) throws ClassNotFoundException {

        //iniciando escanes para captura de datos
        Scanner sc = new Scanner(System.in);
        String admin="admin";
        System.out.println("BIENVENIDO A CURIOSIDADES MILLONARIAS");
        System.out.println("El juego en el que el conocimiento si paga" + "\n");
        System.out.println("Cual es tu Nombre Valiente jugador? ingresa tu nombre sin espacios" + "\n");
        String nombre_jugador = sc.next();
        if(nombre_jugador.equalsIgnoreCase(admin)){
            Connect ObjConexion = new Connect();
            String query = "SELECT * FROM historial";
            try(Connection conn = ObjConexion.connect(); Statement stmt = conn.createStatement()){
               ResultSet resultSet = stmt.executeQuery(query); //Ejecutar la consulta
                String nombre=resultSet.getString(1);
                int puntaje=resultSet.getInt(2);
                int score=resultSet.getInt(2);
                System.out.println(nombre+" "+puntaje+" "+score);

               } catch(SQLException e){
                   System.out.println(e.getMessage());
                }
               
            
        }
        else{
            
            
        
        
        
            int num_preguntas = 0;
            int score_acum = 0;

            System.out.println("\n"+"Muy bien"+""+nombre_jugador+" "+" aqui va la primera pregunta" + "\n");

            Jugador jugador = new Jugador(nombre_jugador, num_preguntas, score_acum);

            //generando la posicion aleatoria de la seleccion de las preguntas
            int min = 0;
            int max = 4;

            //inicio primer ronda de preguntass
            Pregunta[] preguntaslvl1 = new Pregunta[5];

            Respuesta r1 = new Respuesta("Colombia", 'A', false);
            Respuesta r2 = new Respuesta("Venezuela", 'B', false);
            Respuesta r3 = new Respuesta("Ecuador", 'C', true);
            Respuesta r4 = new Respuesta("Argentina", 'D', false);

            Pregunta p1 = new Pregunta("Quito es una ciudad de:", new Respuesta[]{r1, r2, r3, r4}, 10000);

            preguntaslvl1[0] = p1;

            r1 = new Respuesta("Visual Estudio", 'A', false);
            r2 = new Respuesta("NetBeans", 'B', true);
            r3 = new Respuesta("GitHub", 'C', false);
            r4 = new Respuesta("Notion", 'D', false);

            p1 = new Pregunta("Cual de los siguientes es un IDE", new Respuesta[]{r1, r2, r3, r4}, 10000);

            preguntaslvl1[1] = p1;

            r1 = new Respuesta("Drive", 'A', false);
            r2 = new Respuesta("Resident Evil", 'B', true);
            r3 = new Respuesta("Minecraft", 'C', false);
            r4 = new Respuesta("Max Payne", 'D', false);

            p1 = new Pregunta("Cual de los Siguientes es un Juego de Zombies", new Respuesta[]{r1, r2, r3, r4}, 10000);

            preguntaslvl1[2] = p1;

            r1 = new Respuesta("Where is my Mind", 'A', false);
            r2 = new Respuesta("Radio Ga Ga", 'B', true);
            r3 = new Respuesta("Life is Life", 'C', false);
            r4 = new Respuesta("Losing my Religion", 'D', false);

            p1 = new Pregunta("Cual de los Siguientes es una cancion de Queen", new Respuesta[]{r1, r2, r3, r4}, 10000);

            preguntaslvl1[3] = p1;

            r1 = new Respuesta("Pluton", 'A', false);
            r2 = new Respuesta("Marte", 'B', false);
            r3 = new Respuesta("Venus de Oz", 'C', false);
            r4 = new Respuesta("Jupiter", 'D', true);

            p1 = new Pregunta("Cuál es el planeta más grande del Sistema Solar", new Respuesta[]{r1, r2, r3, r4}, 10000);

            preguntaslvl1[4] = p1;

            //fin del primer bloque de preguntas 
            //inicio de segundo bloque de preguntas
            Pregunta[] preguntaslvl2 = new Pregunta[5];

            r1 = new Respuesta("Guatemala", 'A', true);
            r2 = new Respuesta("Brasil", 'B', false);
            r3 = new Respuesta("Peru", 'C', false);
            r4 = new Respuesta("Chile", 'D', false);

            Pregunta p2 = new Pregunta("La palabra Patojo es originaria de: ", new Respuesta[]{r1, r2, r3, r4}, 20000);

            preguntaslvl2[0] = p2;

            r1 = new Respuesta("Tamesis", 'A', false);
            r2 = new Respuesta("Jordan", 'B', false);
            r3 = new Respuesta("Amazonas", 'C', true);
            r4 = new Respuesta("Magdalena", 'D', false);

            p2 = new Pregunta("Cuál es el río más largo del mundo", new Respuesta[]{r1, r2, r3, r4}, 20000);

            preguntaslvl2[1] = p2;

            r1 = new Respuesta("Footbolista", 'A', false);
            r2 = new Respuesta("Jugador de baloncesto", 'B', true);
            r3 = new Respuesta("Cientifico", 'C', false);
            r4 = new Respuesta("Congresista estadounidense", 'D', false);

            p2 = new Pregunta("Jerry West es un:", new Respuesta[]{r1, r2, r3, r4}, 20000);

            preguntaslvl2[2] = p2;

            r1 = new Respuesta("Escuadron Ghost", 'A', false);
            r2 = new Respuesta("Alcones", 'B', false);
            r3 = new Respuesta("Fuerza Operativa 141", 'C', true);
            r4 = new Respuesta("Join Task Force 2", 'D', false);

            p2 = new Pregunta("A que unidad pertenecio El capitan Price", new Respuesta[]{r1, r2, r3, r4}, 20000);

            preguntaslvl2[3] = p2;

            r1 = new Respuesta("Sao Pablo", 'A', false);
            r2 = new Respuesta("Rio de Janeiro", 'B', false);
            r3 = new Respuesta("Brasilia", 'C', true);
            r4 = new Respuesta("Porto Alegre", 'D', false);

            p2 = new Pregunta("Cual es la Capital de Brasil", new Respuesta[]{r1, r2, r3, r4}, 20000);

            preguntaslvl2[4] = p2;

            //fin del Segundo bloque de preguntas (dificultad baja)
            //inicio de Tercer bloque de preguntas
            Pregunta[] preguntaslvl3 = new Pregunta[5];

            r1 = new Respuesta("gas mostaza", 'A', true);
            r2 = new Respuesta("gas propano", 'B', false);
            r3 = new Respuesta("bromuro de azufre", 'C', false);
            r4 = new Respuesta("zulfuro de amonio", 'D', false);

            Pregunta p3 = new Pregunta("Fue un Gas utilizado como arma en la Primera Guerra Mundial", new Respuesta[]{r1, r2, r3, r4}, 30000);

            preguntaslvl3[0] = p3;

            r1 = new Respuesta("HNO3", 'A', false);
            r2 = new Respuesta("C12H22O11", 'B', false);
            r3 = new Respuesta("NaCl", 'C', true);
            r4 = new Respuesta("AgNO3", 'D', false);

            p3 = new Pregunta("Cual de los siguientes es la composicion quimica de la sal de cocina", new Respuesta[]{r1, r2, r3, r4}, 30000);

            preguntaslvl3[1] = p3;

            r1 = new Respuesta("Plomo", 'A', false);
            r2 = new Respuesta("Osmio", 'B', true);
            r3 = new Respuesta("Platino", 'C', false);
            r4 = new Respuesta("Mercurio", 'D', false);

            p3 = new Pregunta("Metal mas pesado de la tabla periodica", new Respuesta[]{r1, r2, r3, r4}, 30000);

            preguntaslvl3[2] = p3;

            r1 = new Respuesta("Cachalote", 'A', false);
            r2 = new Respuesta("Jirafa", 'B', false);
            r3 = new Respuesta("Elefante", 'C', false);
            r4 = new Respuesta("Ballena Azul", 'D', true);

            p3 = new Pregunta("Cuál es el animal más grande de la Tierra", new Respuesta[]{r1, r2, r3, r4}, 30000);

            preguntaslvl3[3] = p3;

            r1 = new Respuesta("216 huesos", 'A', false);
            r2 = new Respuesta("200 huesos", 'B', false);
            r3 = new Respuesta("126 huesos", 'C', false);
            r4 = new Respuesta("206 huesos", 'D', true);

            p3 = new Pregunta("Cuántos huesos tiene el cuerpo humano", new Respuesta[]{r1, r2, r3, r4}, 30000);

            preguntaslvl3[4] = p3;

            //fin del Tercer bloque de preguntas (dificultad baja)
            //inicio de Cuarto bloque de preguntas
            Pregunta[] preguntaslvl4 = new Pregunta[5];

            r1 = new Respuesta("Halcón Peregrino", 'A', true);
            r2 = new Respuesta("Aguila Calva", 'B', false);
            r3 = new Respuesta("Condor", 'C', false);
            r4 = new Respuesta("Halcón Collarejo", 'D', false);

            Pregunta p4 = new Pregunta("Cuál es el ave más rápida del mundo", new Respuesta[]{r1, r2, r3, r4}, 40000);

            preguntaslvl4[0] = p4;

            r1 = new Respuesta("Forseti", 'A', false);
            r2 = new Respuesta("Andhrimnir", 'B', false);
            r3 = new Respuesta("Balder", 'C', true);
            r4 = new Respuesta("Thor", 'D', false);

            p4 = new Pregunta("Quién era el dios vikingo de la luz y de la verdad", new Respuesta[]{r1, r2, r3, r4}, 40000);

            preguntaslvl4[1] = p4;

            r1 = new Respuesta("1981", 'A', false);
            r2 = new Respuesta("1961", 'B', true);
            r3 = new Respuesta("1975", 'C', false);
            r4 = new Respuesta("1969", 'D', false);

            p4 = new Pregunta("En qué año el ser humano llegó al espacio", new Respuesta[]{r1, r2, r3, r4}, 40000);

            preguntaslvl4[2] = p4;

            r1 = new Respuesta("Footboll", 'A', false);
            r2 = new Respuesta("Basketball", 'B', false);
            r3 = new Respuesta("Natación", 'C', true);
            r4 = new Respuesta("Atletismo", 'D', false);

            p4 = new Pregunta("Cuál es el deporte más practicado del mundo", new Respuesta[]{r1, r2, r3, r4}, 40000);

            preguntaslvl4[3] = p4;

            r1 = new Respuesta("Lago Ness", 'A', false);
            r2 = new Respuesta("lago Titicaca", 'B', false);
            r3 = new Respuesta("lago Victoria", 'C', false);
            r4 = new Respuesta("Lago Baikal", 'D', true);

            p4 = new Pregunta("Cuál es el lago más profundo del mundo", new Respuesta[]{r1, r2, r3, r4}, 40000);

            preguntaslvl4[4] = p4;

            //fin del Cuarto bloque de preguntas (dificultad baja)
            //inicio de Quinto bloque de preguntas
            Pregunta[] preguntaslvl5 = new Pregunta[5];

            r1 = new Respuesta("Es una expresión breve que resume una observación general o un principio moral.", 'A', false);
            r2 = new Respuesta("Es la repetición del mismo sonido consonante en secuencia.", 'B', false);
            r3 = new Respuesta("Es la supresión de una o más letras al principio de un vocablo.", 'C', true);
            r4 = new Respuesta("Es la acentuacion al final de las palabras", 'D', false);

            Pregunta p5 = new Pregunta("¿qué es una aféresis?", new Respuesta[]{r1, r2, r3, r4}, 50000);

            preguntaslvl5[0] = p5;

            r1 = new Respuesta("Teoría del cerebro reptiliano", 'A', false);
            r2 = new Respuesta("Teoría del cerebro triúnico", 'B', true);
            r3 = new Respuesta("Teoría del cerebro evolutivo", 'C', false);
            r4 = new Respuesta("Teoría del cerebro degenerativo", 'D', false);

            p5 = new Pregunta("¿Qué nombre recibe la teoría propuesta por el neurocientífico Paul MacLean acerca del cerebro?", new Respuesta[]{r1, r2, r3, r4}, 50000);

            preguntaslvl5[1] = p5;

            r1 = new Respuesta("Millicent Roberts", 'A', false);
            r2 = new Respuesta("Lewis Collins", 'B', false);
            r3 = new Respuesta("Jorge Polansky", 'C', false);
            r4 = new Respuesta("Pedro Durand", 'D', true);

            p5 = new Pregunta("¿Quién inventó la lata para conservar alimentos?", new Respuesta[]{r1, r2, r3, r4}, 50000);

            preguntaslvl5[2] = p5;

            r1 = new Respuesta("5,000", 'A', false);
            r2 = new Respuesta("18,965", 'B', false);
            r3 = new Respuesta("13,000", 'C', false);
            r4 = new Respuesta("20,000", 'D', true);

            p5 = new Pregunta("¿Cuántas respiraciones toma el cuerpo humano diariamente?", new Respuesta[]{r1, r2, r3, r4}, 50000);

            preguntaslvl5[3] = p5;

            r1 = new Respuesta("5,000", 'A', false);
            r2 = new Respuesta("18,965", 'B', false);
            r3 = new Respuesta("13,000", 'C', false);
            r4 = new Respuesta("20,000", 'D', true);

            p5 = new Pregunta("¿Cuántas respiraciones toma el cuerpo humano diariamente?", new Respuesta[]{r1, r2, r3, r4}, 50000);

            preguntaslvl5[3] = p5;

            String si = "S";
            String continuar = "";
            int suma = 0;
            int total = 0;
            int a = 0;

            Pregunta p = null;

            for (int i = 0; i <= 5; i++) {
                int preg = num_aleatorios(max, min);
                switch (i) {

                    case 0 -> {
                        p = preguntaslvl1[preg];
                        p.preguntar();

                        int dinero = p.getPremio();
                        suma = total + dinero;
                        total = suma;
                        if (p.isCorrecto()) {
                            System.out.println("Desea continuar con la siquiente pregunta? S/N");
                            continuar = sc.next();
                            a++;
                            if (continuar.equalsIgnoreCase(si)) {
                                continue;
                            } else {
                                Registro(jugador.getNombre(),jugador.getPuntaje(),jugador.getScore());
                                System.out.println("Muchas Gracias por Jugar" + " " + jugador.getNombre() + "  " + "Respondiste " + " " + a + " " + "Preguntas correctas" + " " + "Su Premio es de" + " " + total);
                            }
                        }
                        break;

                    }
                    case 1 -> {
                        p = preguntaslvl2[preg];
                        p.preguntar();

                        int dinero = p.getPremio();
                        suma = total + dinero;

                        total = suma;
                        if (p.isCorrecto()) {
                            System.out.println("Desea continuar con la siquiente pregunta? S/N");
                            continuar = sc.next();
                            a++;
                            if (continuar.equalsIgnoreCase(si)) {
                                continue;
                            } else {
                                Registro(jugador.getNombre(),jugador.getPuntaje(),jugador.getScore());
                                System.out.println("Muchas Gracias por Jugar" + " " + jugador.getNombre() + "  " + "Respondiste " + " " + a + " " + "Preguntas correctas" + " " + "Su Premio es de" + " " + total);
                            }
                        }
                        break;
                    }
                    case 2 -> {
                        p = preguntaslvl3[preg];
                        p.preguntar();

                        int dinero = p.getPremio();
                        suma = total + dinero;
                        total = suma;
                        if (p.isCorrecto()) {
                            System.out.println("Desea continuar con la siquiente pregunta? S/N");
                            continuar = sc.next();
                            a++;
                            if (continuar.equalsIgnoreCase(si)) {
                                continue;
                            } else {
                                Registro(jugador.getNombre(),jugador.getPuntaje(),jugador.getScore());
                                System.out.println("Muchas Gracias por Jugar" + " " + jugador.getNombre() + "  " + "Respondiste " + " " + a + " " + "Preguntas correctas" + " " + "Su Premio es de" + " " + total);
                            }
                        }
                        break;
                    }
                    case 4 -> {
                        p = preguntaslvl4[preg];
                        p.preguntar();

                        int dinero = p.getPremio();
                        suma = total + dinero;

                        total = suma;
                        if (p.isCorrecto()) {
                            System.out.println("Desea continuar con la siquiente pregunta? S/N");
                            continuar = sc.next();
                            a++;
                            if (continuar.equalsIgnoreCase(si)) {
                                continue;
                            } else {
                                Registro(jugador.getNombre(),jugador.getPuntaje(),jugador.getScore());
                                System.out.println("Muchas Gracias por Jugar" + " " + jugador.getNombre() + "  " + "Respondiste " + " " + a + " " + "Preguntas correctas" + " " + "Su Premio es de" + " " + total);
                            }
                        }
                        break;
                    }
                    case 5 -> {
                        p = preguntaslvl5[preg];
                        p.preguntar();

                        int dinero = p.getPremio();
                        suma = total + dinero;
                        total = suma;
                        if (p.isCorrecto()) {
                            System.out.println("FELICIDADES!!!!!" + " " + jugador.getNombre() + " " + "ERES EL GANADOR DE " + total + "USD!!! por completar el total de preguntas");
                            a++;
                            if (continuar.equalsIgnoreCase(si)) {
                                continue;
                            } else {
                                Registro(jugador.getNombre(),jugador.getPuntaje(),jugador.getScore());
                                System.out.println("Muchas Gracias por Jugar" + " " + jugador.getNombre() + "  " + "Respondiste " + " " + a + " " + "Preguntas correctas" + " " + "Su Premio es de" + " " + total);
                            }
                        }
                        break;
                    }

                }

                jugador.setScore(total);
                jugador.setPuntaje(a);
                if (!p.isCorrecto()) {

                    break;
                } else if (!continuar.equalsIgnoreCase(si)) {
                    break;
                }
            }
        } 
    
    }
     
}
