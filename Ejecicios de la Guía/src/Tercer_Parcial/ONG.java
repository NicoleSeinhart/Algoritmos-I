import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Comparator;

public class ONG {
    private String nombre;
    private Map<String, Donante> donantes;
    private List<Donacion> donaciones;

    public ONG(String nombre) {
        this.nombre = nombre;
        this.donantes = new HashMap<>();
        this.donaciones = new ArrayList<>();
    }

    public Donante registrarDonante(String nombre, String apellido) {
        String key = nombre + " " + apellido;
        if (donantes.containsKey(key)) {
            return donantes.get(key);
        }
        Donante donante = new Donante(nombre, apellido);
        donantes.put(key, donante);
        return donante;
    }

    public Donacion cargarDonacion(Donante donante, LocalDate fecha, double monto){
        Donacion donacion = new Donacion(donante, fecha, monto);
        donaciones.add(donacion); 
        return donacion;
    }

    public void mostrarDonantes(){
        List<Donante> listaDonantes = new ArrayList<>(donantes.values());
        listaDonantes.sort(Comparator.comparing(Donante::getNombre));

        System.out.println("Listado de donantes de Codigo Verde");
        for (Donante donante : listaDonantes) {
            System.out.println(donante);
        }
    }
    public void mostrarDonaciones(){
        donaciones.sort(Comparator.comparing(Donacion::getFecha));
        System.out.println("Listado de donaciones de Codigo Verde");
        for (Donacion donacion : donaciones) {
            System.out.println(donacion);
        }
    }
    public void mostrarResultadoFecha(LocalDate fechaLimite){
        int cobradas = 0;
        int rechazadas = 0;
        int pendientes = 0;
        double montoTotalCobradas = 0;
        double maxCobrada = Double.MIN_VALUE;
        double minCobrada = Double.MAX_VALUE;

        for (Donacion donacion : donaciones) {
            if (donacion.getFecha().isAfter(fechaLimite)) {
                continue;
            }
            switch (donacion.getEstado()) {
                case COBRADA:
                    cobradas++;
                    double monto = donacion.getMonto();
                    montoTotalCobradas += monto;
                    if (monto > maxCobrada) maxCobrada = monto;
                    if (monto < minCobrada) minCobrada = monto;
                    break;
                case RECHAZADA:
                    rechazadas++;
                    break;
                case PENDIENTE:
                    pendientes++;
                    break;
            }
        }

        System.out.println("Estado de Resultado de Codigo Verde al " + fechaLimite);
        System.out.println("Cobradas: " + cobradas);
        System.out.println("Rechazadas: " + rechazadas);
        System.out.println("Pendientes: " + pendientes);

        if (cobradas > 0) {
            System.out.println("Monto Total: $ " + montoTotalCobradas);
            System.out.println("Monto máximo: $ " + maxCobrada);
            System.out.println("Monto mínimo: $ " + minCobrada);
            System.out.println("Monto medio: $ " + (montoTotalCobradas / cobradas));
        }
    }
}
