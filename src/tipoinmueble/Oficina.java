package tipoinmueble;
public class Oficina extends Local {
    protected boolean esGobierno;
    public Oficina(int IdInmobiliario, int area, String direccion, String tipoLocal, boolean esGobierno) {
        super(IdInmobiliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Oficina de Gobierno: " + (esGobierno ? "Sí" : "No"));
    }
}
