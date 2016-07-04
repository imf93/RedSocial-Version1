import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.*;

public class Main {

    static Map<String, Persona> gente = new HashMap<>();
    static BiMap<Persona, Persona> parejas = HashBiMap.create();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Persona> personaList = new ArrayList<>();


        Persona cristina = new Persona(1L, "Cristina", "Duran");
        Persona juan = new Persona(2L, "Juan", "Martinez");
        Persona ana = new Persona(3L, "Ana", "Gomez");
        Persona marc = new Persona(4L, "Marc", "Fuentes");
        Persona antonio = new Persona(5L, "Antonio", "Martinez");
        Persona pedro = new Persona(6L, "Pedro", "Gonzalez");
        Persona pau = new Persona(7L, "Pau", "Claris");
        gente.put("Cristina", cristina);
        gente.put("Juan", juan);
        gente.put("Ana", ana);
        gente.put("Marc", marc);
        gente.put("Antonio", antonio);
        gente.put("Pedro", pedro);
        gente.put("Pau", pau);

        parejas.put(cristina, juan);
        parejas.put(ana, marc);


        parejas.put(antonio, pedro);
        System.out.println("parejas:");
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
        Persona pareja = parejas.get(persona);
        if (pareja != null) {
            return pareja;


        } else {
            pareja = parejas.inverse().get(persona);
            return pareja;
        }
    }



}
