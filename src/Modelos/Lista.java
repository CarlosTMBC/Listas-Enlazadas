
package Modelos;

public class Lista {
    Nodo primero;
    
    public void InsertarNodo(int dato){
        Nodo nodoNuevo = new Nodo(dato);
        if(primero == null){
            primero = nodoNuevo;
        }
        else
        {
            nodoNuevo.siguiente = primero;
            primero = nodoNuevo;
        }
    }
    
    public String ListarNodo()
    {
        Nodo Auxiliar;
        Auxiliar = primero;
        String Cadena = "";
        while(Auxiliar!=null)
        {
            Cadena = Cadena + Auxiliar.getDato() + "\n" ;
            Auxiliar = Auxiliar.siguiente;
        }
        return Cadena;
        
    }
}
