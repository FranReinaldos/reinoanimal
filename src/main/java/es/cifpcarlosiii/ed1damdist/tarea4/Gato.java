package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * @author Francisco Javier Reinaldos Chuecos
 * @version 1.1 04/03/2026
 * Clase que detalla lo que hace un gato.
 */

public class Gato extends Mamifero {

    private int pelos;

    /**
     *
     * @param nombre Cadena que contiene el nombre del gato
     */
    public Gato(String nombre) {
        super(nombre);
    }

    /**
     * Metodo que hereda desde la clase animal, pero que detalla más dependiendo de este tipo de clase, en este caso el gato
     *
     */
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    /**
     * Metodo que imprime por pantalla la explicación de la accion maullar
     */
    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    /**
     *
     * @param p parametro que hace referencia a un objeto de la clase animal
     * Metodo heredado que imprime por pantalla un mensaje de explicación junto al objeto creado de clase, el cual lo detalla aun más dependiendo de esta clase
     *
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.ToString());
    }

    /**
     *
     * @return devuelve el atributo de esta clase encapsulado.
     */
    public int getPelos() {
        return pelos;
    }

    /**
     *
     * @param pelos parametro numérico, que servirá para modificar el valor del atributo
     */
    public void setPelos(int pelos) {
        this.pelos = pelos;
    }
}
