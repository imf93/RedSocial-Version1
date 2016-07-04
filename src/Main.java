import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Persona cristina = new Persona(1L, "Cristina", "Duran");
        Persona juan = new Persona(2L, "Juan", "Martinez");
        Persona ana = new Persona(3L, "Ana", "Gomez");
        Persona marc = new Persona(4L, "Marc", "Fuentes");
        Persona antonio = new Persona(5L, "Antonio", "Martinez");
        Persona pedro = new Persona(6L, "Pedro", "Gonzalez");
        Persona pau = new Persona(7L, "Pau", "Claris");

        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.añadirPersona(cristina);
        socialNetwork.añadirPersona(juan);
        socialNetwork.añadirPersona(ana);
        socialNetwork.añadirPersona(marc);
        socialNetwork.añadirPersona(antonio);
        socialNetwork.añadirPersona(pedro);
        socialNetwork.añadirPersona(pau);
        System.out.println("Consultar personas por id: ");
        System.out.println("Id 1: " + socialNetwork.getPersona(1L));

        System.out.println("Consultar persona por nombre: ");
        System.out.println("Nombre 1" + socialNetwork.getPersona("Cristina"));




       /* System.out.println("parejas:");
        System.out.println(parejas);


        System.out.println("La pareja de Cristina es: " + parejas.get(cristina));
        System.out.println("La pareja de juan es:" + parejas.inverse().get(juan));


        System.out.println("Introduce el nombre de la persona: ");
        String nombre = sc.next();
        Persona persona = gente.get(nombre);
        Persona pareja=getPareja(persona);

        if(pareja==null) {
            System.out.println("La persona " + nombre + " no tiene pareja");
        }
        else {
            System.out.println("La pareja de " + nombre + " es : " + pareja);
        }

    }

    private static Persona getPareja(Persona persona) {

    }*/


    }

}
