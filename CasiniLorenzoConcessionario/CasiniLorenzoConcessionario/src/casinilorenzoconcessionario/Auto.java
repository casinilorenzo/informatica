/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casinilorenzoconcessionario;

import java.util.Objects;

/**
 *
 * @author casini.lorenzo
 */
public class Auto {
    private String marca;
    private String modello;
    private String targa;
    private String carburante;
    private int km;
    private int cilindrata;
    private int potenza;
    private int prezzo;
    
    
    public Auto(String marca, String modello, String targa, String carburante, int km, int cilindrata, int potenza, int prezzo){
        this.marca=marca;
        this.modello=modello;
        this.targa=targa;
        this.carburante=carburante;
        this.km=km;
        this.cilindrata=cilindrata;
        this.potenza=potenza;
        this.prezzo=prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String getTarga() {
        return targa;
    }

    public String getCarburante() {
        return carburante;
    }

    public int getKm() {
        return km;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public int getPotenza() {
        return potenza;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setCarburante(String carburante) {
        this.carburante = carburante;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
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
        final Auto other = (Auto) obj;
        return Objects.equals(this.targa, other.targa);
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modello=" + modello + ", targa=" + targa + ", carburante=" + carburante + ", km=" + km + ", cilindrata=" + cilindrata + ", potenza=" + potenza + ", prezzo=" + prezzo + '}';
    }
    
}
