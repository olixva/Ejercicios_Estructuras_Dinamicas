import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ej3Test {
    @Test
    void testAdd() {
        Integer numero = 1;
        Integer numero1 = 2;
        Ej3 test = new Ej3();
        test.add(numero);
        test.add(numero);
        test.add(numero);
        test.add(1, numero1);
        assertEquals(numero1, test.get(1));
    }
}
