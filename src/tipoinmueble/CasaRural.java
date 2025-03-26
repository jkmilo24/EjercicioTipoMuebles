package tipoinmueble;

public class CasaRural extends Casa {
    protected int distanciaCabecera;
    protected int altitud;

    public CasaRural(int IdInmobiliario, int area, String direccion, int habitaciones, int baños, int numeroPisos, int distanciaCabecera, int altitud) {
        super(IdInmobiliario, area, direccion, habitaciones, baños, numeroPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Distancia a Cabecera: " + distanciaCabecera + " km");
        System.out.println("Altitud: " + altitud + " m");
    }
}
