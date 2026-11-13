public class Main {
    public static void main(String[] args) {
        // Demostración de equals vs ==
        String a = new String("hola");
        String b = new String("hola");

        System.out.println(a.equals(b)); // true (compara contenido)

        // Uso de nombres claros
        int edadJugador = 15;
        System.out.println("Edad: " + edadJugador);
    }
}