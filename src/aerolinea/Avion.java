package aerolinea;

public class Avion extends Vuelo{
    
    
    private int codigo_avion;
    private String marca_avion;
    
    
    
    public void Avion1(){
        this.codigo_avion = 123;
        this.marca_avion = "TelMex.Air";
        setDia_vuelo("Lunes");
        setHorario_vuelo("06:30am");
        setLugar_vuelo("Mexico");
    }

    public void MostrarAvion1(){   
        Avion1();
        System.out.println("************************");
        System.out.println("Codigo de avion : "+codigo_avion);
        System.out.println("Compania : "+marca_avion);
        System.out.println("Dia de Vuelo : "+getDia_vuelo());
        System.out.println("Despega : "+getHorario_vuelo());
        System.out.println("Destino : "+getLugar_vuelo());
        System.out.println("************************");
        
    }
    
    public void Avion2(){
        this.codigo_avion = 223;
        this.marca_avion = "Avianca.";
        setDia_vuelo("Miercoles");
        setHorario_vuelo("08:00am ");
        setLugar_vuelo("El Salvador");
    }

    public void MostrarAvion2(){
        Avion2();
        System.out.println("************************");
        System.out.println("Codigo de avion : "+codigo_avion);
        System.out.println("Compania : "+marca_avion);
        System.out.println("Dia de Vuelo : "+getDia_vuelo());
        System.out.println("Despega : "+getHorario_vuelo());
        System.out.println("Destino : "+getLugar_vuelo());
        System.out.println("*************************");
        
    }
   
    public int getCodigo_avion() {
        return codigo_avion;
    }

    public void setCodigo_avion(int codigo_avion) {
        this.codigo_avion = codigo_avion;
    }

    public String getMarca_avion() {
        return marca_avion;
    }

    public void setMarca_avion(String marca_avion) {
        this.marca_avion = marca_avion;
    }
    
    
    
}


