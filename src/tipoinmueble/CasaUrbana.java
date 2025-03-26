
package tipoinmueble;

public class CasaUrbana extends Casa {
    protected boolean conjuntoCerrado;
    
    public CasaUrbana(int IdInmobiliario, int area, String direccion, int habitaciones, int baños, int numeroPisos, boolean conjuntoCerrado){
        super(IdInmobiliario, area, direccion, habitaciones, baños, numeroPisos);
        this.conjuntoCerrado = conjuntoCerrado;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Conjunto Cerrado: " + (conjuntoCerrado ? "Sí" : "No"));
    }
}
