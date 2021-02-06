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
public class Fronta extends Zasobnik{
    Fronta(int n){
        super(n);
    }
    int vyber() throws Exception{
        if (jePrazdny()) throw new Exception();
        int vysledek = pole[0];
        for(int i=0;i<vrchol;i++)
            pole[i] = pole[i+1];
        vrchol--;
        return(vysledek);
    }    
    
    
}
