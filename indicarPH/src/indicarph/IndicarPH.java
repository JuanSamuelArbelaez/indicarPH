package indicarph;

import javax.swing.JOptionPane;

public class IndicarPH
{
    public static void main(String[] args)
    {
        String sustancia, pHS;
        float pHF;
        
        sustancia=leerString("Ingrese el nombre de la sustancia: ");
        pHF=leerFloat("Ingrese el pH de "+sustancia+": ");
        
        pHS=indicarPH(pHF);
        
        imprimirMensaje(sustancia+" tiene un pH "+pHS);
    }
    
    public static String indicarPH(float pHF)
    {
        String pHString;
        
        if (pHF>=-1 && pHF<7)
        {
            pHString="ácido";
        }
        else if (pHF>=7 && pHF<=8.2)
        {
            pHString="neutro";
        }
        else if(pHF>8.2 && pHF<=14)
        {
            pHString="básico";
        }
        else
        {
            pHString="ingresado invalido";
        }
        
        return pHString;
    }
    
    public static String leerString(String mensaje)
    {
        return JOptionPane.showInputDialog(mensaje);
    }
    
    public static float leerFloat(String mensaje)
    {
        return Float.parseFloat(JOptionPane.showInputDialog(mensaje));
    }
    
    public static void imprimirMensaje(String mensaje) //Funcion que imprime un mensaje
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}