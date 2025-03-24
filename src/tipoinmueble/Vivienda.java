
package tipoinmueble;

public class Vivienda extends TipoInmueble{
    
    protected int habitaciones;
    protected int baños;
    
    public Vivienda(int IdInmobiliario, int area, String direccion, int habitaciones, int baños){
        super(IdInmobiliario, area, direccion);
        this.habitaciones = habitaciones;
        this.baños = baños;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Habitaciones: " + habitaciones);
        System.out.println("Baños: " + baños);     
    }
}
