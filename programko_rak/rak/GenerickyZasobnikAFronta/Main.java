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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fronta z = new Fronta(1);
        try{
            z.pridej(3);
            //z.pridej(2);
            //z.pridej(3);
            //z.pridej(4);
            System.out.println(z.vyber());
            System.out.println(z.vyber());
            System.out.println(z.vyber());
            System.out.println(z.vyber());
        }
        catch (Exception e){
            System.out.println("Chyba");
        }
        
        
        try{
            ZasobnikDynamicky<Character> z2 = new ZasobnikDynamicky<>(2);
            z2.pridej('a');
            z2.pridej('b');
            z2.pridej('c');
            z2.pridej('d');
            System.out.println(z2.vyber());
            System.out.println(z2.vyber());
            System.out.println(z2.vyber());
            System.out.println(z2.vyber());
        }
        catch (Exception e){
            System.out.println("Chyba");
        }        
        
    }
    
}
