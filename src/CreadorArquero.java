public class CreadorArquero extends CreadorPersonaje {
    public Personaje crearPersonaje(String nombre) {
        return new Arquero(nombre, 110, 32, 12, "Arco de caza");
    }
}