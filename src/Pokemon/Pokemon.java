package Pokemon;

/**
 * Clase que representa un Pokémon.
 * Un Pokémon tiene atributos como su color, nombre, especie, dificultad de captura y tamaño.
 * La clase permite modificar estos atributos y realizar acciones como atacar.
 * 
 * @author evare
 */
public class Pokemon {
    
    // Atributos de la clase Pokémon
    private String color;         // Color del Pokémon.
    private String nmbre;         // Nombre del Pokémon.
    private String especie;       // Especie del Pokémon (agua, fuego, piedra, etc.).
    private int dificultad;       // Dificultad de atrapar o combatir con el Pokémon.
    private int tamano;           // Tamaño del Pokémon.

    /** 
     * Constructor vacío. Inicializa un Pokémon sin valores predeterminados.
     */
    public Pokemon() {
    }

    /**
     * Constructor que inicializa todos los atributos de la clase Pokémon.
     * 
     * @param color Color del Pokémon.
     * @param nmbre Nombre del Pokémon.
     * @param especie Especie del Pokémon (agua, fuego, piedra, etc.).
     * @param dificultad Dificultad para atrapar o combatir con el Pokémon.
     * @param tamano Tamaño del Pokémon.
     */
    public Pokemon(String color, String nmbre, String especie, int dificultad, int tamano) {
        this.color = color;
        this.nmbre = nmbre;
        this.especie = especie;
        this.dificultad = dificultad;
        this.tamano = tamano;
    }

    /**
     * Obtener el color del Pokémon.
     * 
     * @return El color del Pokémon como una cadena.
     */
    public String getColor() {
        return color;
    }

    /**
     * Modificar el color del Pokémon.
     * 
     * @param color Nuevo color del Pokémon.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtener el nombre del Pokémon.
     * 
     * @return El nombre del Pokémon como una cadena.
     */
    public String getNmbre() {
        return nmbre;
    }

    /**
     * Modificar el nombre del Pokémon.
     * 
     * @param nmbre Nuevo nombre del Pokémon.
     */
    public void setNmbre(String nmbre) {
        this.nmbre = nmbre;
    }

    /**
     * Obtener la especie del Pokémon.
     * 
     * @return La especie del Pokémon como una cadena.
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Modificar la especie del Pokémon.
     * 
     * @param especie Nueva especie del Pokémon.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Obtener la dificultad de atrapar o combatir con el Pokémon.
     * 
     * @return La dificultad como un valor entero.
     */
    public int getDificultad() {
        return dificultad;
    }

    /**
     * Obtener el tamaño del Pokémon.
     * 
     * @return El tamaño del Pokémon como un valor entero.
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * Modificar el tamaño del Pokémon.
     * 
     * @param tamano Nuevo tamaño del Pokémon.
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * Modificar la dificultad de atrapar o combatir con el Pokémon.
     * 
     * @param dificultad Nueva dificultad para atrapar o combatir con el Pokémon.
     */
    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
        if (dificultad <= 0) {
            // Validación adicional (opcional)
        }
    }

    /**
     * Método que simula el ataque del Pokémon.
     * Imprime un mensaje indicando que el Pokémon ha atacado.
     */
    public void atacar() {
        System.out.println(nmbre + " ¡Atacar!");
    }
}
