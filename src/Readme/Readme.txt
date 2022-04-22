README:

Autor: Jhon Marlon Trujillo Rios

El ejercicio se realizo utilizando Java como unico lenguaje de programacion

Pasos a Seguir para su correcto funcionamiento

1. BASE DE DATOS

    Primero debemos crear una base de datos de formato SQLite en la siguiente direccion,"C:/historialJuegoSofka/historialJuegoSofka.SQLITE";

    este debe ser el nombre de la base de datos: historialJuegoSofka

    Debe contener una tabla llamada : historial, con los campos: nombre, puntaje y score de tipo: String, int,int Respectivamente, en la cual el nombre es unico y llave primaria.

    yo cree mi base utilizando datagrip aunque ya eso es eleccion personal, deberia de funcionar con cualquier metodo siempre y cuando la base de datos sea SQLite.

2. INICIO DEL JUEGO
    Al ejecutar el programa, nos dara una breve bienvenida y nos preguntara nuestro nombre el cual debemos ingresar sin espacios entre palabras
    luego se debe presionar la tecla ENTER

    Nos presentara la primera pregunta del cuestionario, al responderla hay 2 opciones posibles:
        
        1: RESPUESTA CORRECTA: en este caso el programa procedera a felicitarte y decirte cuanto ganaste con esta respuesta en particular
                                luego procedera a preguntar si deseas continuar jugando o deseas retirarte
                                        RETIRO: en el caso que desees retirarte, se guardara tu nombre, tu progreso y el dinero que ganaste hasta dicho punto pues ese es tu PREMIO!!

                                        CONTINUAR: de elegir continuar el programa procedera a presentarte la siguiente pregunta

                                SI TODAS TUS RESPUESTAS SON CORRECTAS ESTE PROCESO SE REPETIRA HASTA LLEGAR AL FIN DEL JUEGO Y LLEVARTE EL PREMIO MAYOR DE 150.000 USD!!!!

        2: RESPUESTA INCORRECTA: en este caso el programa procedera a Darte un agradecimiento por tu participacion, tambien se guardaran tus datos y respuestas que hallas aprobado
                                 con la exepcion de que tu Dinero sera un 0 puesto que pierdes tu acumulado al equivocarte de respuesta.

                                 DE SER ESTE EL CASO SERA UN "GAME-OVER" DEBERAS VOLVER A INGRESAR CON OTRO NOMBRE PARA PODER VOLVER A JUGAR

3. ADMINISTRADOR 
    El papel de administrador otorga el Privilegio de poder visualizar la bitacora de puntajes de todos los jugadores, Claro esta sin interferir con ninguno.

        3.1 VISUALIZAR BITACORA:  Al ejecutar el programa, nos dara una breve bienvenida y nos preguntara nuestro nombre en este caso debemos escribir "admin" y presionar ENTER 
                                  automaticamente se desplegara la Bitacora de juego permitiendonos ver el nombre, puntaje(numero de preguntas acertadas) y score (dinero) acumulado por cada jugador

                                  LOS JUGADORES QUE EN LA BITACORA TENGAN UN ACUMULADO DE SU SCORE(DINERO) EN 0 ES PORQUE TUVIERON UNA PREGUNTA INCORRECTA PERDIENDO ASI SU PREMIO

4.GLOSARIO:
    PUNTAJE: es la cantidad de preguntas acertadas por cada jugador.

    SCORE: es la cantidad de dinero acumulado de aquellos que se retiran a mitad de camino o de aquellos CAMPEONES que llega a la META!!.

    BITACORA: es el listado donde estan guardados todos los datos de las partidas jugadas.

5. SOPORTE: en caso de necesitar cualquier clase de soporte o resolver dudas enviar un e-mail a "jhonm9696@gmail.com" se le respondera lo mas pronto posible


                                                                    EXITOS!!!!



