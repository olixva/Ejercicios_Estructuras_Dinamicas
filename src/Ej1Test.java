import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ej1Test {
    @Test
    void testAdd() {
        Integer numero = 1;
        Ej1 test = new Ej1();
        test.add(numero);
        assertEquals(1, test.size());
        test.add(numero);
        assertEquals(2, test.size());
    }

    @Test
    void testAdd2() {
        Integer numero = 1;
        Ej1 test = new Ej1();
            
    }

    @Test
    void testClear() {
        Integer numero = 1;
        Integer numero2 = 2;
        Ej1 test = new Ej1();
        test.add(numero);
        test.add(numero2);
        test.clear();
        assertEquals(0, test.size());
        assertEquals(false, test.contains(numero));
    }

    @Test
    void testContains() {

    }

    @Test
    void testGet() {

    }

    @Test
    void testIndexOf() {

    }

    @Test
    void testRemove() {

    }

    @Test
    void testRemove2() {

    }

    @Test
    void testSize() {
        Integer numero = 1;
        Ej1 test = new Ej1();
        assertEquals(0, test.size());
        test.add(numero);
        assertEquals(1, test.size());
        test.remove(numero);
        assertEquals(0, test.size());
    }
}
