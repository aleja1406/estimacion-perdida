import java.util.ArrayList;
import java.util.List;

public class Result {

    public static List<Integer> estimacionPerdida(List<Integer> datos) {


        int N;
        int T;
        int R;
        int operacion;
        List<Integer> resultado = new ArrayList<>();

        N=datos.get(0);
        T=datos.get(1);
        R=datos.get(2);

        operacion=N*T-(R*(N-1));

        resultado.add(operacion);

        return resultado;

    }

}
