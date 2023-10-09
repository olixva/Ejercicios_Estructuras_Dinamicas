import java.util.Queue;

//Lista dinamica basada en una cola
public class Ej8 {
    // Atributos
    private Nodo primero; // Referencia a nodo
    private Nodo ultimo;
    protected int numElementos;
};
    // Métodos
    /**
     * Constructor que inicializa los atributos al valor por defecto.
     * Lista vacía.
     */
    public Ej8() {
        primero = null;
        numElementos = 0;
    }

    class Nodo {
        // Atributos
        Object dato;
        Nodo siguiente;
    }

    

    public void clear() {
        primero = null;
        ultimo = null;
        numElementos = 0;
    }

    public Boolean contains(Object dato) {
        Nodo aux = primero;
        for (int i = 0; i != numElementos | aux.dato != dato; i++) {
            aux = aux.siguiente;
        }
        if (aux.dato == dato) {
            return true;
        }else{
            return false;
        }
    }

    public Boolean isEmpty() {
        if (numElementos == 0) return true;    
        else return false; 
    }

    public Object peek() {
        return primero;
    }

    public Object poll() {
        Nodo aux = primero;
        if (numElementos > 1) {
            primero = primero.siguiente; 
        }else{
            primero=null;
            ultimo=null;
        }
        numElementos--;
        return aux;
           
    }

    public void offer(Object dato) {
        // variables auxiliares
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        if (numElementos == 0) {
            // Si la lista está vacía enlaza el nuevo nodo el primero.
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
        numElementos++;
    }

    public int size(){
        return numElementos;
    }
}