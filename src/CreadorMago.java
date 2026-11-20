public class CreadorMago extends CreadorPersonaje {
    public Personaje crearPersonaje(String nombre) {
        return new Mago(nombre, 80, 40, 8, "Bastón arcano");
    }
}