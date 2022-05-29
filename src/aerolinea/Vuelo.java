package aerolinea;

public class Vuelo {

    private String horario_vuelo;
    private String dia_vuelo;
    private String lugar_vuelo;

    public String getLugar_vuelo() {
        return lugar_vuelo;
    }

    public void setLugar_vuelo(String lugar_vuelo) {
        this.lugar_vuelo = lugar_vuelo;
    }

    /**
     * @return the horario_vuelo
     */
    public String getHorario_vuelo() {
        return horario_vuelo;
    }

    /**
     * @param horario_vuelo the horario_vuelo to set
     */
    public void setHorario_vuelo(String horario_vuelo) {
        this.horario_vuelo = horario_vuelo;
    }

    /**
     * @return the dia_vuelo
     */
    public String getDia_vuelo() {
        return dia_vuelo;
    }

    /**
     * @param dia_vuelo the dia_vuelo to set
     */
    public void setDia_vuelo(String dia_vuelo) {
        this.dia_vuelo = dia_vuelo;
    }



}
