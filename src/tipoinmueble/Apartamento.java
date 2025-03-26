
package tipoinmueble;

public class Apartamento extends Vivienda{
    protected double valorAdmon;
    
    public Apartamento(int IdInmobiliario, int area, String direccion, int habitaciones, int baños, double valorAdmon){
        super(IdInmobiliario, area, direccion, habitaciones, baños);
        this.valorAdmon = valorAdmon;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Valor Administración: $" + valorAdmon);
    }
    
}
