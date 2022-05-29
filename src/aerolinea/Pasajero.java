package aerolinea;

public final class Pasajero extends Avion {

    String dpi;
    String nombre;
    String apellido;
    int edad;

    public Pasajero() {

    }

    public void PrimeraClase(int boleto) {
        if (boleto == 1) {
            Avion1();
            System.out.println("*******************************************");
            System.out.println("[Boleto NO]: 0000");
            System.out.println("[compania]:" + getMarca_avion() + "    [Destino]:" + getLugar_vuelo());
            System.out.println("[Despega]:" + getHorario_vuelo() + "     [Dia de Vuelo]:" + getDia_vuelo());
            System.out.println("[Datos del Pasajero]");
            System.out.println("[Nombre]:" + getNombre() + " " + getApellido() + "      [Edad]:" + getEdad());
            System.out.println("[NO. DPI]:" + getDpi());
            System.out.println("\n[Costo de Vuelo Primera Clase]: Q1200.00 ");
            System.out.println("-Le deseamos Feliz Viaje-");
            System.out.println("*******************************************");
        } else if (boleto == 2) {
            Avion2();
            System.out.println("*******************************************");
            System.out.println("[Boleto NO]: 0000");
            System.out.println("[compania]:" + getMarca_avion() + "    [Destino]:" + getLugar_vuelo());
            System.out.println("[Despega]:" + getHorario_vuelo() + "     [Dia de Vuelo]:" + getDia_vuelo());
            System.out.println("[Datos del Pasajero]");
            System.out.println("[Nombre]:" + getNombre() + " " + getApellido() + "      [Edad]:" + getEdad());
            System.out.println("[NO. DPI]:" + getDpi());
            System.out.println("\n[Costo de Vuelo Primera Clase]: Q800.00 ");
            System.out.println("-Le deseamos Feliz Viaje-");
            System.out.println("*******************************************");
        }
    }

    public void ClaseEconomica(int boleto) {
        if (boleto == 1) {
            Avion1();
            System.out.println("*******************************************");
            System.out.println("[Boleto NO]: 0000");
            System.out.println("[compania]:" + getMarca_avion() + "    [Destino]:" + getLugar_vuelo());
            System.out.println("[Despega]:" + getHorario_vuelo() + "     [Dia de Vuelo]:" + getDia_vuelo());
            System.out.println("[Datos del Pasajero]");
            System.out.println("[Nombre]:" + getNombre() + " " + getApellido() + "      [Edad]:" + getEdad());
            System.out.println("[NO. DPI]:" + getDpi());
            System.out.println("\n[Costo de Vuelo Clase Economica]: Q600.00 ");
            System.out.println("-Le deseamos Feliz Viaje-");
            System.out.println("*******************************************");
        } else if (boleto == 2) {
            Avion2();
            System.out.println("*******************************************");
            System.out.println("[Boleto NO]: 0000");
            System.out.println("[compania]:" + getMarca_avion() + "    [Destino]:" + getLugar_vuelo());
            System.out.println("[Despega]:" + getHorario_vuelo() + "     [Dia de Vuelo]:" + getDia_vuelo());
            System.out.println("[Datos del Pasajero]");
            System.out.println("[Nombre]:" + getNombre() + " " + getApellido() + "      [Edad]:" + getEdad());
            System.out.println("[NO. DPI]:" + getDpi());
            System.out.println("\n[Costo de Vuelo Clase Economica]: Q400.00 ");
            System.out.println("-Le deseamos Feliz Viaje-");
            System.out.println("*******************************************");
        }
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
