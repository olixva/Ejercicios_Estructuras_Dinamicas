import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ej2Test {

    @Test
    void testAdd() {
        Integer numero = 1;
        Ej2 test = new Ej2();
        test.add(numero);
        assertEquals(1, test.numElementos);
        assertEquals(numero, test.get(0));

    }

    @Test
    void testGet() {
        Integer numero = 1;
        Integer numero1 = 2;
        Ej2 test = new Ej2();
        test.add(numero);
        test.add(numero1);
        assertEquals(numero, test.get(0));
        assertEquals(numero1, test.get(1));
        
    }

    @Test
    void testIndexOf() {
        Integer numero = 1;
        Ej2 test = new Ej2();
        test.add(numero);
        assertEquals(0, test.indexOf(numero));
        test.remove(0);
        assertEquals(-1, test.indexOf(numero));
    }

    @Test
    void testRemove() {
        Integer numero = 1;
        Ej2 test = new Ej2();
        test.add(numero);
        assertEquals(0, test.remove(numero));
        assertEquals(-1, test.indexOf(numero));
    }

    @Test
    void testRemove2() {
        Integer numero = 1;
        Ej2 test = new Ej2();
        test.add(numero);
        assertEquals(1, test.remove(0));
        assertEquals(-1, test.indexOf(numero));
    }

    @Test
    void testSize() {
        Integer numero = 1;
        Ej2 test = new Ej2();
        test.add(numero);
        test.add(numero);
        test.add(numero);
        test.add(numero);
        assertEquals(4, test.size());
        test.remove(0);
        assertEquals(3, test.size());
    }
    
}
