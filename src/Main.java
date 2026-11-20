public class Main {
    public static void main(String[] args) {
        CreadorPersonaje creadorGuerrero = new CreadorGuerrero();
        Personaje p1 = creadorGuerrero.crearPersonaje("Thorin");
        p1.mostrarEstado();

        CreadorPersonaje creadorMago = new CreadorMago();
        Personaje p2 = creadorMago.crearPersonaje("Merlin");
        p2.mostrarEstado();

        CreadorPersonaje creadorArquero = new CreadorArquero();
        Personaje p3 = creadorArquero.crearPersonaje("Legolas");
        p3.mostrarEstado();
    }
}