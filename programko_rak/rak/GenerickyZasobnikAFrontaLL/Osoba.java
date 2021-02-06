/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programko_rak.rak.GenerickyZasobnikAFrontaLL;

/**
 *
 * @author Administrator
 */
public class Osoba {
    String jmeno;
    Osoba otec;
    Osoba matka;
    Osoba(String jmeno, Osoba otec, Osoba matka){
        this.jmeno = jmeno;
        this.otec = otec;
        this.matka = matka;
    }
    String jakSeJmenujes(){
        return jmeno;
    }
    
}
