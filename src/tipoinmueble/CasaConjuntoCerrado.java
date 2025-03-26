
package tipoinmueble;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected double valorAdmon;
    protected boolean AreasComunes;
    
    public CasaConjuntoCerrado(int IdInmobiliario, int area, String direccion, int habitaciones, int baños, int numeroPisos, 
            boolean conjuntoCerrado, double valorAdmon, boolean AreasComunes){
        super(IdInmobiliario, area, direccion, habitaciones, baños, numeroPisos, conjuntoCerrado);
        this.valorAdmon = valorAdmon;
        this.AreasComunes = AreasComunes;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Valor Administración: $" + valorAdmon + ", Areas Comunes: " + (AreasComunes ? "Sí" : "No"));
    }
    
}
