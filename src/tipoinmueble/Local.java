package tipoinmueble;
public class Local extends TipoInmueble {
    protected String tipoLocal;
    public Local(int IdInmobiliario, int area, String direccion, String tipoLocal) {
        super(IdInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de Local: " + tipoLocal);
    }
}
