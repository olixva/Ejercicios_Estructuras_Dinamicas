import java.util.ArrayList;

public class Ej5 {
    public static ArrayList<Integer> listaUnion(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> listaUnion = new ArrayList<Integer>();
        listaUnion.addAll(list1);
        
        
        
        
        return listaUnion;
    }

    public static ArrayList<Integer> listaIntersec(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> listaIntersec = new ArrayList<Integer>();
        for (Integer item : list1) {
            if (list2.contains(item)) {
                listaIntersec.add(item);
            }
        }
        return listaIntersec;
    }

    public static void printLista(ArrayList<Integer> lista) {
        System.out.print("{ ");
        for (Integer elem : lista) {
            System.out.print(elem);
            System.out.print(" ");
        }
        System.out.println("}");
    }

    /*public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
        System.out.print("Primera lista:\t\t");
        printLista(lista1);

        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        System.out.print("Segunda lista:\t\t");
        printLista(lista2);

        ArrayList<Integer> listaUnion = unionListas(lista1, lista2);
        System.out.print("Lista unión:\t\t");
        printLista(listaUnion);

        ArrayList<Integer> listaIntersec = intersecListas(lista1, lista2);
        System.out.print("Lista intersección:\t");
        printLista(listaIntersec);
    }*/
}
