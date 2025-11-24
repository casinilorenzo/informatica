/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casinilorenzoconcessionario;

/**
 *
 * @author casini.lorenzo
 */
public class Concessionario {

    private String ragioneSociale;
    private String pIva;
    private Auto[] parcoAuto;
    private int saldoVendite;

    public Concessionario(String ragioneSociale, String pIva, Auto[] parco, int saldoVendite) {
        this.pIva = pIva;
        this.parcoAuto = parcoAuto;
        this.ragioneSociale = ragioneSociale;
        this.saldoVendite = saldoVendite;
    }

    public int cercaTarga(String targa) {
        int i = 0;
        for (Auto a : parcoAuto) {
            i++;
            if (a.getTarga().equalsIgnoreCase(targa)) {
                return i;
            }
        }
        return -1;
    }

    public void vendo(String targa) {
        int p = cercaTarga(targa);

        if (p == -1) {
            System.out.println("Auto non trovata!");
            return;
        }
        Auto a = parcoAuto[p];
        if (a != null) {
            saldoVendite += a.getPrezzo();
            parcoAuto[p] = null;
            System.out.println("Venduta: " + targa);
        }
        System.out.println("Saldo vendite: " + saldoVendite);
    }

    public int cercaPosizione() {
        int i = 0;
        for (Auto a : parcoAuto) {

            if (parcoAuto[i] == null) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void aggiungiAuto(Auto a) {
        int p = cercaPosizione();
        if (p == -1) {
            System.out.println("Parco auto pieno");
        } else {
            parcoAuto[p] = a;
            System.out.println("Auto aggiunta in posizione " + p);
        }
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public String getpIva() {
        return pIva;
    }

    public Auto[] getParcoAuto() {
        return parcoAuto;
    }

    public int getSaldoVendite() {
        return saldoVendite;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }

    public void setParcoAuto(Auto[] parcoAuto) {
        this.parcoAuto = parcoAuto;
    }

    public void setSaldoVendite(int saldoVendite) {
        this.saldoVendite = saldoVendite;
    }

    @Override
    public String toString() {
        return "Concessionario{" + "ragioneSociale=" + ragioneSociale + ", pIva=" + pIva + ", parcoAuto=" + parcoAuto + ", saldoVendite=" + saldoVendite + '}';
    }
    
}
