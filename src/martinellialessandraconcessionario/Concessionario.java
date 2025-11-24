/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package martinellialessandraconcessionario;

/**
 *
 * @author martinelli.alessandr
 */
public class Concessionario {
    private String ragioneSociale;
    private Macchina[] parcoAuto;
    private int partitaIva;
    private Integer saldoAutoVendute;
    private Integer saldoAutoComprate;
    
    public Concessionario(String ragioneSociale, Macchina[] parcoAuto, int partitaIva, Integer saldoAutoVendute, Integer saldoAutoComprate){
        this.ragioneSociale=ragioneSociale;
        this.parcoAuto=parcoAuto;
        this.partitaIva=partitaIva;
        this.saldoAutoVendute=saldoAutoVendute;
        this.saldoAutoComprate=saldoAutoComprate;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public Macchina[] getParcoAuto() {
        return parcoAuto;
    }

    public int getPartitaIva() {
        return partitaIva;
    }

    public Integer getSaldoAutoVendute() {
        return saldoAutoVendute;
    }

    public Integer getSaldoAutoComprate() {
        return saldoAutoComprate;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public void setParcoAuto(Macchina[] parcoAuto) {
        this.parcoAuto = parcoAuto;
    }

    public void setPartitaIva(int partitaIva) {
        this.partitaIva = partitaIva;
    }

    public void setSaldoAutoVendute(Integer saldoAutoVendute) {
        this.saldoAutoVendute = saldoAutoVendute;
    }

    public void setSaldoAutoComprate(Integer saldoAutoComprate) {
        this.saldoAutoComprate = saldoAutoComprate;
    }
}
