package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * @author Francisco Javier Reinaldos Chuecos
 * @version 1.1 04/03/2026
 * Esta es la clase principal donde tenemos el main, donde usaremos el resto de clases.
 * En ste caso tenemos creación de objetos de cada clase, uso de arrays para almacenar datos de cada uno de ellos
 *
 */
public class Principal {

    public static void main(String[] args) {

/*
Esquema de clases de reino-animal        
                  Animal
                    |
                    |
                Mamifero
                /       \
               /         \        
          Perro          Gato
*/


        Animal animal = new Animal("tipo");

        Mamifero mamifero = new Mamifero("tipo de animal");

        Perro toby = new Perro("Toby");

        Gato isidoro = new Gato("Aristogato");
        isidoro.setPelos(4);

        animal = isidoro;

        Gato g;
        g = (Gato) animal;
        System.out.println("pelos de gato: " + g.getPelos());

        Animal array[] = new Animal[4];

        array[0] = animal;
        array[1] = mamifero;
        array[2] = toby;
        array[3] = isidoro;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Perro) {
                System.out.println("El objeto " + i + " es un perro");

                Perro p = (Perro) array[i];
                p.ladrar();
            }

            if (array[i] instanceof Gato) {
                System.out.println("El objeto " + i + " es un gato");

                Gato anigato = (Gato) array[i];
                anigato.maullar();
            }
        }

    }
}
