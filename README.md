Ejercicio 5 - Generador de Personajes para Videojuego de Rol

Explicación del programa

En este ejercicio se implementó el patrón de diseño Factory Method para crear personajes de rol (Guerrero, Mago y Arquero) con sus estadísticas iniciales y arma asignada, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz Personaje con el método mostrarEstado().
- Tres clases concretas (Guerrero, Mago y Arquero) que almacenan nombre, vida, ataque, defensa y arma.
- Una clase abstracta CreadorPersonaje con el método de fábrica crearPersonaje(String nombre).
- Tres clases creadoras concretas (CreadorGuerrero, CreadorMago y CreadorArquero) que configuran los valores iniciales y el arma de cada clase.

Luego, dentro del método main, se utilizan los creadores para instanciar los personajes y mostrar su estado.

Lógica utilizada

La lógica del programa consiste en:
- Definir un contrato común mediante la interfaz Personaje.
- Delegar en cada subclase creadora la configuración de atributos iniciales y el arma correspondiente.
- Evitar condicionales en el código cliente al momento de crear personajes.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
Guerrero Thorin | Vida: 150 | Ataque: 25 | Defensa: 20 | Arma: Espada larga
Mago Merlin | Vida: 80 | Ataque: 40 | Defensa: 8 | Arma: Bastón arcano
Arquero Legolas | Vida: 110 | Ataque: 32 | Defensa: 12 | Arma: Arco de caza

Captura de pantalla

<img width="765" height="190" alt="image" src="https://github.com/user-attachments/assets/5c87c742-12c1-4e36-a687-48d2df4b469b" />
