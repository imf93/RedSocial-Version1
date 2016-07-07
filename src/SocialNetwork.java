import com.google.common.collect.*;

import java.util.*;

/**
 * Created by professor on 04/07/2016.
 */
public class SocialNetwork {
    private Map<String, Persona> gentePorNombre = new HashMap<>();
    private Map<Long, Persona> gentePorid = new HashMap<>();
    private BiMap<Persona, Persona> parejas = HashBiMap.create();
    private TreeMultimap<Persona, Persona> multimapamigos = TreeMultimap.create();

    public void añadirPersona(Persona persona) {

        gentePorNombre.put(persona.getNombre(), persona);
        gentePorid.put(persona.getId(), persona);

    }

    public Persona getPersona(Long id) {

        return gentePorid.get(id);

    }

    public Persona getPersona(String nombre) {

        return gentePorNombre.get(nombre);

    }

    public void añadirPareja(Persona persona, Persona p2) {

        VerificarPareja(persona);

        if (parejas.containsKey(p2)

                || parejas.values().contains(persona)) {

            System.out.println("La persona" + p2.getNombre() + "ya tiene pareja");

            throw new RuntimeException("La persona   " + p2.getNombre() +
                    " ya tiene pareja");

        }


        parejas.put(persona, p2);

    }

    private void VerificarPareja(Persona persona) {
        if (parejas.containsKey(persona)

                || parejas.values().contains(persona)) {

            System.out.println("La persona" + persona.getNombre() + "ya tiene pareja");

            throw new RuntimeException("La persona" + persona.getNombre() + "ya tiene pareja");

        }
    }

    public Persona getPareja(Persona persona) {

        Persona pareja = parejas.get(persona);
        if (pareja != null) {
            return pareja;


        } else {
            pareja = parejas.inverse().get(persona);
            return pareja;
        }
    }


    public void añadirAmigos(Persona persona, Persona p2) {


        comprobarAmistad(persona, p2);
        multimapamigos.put(persona, p2);
        multimapamigos.put(p2, persona);







    }

    private void comprobarAmistad(Persona persona, Persona otraPersona) {
        if (multimapamigos.containsKey(persona)
                && multimapamigos.get(persona).contains(otraPersona)) {
            System.out.println(otraPersona.getNombre() + " ya es amigo de " + persona.getNombre());
            throw new RuntimeException(otraPersona.getNombre() + " ya es amigo de " + persona.getNombre());
        }
    }

    public Set<Persona> getAmigos(Persona persona) {

        return multimapamigos.get(persona);


    }


    public Set<Persona> getAmigosPareja(Persona persona) {


        Persona pareja = getPareja(persona);
        if (pareja == null) {

            System.out.println("La persoma" + persona.getNombre() + "no tiene pareja");

        } else {
            return getAmigos(pareja);
        }


        return null;
    }

    public Set<Persona> getParejadeAmigos(Persona persona) {
        Set<Persona> amigos = getAmigos(persona);
        Set<Persona> parejas = new HashSet<>();

        for (Persona amigo : amigos) {

            Persona pareja = getPareja(amigo);

            if (pareja != null) {

                parejas.add(pareja);
            }
        }

        return parejas;
    }


    public Integer getNumerodeamigos(Persona persona) {

        return getAmigos(persona).size();
    }


    public List<Persona> gentemasPopular(Persona persona) {

        List<Persona> listaPersona = new ArrayList<>(gentePorNombre.values());
        Collections.sort(listaPersona, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona, Persona p2) {

                int numeroamigos1 = getNumerodeamigos(persona);
                int numeroamigos2 = getNumerodeamigos(p2);

                if (numeroamigos1 < numeroamigos2) {
                    return 1;
                }
                if (numeroamigos1 > numeroamigos2) {
                    return 2;
                } else return 0;
            }


        });

        return listaPersona;
    }

    public int gradodeConexionPath(Persona persona, Persona p2) {
        return 0;
    }

    public SortedSet<Persona> gradodeConexion(Persona p1, Persona p2) {
        return null;
    }

}
