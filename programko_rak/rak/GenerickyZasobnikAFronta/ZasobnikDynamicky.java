/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programko_rak.rak.GenerickyZasobnikAFronta;

/**
 *
 * @author Administrator
 */
public class ZasobnikDynamicky<T> {
    Object[] pole;
    int vrchol;
    int max;
    ZasobnikDynamicky (int n){
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
    void pridej(T co){
        if (jePlny()){
            Object[] nove = new Object[2*max];
            for(int i=0;i<max;i++)
                nove[i] = pole[i];
            pole = nove;
            max = 2*max;
        }
        vrchol++;
        pole[vrchol] = co;
    }
    T vyber() throws Exception{
        if (jePrazdny()) throw new Exception();
        if (vrchol<max/3){
            Object[] nove = new Object[max/2];
            for(int i=0;i<max/2;i++)
                nove[i] = pole[i];
            pole = nove;
            max = max/2;            
        }
        vrchol--;
        return(T)(pole[vrchol+1]);
    }        
    
}
