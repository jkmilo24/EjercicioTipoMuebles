
package tipoinmueble;

public class Principal {
    public static void main(String [] args){
        Vivienda TipoVivienda = new Vivienda(1, 180, "Cr 35 C #48", 4, 2);
        CasaRural casaRural = new CasaRural(1, 150, "Cr 26 C C", 3, 4, 2, 10, 1200);
        CasaConjuntoCerrado casaCC = new CasaConjuntoCerrado(2, 200, "Calle 123", 5, 4, 3, true, 500000, false);
        ApartaEstudio apartaestudio = new ApartaEstudio(3, 40, "Cra 45 #10-20", 4000);
        LocalComercial localComercial = new LocalComercial(4, 80, "Av. Principal", "Calle", "CC CHIPICHAPE");
        Oficina oficina = new Oficina(5, 100, "Calle 15 #48", "Interno", true);
        
        
        System.out.println("\n Información de los inmuebles:");
        TipoVivienda.imprimir();
        System.out.println();
        casaRural.imprimir();
        System.out.println();
        casaCC.imprimir();
        System.out.println();
        apartaestudio.imprimir();
        System.out.println();
        localComercial.imprimir();
        System.out.println();
        oficina.imprimir();
    }
    
}
