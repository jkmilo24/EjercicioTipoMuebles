
package tipoinmueble;

public class ApartaEstudio extends Apartamento{
    public ApartaEstudio(int IdInmobiliario, int area, String direccion, double valorAdmon){
        super(IdInmobiliario, area, direccion, 1,1, valorAdmon);
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Este es un apartaestudio.");
    }
    
}
