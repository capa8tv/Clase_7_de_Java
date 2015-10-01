
package tallerjava7;

import javax.swing.JOptionPane;
public class TallerJava7 {

    
    public static void main(String[] args) {
       
        String numero=JOptionPane.showInputDialog("Ingrese un número");
        int num=(int)Integer.parseInt(numero);
        String paises[]=new String[num];
        for(int i=0;i<paises.length;i++)
        {
            paises[i]=JOptionPane.showInputDialog("Ingrese el país con el número "+(i+1));
        }
        for(String pais : paises)
        {
            System.out.println("El país es "+pais);
        }
       
        
    }
    
}
