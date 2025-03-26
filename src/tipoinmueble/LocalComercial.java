package tipoinmueble;
public class LocalComercial extends Local {
    protected String centroComercial;
    public LocalComercial(int IdInmobiliario, int area, String direccion, String tipoLocal, String centroComercial) {
        super(IdInmobiliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Centro Comercial: " + centroComercial);
    }
}
