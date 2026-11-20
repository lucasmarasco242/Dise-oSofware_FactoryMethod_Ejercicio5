public class Arquero implements Personaje {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private String arma;

    public Arquero(String nombre, int vida, int ataque, int defensa, String arma) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.arma = arma;
    }

    public void mostrarEstado() {
        System.out.println("Arquero " + nombre + " | Vida: " + vida + " | Ataque: " + ataque + " | Defensa: " + defensa + " | Arma: " + arma);
    }
}