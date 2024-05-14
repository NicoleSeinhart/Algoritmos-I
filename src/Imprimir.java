import java.util.Map;
public class Imprimir{
    public void imprimirMapa(Map<String, String> mapa) {
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
