import java.util.ArrayList;
public class Ej5Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
        System.out.print("Primera lista:\t\t");
        Ej5.printLista(lista1);

        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        System.out.print("Segunda lista:\t\t");
        Ej5.printLista(lista2);

        ArrayList<Integer> listaUnion = Ej5.listaUnion(lista1, lista2);
        System.out.print("Lista unión:\t\t");
        Ej5.printLista(listaUnion);

        ArrayList<Integer> listaIntersec = Ej5.listaIntersec(lista1, lista2);
        System.out.print("Lista intersección:\t");
        Ej5.printLista(listaIntersec);
    }
}
