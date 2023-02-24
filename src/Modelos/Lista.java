
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
        }
    }
}
