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

        Persona julia = new Persona(7L, "Julia", "Perez");
        Persona carol = new Persona(8L, "Carol", "Palomares");

        //Añadir a las personas
        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.añadirPersona(cristina);
        socialNetwork.añadirPersona(juan);
        socialNetwork.añadirPersona(ana);
        socialNetwork.añadirPersona(marc);
        socialNetwork.añadirPersona(antonio);
        socialNetwork.añadirPersona(pedro);
        socialNetwork.añadirPersona(carol);
        socialNetwork.añadirPersona(julia);

//cambios

        System.out.println("Consultar personas por id: ");
        System.out.println("Id 1: " + socialNetwork.getPersona(1L));

        System.out.println("Consultar persona por nombre: ");
        System.out.println("Nombre 1" + socialNetwork.getPersona("Cristina"));

        //Añadir a las parejas

        socialNetwork.añadirPareja(cristina, juan);
        socialNetwork.añadirPareja(ana, marc);
        socialNetwork.añadirPareja(antonio, pedro);
        //   socialNetwork.añadirPareja(julia,pedro);


        //Añadir a los amigos


        socialNetwork.añadirAmigos(cristina, pedro);

        //  socialNetwork.añadirAmigos(pedro, cristina);

        socialNetwork.añadirAmigos(pedro, julia);
        socialNetwork.añadirAmigos(julia, carol);
        socialNetwork.añadirAmigos(julia, ana);
        socialNetwork.añadirAmigos(ana, antonio);
        socialNetwork.añadirAmigos(antonio, marc);
        socialNetwork.añadirAmigos(marc, juan);
        socialNetwork.añadirAmigos(juan, antonio);

        System.out.println("La pareja de Cristina es : " + socialNetwork.getPareja(cristina));
        System.out.println("La pareja de Juan es : " + socialNetwork.getPareja(juan));

        System.out.println("La pareja de ana es : " + socialNetwork.getPareja(ana));
        System.out.println("La pareja de marc es : " + socialNetwork.getPareja(marc));

        System.out.println("La pareja de Pedro  es : " + socialNetwork.getPareja(pedro));
        System.out.println("La pareja de Antonio es : " + socialNetwork.getPareja(antonio));

        System.out.println("Los amigos de Juan son : " + socialNetwork.getAmigos(juan));
        System.out.println("Los amigos de Cristina son : " + socialNetwork.getAmigos(cristina));
        System.out.println("Los amigos de Pedro son : " + socialNetwork.getAmigos(pedro));
        System.out.println("Los amigos de Julia son : " + socialNetwork.getAmigos(julia));
        System.out.println("Los amigos de Marc son : " + socialNetwork.getAmigos(marc));
        System.out.println("Los amigos de Antonio son : " + socialNetwork.getAmigos(antonio));
        System.out.println("Los amigos de Carol son : " + socialNetwork.getAmigos(carol));
        System.out.println("Los amigos de ana son : " + socialNetwork.getAmigos(ana));


        System.out.println("Los amigos de la pareja de Juan son: " + socialNetwork.getAmigosPareja(juan));
        System.out.println("Los amigos de la pareja de Ana son: " + socialNetwork.getAmigosPareja(ana));
        System.out.println("Los amigos de la pareja de pedro son" + socialNetwork.getAmigosPareja(pedro));
        //Prueba para comprobar que no tiene pareja
        System.out.println("Los amigos de la pareja de carol son: " + socialNetwork.getAmigosPareja(carol));

//Muestra la pareja de los amigos
        System.out.println("La pareja de los amigos de Julia son: " + socialNetwork.getParejadeAmigos(julia));
        System.out.println("La pareja de los amigos de Juan son: " + socialNetwork.getParejadeAmigos(juan));


        //Numero de amigos

        System.out.println("El numero de amigos de Antonio son: " + socialNetwork.getNumerodeamigos(antonio));
        System.out.println("El numero de amigos de Pedro son: " + socialNetwork.getNumerodeamigos(pedro));
        System.out.println("El numero de amigos de Marc son: " + socialNetwork.getNumerodeamigos(marc));
        System.out.println("El numero de amigos de Ana son: " + socialNetwork.getNumerodeamigos(ana));
        System.out.println("El numero de amigos de Juan son: " + socialNetwork.getNumerodeamigos(juan));
        System.out.println("El numero de amigos de Cristina son: " + socialNetwork.getNumerodeamigos(cristina));
        System.out.println("El numero de amigos de Julia son: " + socialNetwork.getNumerodeamigos(julia));
        System.out.println("El numero de amigos de Carol son: " + socialNetwork.getNumerodeamigos(carol));




        System.out.println("Popularidad" + socialNetwork.gentemasPopular(cristina));


/*
        System.out.println("parejas:");
        System.out.println(parejas);


        System.out.println("La pareja de Cristina es: " + getPareja(cristina));
        System.out.println("La pareja de juan es:" + getPareja().inverse();


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
