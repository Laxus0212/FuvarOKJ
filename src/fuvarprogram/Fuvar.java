
package fuvarprogram;

import java.text.ParseException;


public class Fuvar {
    //taxi_id;indulas;idotartam;tavolsag;viteldij;borravalo;fizetes_modja
    
    private int id;
    private String indulas;
    private int idotartam;
    private double tav;
    private double dij;
    private double borra;
    private String fizMod;

    public Fuvar(String sor) throws ParseException {
        String [] s = sor.split(";");
        this.id = Integer.parseInt(s[0]);
        this.indulas = s[1];
        this.idotartam = Integer.parseInt(s[2]);
        
        
        s[3] = s[3].replace(",", ".");
        this.tav = Double.parseDouble(s[3]);
        s[4] = s[4].replace(",", ".");
        this.dij = Double.parseDouble(s[4]);
        s[5] = s[5].replace(",", ".");
        this.borra = Double.parseDouble(s[5]);
        this.fizMod = s[6];
    }

    public int getId() {
        return id;
    }

    public String getIndulas() {
        return indulas;
    }

    public int getIdotartam() {
        return idotartam;
    }

    public double getTav() {
        return tav;
    }

    public double getDij() {
        return dij;
    }

    public double getBorra() {
        return borra;
    }

    public String getFizMod() {
        return fizMod;
    }

    @Override
    public String toString() {
        return "\tTaxi azonosító: " + id + "\n Fuvar hossza: " + idotartam + " másodperc" + "\n Megtett távolság: " + tav + "\n Viteldíj: " + dij ;
    }
}
