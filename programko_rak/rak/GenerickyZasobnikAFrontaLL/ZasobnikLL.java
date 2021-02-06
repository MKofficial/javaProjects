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
public class ZasobnikLL<T> {
    Object prvek;
    ZasobnikLL dalsi;
    ZasobnikLL vrchol;
    ZasobnikLL(){
        vrchol = null;
    }
    boolean jePrazdny(){
        return vrchol==null;
    }
    void pridej(T co){
        ZasobnikLL<T> novy = new ZasobnikLL<>();
        novy.prvek = co;
        novy.dalsi = vrchol;
        vrchol = novy;
    }
    T vyber() throws Exception{
        if (jePrazdny()) throw new Exception();
        Object hodnota = vrchol.prvek;
        vrchol = vrchol.dalsi;
        return (T)hodnota;
    } 
}
