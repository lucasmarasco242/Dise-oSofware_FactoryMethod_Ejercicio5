public class CreadorGuerrero extends CreadorPersonaje {
    public Personaje crearPersonaje(String nombre) {
        return new Guerrero(nombre, 150, 25, 20, "Espada larga");
    }
}