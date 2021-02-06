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
public class ZasobnikObecne<T> {
    Object[] pole;
    int vrchol;
    int max;
    ZasobnikObecne (int n){
        pole = new Object[n];
        vrchol = -1;
        max = n;
    }
    boolean jePlny(){
        return vrchol==max-1;
    }
    boolean jePrazdny(){
        return vrchol==-1;
    }
    void pridej(T co) throws Exception{
        if (jePlny()) throw new Exception();
        vrchol++;
        pole[vrchol] = co;
    }
    T vyber() throws Exception{
        if (jePrazdny()) throw new Exception();
        vrchol--;
        return(T)(pole[vrchol+1]);
    }    
}
