package mx.unam.fi.poo;
import Pokemon.Pokemon;

/**
 * Clase principal para ejecutar el código.
 * Aquí se crea un objeto de la clase Pokemon y se interactúa con sus métodos.
 *
 * @author evare
 */
public class POOP6 {

    /**
     * Método principal donde se crea y manipula un objeto de tipo Pokemon.
     * @param args los argumentos desde la línea de comandos (si son necesarios).
     */
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");

        // Creación del objeto pokemon1 de tipo Pokemon
        Pokemon pokemon1 = new Pokemon("Amarillo", "Pikachu", "Eléctrico", 5, 40);
        
        // Mostrar detalles del Pokémon
        System.out.println("Detalles del Pokémon: ");
        System.out.println("Nombre: " + pokemon1.getNmbre());
        System.out.println("Color: " + pokemon1.getColor());
        System.out.println("Especie: " + pokemon1.getEspecie());
        System.out.println("Dificultad de captura: " + pokemon1.getDificultad());
        System.out.println("Tamaño: " + pokemon1.getTamano());

        // Realizar acciones con el Pokémon
        pokemon1.atacar();  // Simula un ataque por parte del Pokémon
        
        // Cambiar el color del Pokémon y mostrar el nuevo color
        pokemon1.setColor("Naranja");
        System.out.println("Nuevo color del Pokémon: " + pokemon1.getColor());
    }
}
