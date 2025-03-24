
package tipoinmueble;

public class TipoInmueble {

    protected int IdInmobiliario;
    protected int area;
    protected String direccion;
    
    public TipoInmueble(int IdInmobiliario, int area, String direccion){
        this.IdInmobiliario = IdInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }
    
    public int getIdInmobiliario(){
        return IdInmobiliario;
    }
            
    public void setIdInmobiliario(int IdInmobiliario){
        this.IdInmobiliario=IdInmobiliario;
    }
    
   public int getArea(){
        return area;
    }
    
    public void setArea(int area){
        if (area > 0) this.area = area;
        else System.out.println("El área debe ser mayor a 0.");
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    
    public void imprimir(){
        System.out.println("Identificador Inmobiliario: " + IdInmobiliario);     
        System.out.println("Area en Metros Cuadrados: " + area);     
        System.out.println("Direccion: " + direccion);     
    }
          
}
