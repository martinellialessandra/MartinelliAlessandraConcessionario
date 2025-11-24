/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package martinellialessandraconcessionario;

import java.util.Objects;

/**
 *
 * @author martinelli.alessandr
 */
public class Macchina {
    private String marca;
    private String modello;
    private String targa;
    private int prezzo;
    private int km;
    private String colore;
    private String alimentazione;
    private int potenza;
    private int cilindrata;
    
    public Macchina(String marca, String modello, String targa, int prezzo, int km, String colore, String alimentazione, int potenza, int cilindrata){
        this.marca=marca;
        this.modello=modello;
        this.targa=targa;
        this.prezzo=prezzo;
        this.km=km;
        this.colore=colore;
        this.alimentazione=alimentazione;
        this.potenza=potenza;
        this.cilindrata=cilindrata;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getModello(){
        return modello;
    }
    public String getTarga(){
        return targa;
    }
    public int getPrezzo(){
        return prezzo;
    }
    public int getKm(){
        return km;
    }
    public String getColore(){
        return colore;
    }
    public String getAlimentazione(){
        return alimentazione;
    }
    public int getPotenza(){
        return potenza;
    }
    public int getCilindrata(){
        return cilindrata;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public void setModello(String modello){
        this.modello=modello;
    }
    
    public void setTarga(String targa){
        this.targa=targa;
    } 
    
    public void setPrezzo(int prezzo){
        this.prezzo=prezzo;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return "Macchina{" + "marca=" + marca + ", modello=" + modello + ", targa=" + targa + ", prezzo=" + prezzo + ", km=" + km + ", colore=" + colore + ", alimentazione=" + alimentazione + ", potenza=" + potenza + ", cilindrata=" + cilindrata + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Macchina other = (Macchina) obj;
        return Objects.equals(this.targa, other.targa);
    }
    
    
    
}
