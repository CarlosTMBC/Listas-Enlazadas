/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckMain;

import Modelos.Lista;

/**
 *
 * @author umg
 */
public class main {
    public static void main(String[] args) {
        Lista nuevaLista = new Lista();
        nuevaLista.InsertarNodo(10);
        nuevaLista.InsertarNodo(20);
        nuevaLista.InsertarNodo(30);
        nuevaLista.ListarNodo();
    }
}
