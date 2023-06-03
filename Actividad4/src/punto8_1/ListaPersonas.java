package punto8_1;

import java.util.Vector;

public class ListaPersonas {
    Vector listaPersonas;

    public ListaPersonas() {
        listaPersonas = new Vector();
    }
    public void añadirPersona(punto8_1.Persona p) {
        listaPersonas.add(p);
    }
    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
    }
    public void borrarLista() {
        listaPersonas.removeAllElements();
    }
}