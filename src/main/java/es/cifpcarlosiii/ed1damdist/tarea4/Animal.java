package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * @author Francisco Javier Reinaldos Chuecos
 *
 * @version 1.1 04/03/2026
 * Esta es la clase padre que contiene su atributo nombre, y los metodos de lo que realiza un animal
 *
 */
public class Animal {
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    /**
     * Metodo de la case que imprime por pantalla la explicación de comer
     */
    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

    /**
     * Metodo de la case que imprime por pantalla la explicación de dormir
     */

    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    /**
     * Metodo de la case que imprime por pantalla la explicación de reproducir
     */

    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    /**
     *
     * @param a parametro que hace referencia a un objeto de la clase
     */

    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    }

    /**
     *
     * @return devuelve el metodo que contiene el atributo nombre
     */

    String ToString() {
        return this.getNombre();
    }

    /**
     *
     * @return devuelve el atributo de la clase que es nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre cadena que indica el nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
