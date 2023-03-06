import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ej4Test {
    @Test
    void testRemoveAll() {
        Integer numero = 1;
        Integer numero1 = 2;
        Integer numero2 = 3;
        Integer numero3 = 4;
        
        Ej4 lista = new Ej4();
        lista.add(numero);
        lista.add(numero1);
        lista.add(numero2);
        lista.add(numero3);

        Ej4 borrar = new Ej4();
        borrar.add(numero);
        borrar.add(numero1);
        borrar.add(numero2);
        
        lista.removeAll(borrar);
        assertEquals(-1, lista.indiceOf(numero));
        assertEquals(-1, lista.indiceOf(numero1));
        assertEquals(-1, lista.indiceOf(numero2));
    }
}
