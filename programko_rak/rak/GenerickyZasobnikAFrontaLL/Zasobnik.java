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
public class Zasobnik {
    int[] pole;
    int vrchol;
    int max;
    Zasobnik (int n){
        pole = new int[n];
        vrchol = -1;
        max = n;
    }
    boolean jePlny(){
        return vrchol==max-1;
    }
    boolean jePrazdny(){
        return vrchol==-1;
    }
    void pridej(int co) throws Exception{
        if (jePlny()) throw new Exception();
        vrchol++;
        pole[vrchol] = co;
    }
    int vyber() throws Exception{
        if (jePrazdny()) throw new Exception();
        vrchol--;
        return(pole[vrchol+1]);
    }
}
