import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> datos= new ArrayList<>();

        datos.add(4);
        datos.add(1);
        datos.add(1);

        List<Integer> re=Result.estimacionPerdida(datos);

        System.out.println(re);
    }
}
