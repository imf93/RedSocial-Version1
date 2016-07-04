import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/**
 * Created by professor on 04/07/2016.
 */
public class SocialNetwork {
    private Map<String, Persona> gentePorNombre = new HashMap<>();
    private Map<Long, Persona> gentePorid = new HashMap<>();
    private BiMap<Persona, Persona> parejas = HashBiMap.create();

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
        parejas.put(persona, p2);

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


    public void añadirParejaAmigos(Persona persona, Persona p2) {


    }

    public Set<Persona> getAmigos(Persona persona) {


        return null;
    }

    public Set<Persona> getAmigosPareja(Persona persona) {
        return null;
    }

    public Set<Persona> getAmigosdeCadaUno(Persona persona) {


        return null;
    }

    public Set<Persona> gentemasPopular(Persona persona) {
        return null;
    }

    public int gradodeConexionPath(Persona persona, Persona p2) {
        return 0;
    }

    public SortedSet<Persona> gradodeConexion(Persona p1, Persona p2) {
        return null;
    }

}
