import java.io.IOException;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        try {
            Mapa abrir = new Mapa("/home/tareas/Downloads/productos.csv", ",");
            Map<String, String> dataMap = abrir.leerCsvComoHashMap();
            Imprimir impresor = new Imprimir(); // Usar la clase ImprimirHashMap
            impresor.imprimirMapa(dataMap); // Llamar al método imprimirMapa pasando el HashMap
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}