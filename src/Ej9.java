//Lista dinamica basada en una pila
public class Ej9 {
    // Atributos
    private Nodo primero; // Referencia a nodo;
    protected int numElementos;

    // Métodos
    /**
     * Constructor que inicializa los atributos al valor por defecto.
     * Lista vacía.
     */
    public Ej9() {
        primero = null;
        numElementos = 0;
    }

    class Nodo {
        // Atributos
        Object dato;
        Nodo siguiente;
        Nodo anterior;
    }

    public void clear() {
        primero = null;
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

    public Object pop() {
        Nodo aux = primero;
        if (numElementos > 1) {
            primero = primero.siguiente; 
        }else{
            primero=null;
        }
        numElementos--;
        return aux;
           
    }

    public void push(Object dato) {
        // variables auxiliares
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        if (numElementos == 0) {
            // Si la lista está vacía enlaza el nuevo nodo el primero.
            primero = nuevo;
        } else {
            nuevo.siguiente = primero;
            primero = nuevo;
        }
        numElementos++;
    }

    public int size(){
        return numElementos;
    }
}