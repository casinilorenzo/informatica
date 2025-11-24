/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casinilorenzoconcessionario;
import java.util.*;
/**
 *
 * @author casini.lorenzo
 */
public class Test {
    public void Avvia(){
        Scanner input = new Scanner(System.in);
        System.out.println("dimmi la ragione sociale");
        String ragioneSociale = input.nextLine();
        System.out.println("dimmi la partita IVA");
        String pIva = input.nextLine();
        System.out.println("dimmi il parco auto");
        int nAuto=input.nextInt();
        Auto[] parcoAuto=new Auto[nAuto];
        System.out.println("dimmi il saldo auto vendute");
        int saldoAutoVendute = input.nextInt();
        System.out.println("dimmi il saldo auto comprate");
        int saldoAutoComprate = input.nextInt();
        
        for(int i=0; i<nAuto;i++){
        System.out.println("dimmi la marca");
        String marca = input.nextLine();
        System.out.println("dimmi il modello");
        String modello = input.nextLine();
        System.out.println("dimmi la targa");
        String targa = input.nextLine();
        System.out.println("dimmi il carburante");
        String carburante = input.nextLine();
        System.out.println("dimmi i km");
        int km = input.nextInt();
        System.out.println("dimmi la cilindrata");
        int cilindrata = input.nextInt();
        System.out.println("dimmi la potenza");
        int potenza = input.nextInt();
        System.out.println("dimmi il prezzo");
        int prezzo = input.nextInt();
        Auto a = new Auto(marca, modello, targa, carburante, km, cilindrata, potenza, prezzo);
            System.out.println(a.toString());
    }
        
        
    }
}
