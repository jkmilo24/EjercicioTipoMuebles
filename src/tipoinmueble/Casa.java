package tipoinmueble;
public class Casa extends Vivienda {
    protected int numeroPisos;

    public Casa(int IdInmobiliario, int area, String direccion, int habitaciones, int banos, int numeroPisos) {
        super(IdInmobiliario, area, direccion, habitaciones, banos);
        this.numeroPisos = numeroPisos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de Pisos: " + numeroPisos);
    }
}
