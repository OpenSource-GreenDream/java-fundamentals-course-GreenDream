# Guion - Lección 6: Errores comunes y próximos pasos

Duración aprox.: 10 minutos
Archivos: `starter-files/leccion-06-errores-y-proximos-pasos` y `leccion-06-errores-y-proximos-pasos`
Link del Pen: (pendiente)

## Objetivo

El estudiante aprende a identificar y leer los mensajes de error más comunes en Java (como excepciones de arreglos o faltas de sintaxis), diferencia correctamente la comparación de textos con `equals` frente a `==`, y aplica buenas prácticas al nombrar variables.

## Escenas

### Escena 1: Portada y gancho (0:00 - 1:00) - Canva

Texto en pantalla: Lección 6: Errores comunes y próximos pasos

Lo que se dice: Equivocarse es parte de programar. Cuando tu código Java falla y aparece una pantalla roja en la consola, no te preocupes: el secreto de un buen programador no es no equivocarse nunca, sino aprender a leer el error y corregirlo.

### Escena 2: Tres errores que todos cometemos (1:00 - 3:00) - Canva

Texto en pantalla: Falta el `;`, `=` vs `==`, Nombres confusos (`x1` vs `edadJugador`).

Lo que se dice: Al empezar en Java, hay tres errores muy comunes. Primero, olvidar el punto y coma al final de cada instrucción. Segundo, confundir `=`, que sirve para guardar un valor, con `==`, que sirve para comparar. Y tercero, usar nombres de variables poco claros como `x1` en lugar de `edadJugador`, que explican por sí mismos qué dato guardan.

### Escena 3: Comparar textos con equals (3:00 - 5:00) - Canva / OnlineGDB

Texto en pantalla: `a == b` (compara objeto) vs `a.equals(b)` (compara contenido).

Lo que se dice: Mucho cuidado al comparar textos (`String`) en Java. Si usas `==` entre dos textos, Java evaluará si son exactamente el mismo objeto en memoria y puede devolverte un resultado falso inesperado. Para comparar el contenido real de los textos, siempre debes utilizar el método `a.equals(b)`.

### Escena 4: Los arrays empiezan en 0 y la lectura de errores (5:00 - 7:30) - Canva / OnlineGDB

Texto en pantalla: `int[] puntos = {10, 20, 30}`; $\rightarrow$ `puntos[3]` géneros `ArrayIndexOutOfBoundsException`.

Lo que se dice: Recuerda que los arreglos en Java empiezan a contar desde la posición 0. Si creas un arreglo con 3 casilleros, sus posiciones válidas son 0, 1 y 2. Si intentas acceder a la posición 3, Java lanzará un error llamado `ArrayIndexOutOfBoundsException`. No le temas a este mensaje: la consola te dice exactamente qué falló y en qué línea ocurrió.

### Escena 5: Pausa para practicar (7:30 - 8:30) - Canva / OnlineGDB

Texto en pantalla: 1. Pausar el vídeo, 2. Romper un programa a propósito, 3. Leer el error y corregirlo.

Lo que se dice: Es tu turno de desbloquear tu superpoder de depuración. Pausa el video, abre tu editor en línea, rompe un programa a propósito cambiando algo, lee con atención el mensaje de error que aparece y arréglalo tú mismo.

### Escena 6: Cierre y próximos pasos (8:30 - 10:00)

Texto en pantalla: Elige tus propios colores y crea la clase `.destacado`

Lo que se dice: Pausa el video y elige tus colores favoritos para el fondo y los títulos. Luego crea tu propia clase.

### Escena 7: Cierre (6:30 - 7:00) - Canva

Texto en pantalla: Práctica semanal, Documentación oficial de Oracle Java, ¡Curso completado!

Lo que se dice: ¡Felicidades! Ya dominas lo esencial. Recuerda practicar un pequeño reto por semana, consultar la documentación oficial de Oracle Java cuando tengas dudas, y terminar tu simulador de mascotas para compartirlo con tus amigos¡Curso completado!