import java.util.ArrayList;

public class Ej5 {
    public static ArrayList<Integer> listaUnion(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> listaUnion = new ArrayList<Integer>();
        ArrayList<Integer> listaAux = new ArrayList<Integer>();
        listaUnion.addAll(list1);
        listaAux.addAll(list2);
        listaAux.removeAll(list1);
        listaUnion.addAll(listaAux);
        return listaUnion;
    }

    public static ArrayList<Integer> listaIntersec(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> listaIntersec = new ArrayList<Integer>();
        listaIntersec.addAll(list1);
        listaIntersec.retainAll(list2);
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

}
