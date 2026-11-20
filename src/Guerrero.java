public class Guerrero implements Personaje {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private String arma;

    public Guerrero(String nombre, int vida, int ataque, int defensa, String arma) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.arma = arma;
    }

    public void mostrarEstado() {
        System.out.println("Guerrero " + nombre + " | Vida: " + vida + " | Ataque: " + ataque + " | Defensa: " + defensa + " | Arma: " + arma);
    }
}