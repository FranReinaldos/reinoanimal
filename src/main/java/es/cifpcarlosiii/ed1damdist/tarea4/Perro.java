package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * @author Francisco Javier Reinaldos Chuecos
 * @version 1.1 04/03/2026
 * Clase que detalla lo que realiza un perro
 */

public class Perro extends Mamifero {
    /**
     *
     * @param nombre Cadena que contiene el nombre del perro
     */
    public Perro(String nombre) {
        super(nombre);
    }

    /**
     * Metodo que hereda desde la clase animal, pero que detalla más dependiendo de este tipo de clase
     */
    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    /**
     *
     */
    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    /**
     * Metodo que imprime por pantalla la explicación de la accion ladrar
     */
    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    /**
     *
     * @param p parametro que hace referencia a un objeto de la clase animal, en este caso más detallado a la clase perro
     * Metodo heredado que imprime por pantalla un mensaje de explicación junto al objeto creado de clase perro
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.ToString());
    }

}
