import java.util.Random;
import java.util.ArrayList;

public static ArrayList<Integer> arvot(Random rnd) {
    ArrayList<Integer> lukuLista;
    lukuLista = new ArrayList<Integer>();
    for (int i = 0; i < 5; i++){
        lukuLista.add(rnd.nextInt(10) + 1);
    }
    return lukuLista;
}