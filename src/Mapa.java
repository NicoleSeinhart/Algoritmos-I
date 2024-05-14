import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    protected String path;
    protected String delimitador;

    public Mapa(String p, String d) {
        path = p;
        delimitador = d;
    }

    public Map<String, String> leerCsvComoHashMap() throws IOException {
        Map<String, String> dataMap = new HashMap<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(path))) {
            String[] encabezados = lector.readLine().split(delimitador);
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] valores = linea.split(delimitador);
                for (int i = 0; i < encabezados.length; i++) {
                    dataMap.put(encabezados[i], valores[i]);
                }
            }
        }
        return dataMap;
    }
}

