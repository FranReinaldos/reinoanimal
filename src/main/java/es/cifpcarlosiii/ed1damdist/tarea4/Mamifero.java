package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * @author Francisco Javier Reinaldos Chuecos
 * @version 1.1 04/03/2026
 * clase que hereda de la clase animal la cual contiene metodos heredados del padre
 */

public class Mamifero extends Animal {
    /**
     *
     * @param nombre cadena que indica el nombre del animal, es herada de la clase animal
     */
    public Mamifero(String nombre) {
        super(nombre);
    }

    /**
     * Metodo heredado que imprime por pantalla un mensaje de explicación
     */
    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    /**
     *
     * @param m parametro que hace referencia a un objeto de la clase animal
     * Metodo heredado que imprime por pantalla un mensaje de explicación junto al objeto creado de clase
     */
    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.ToString());
    }
}
