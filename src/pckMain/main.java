/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckMain;

import Controladores.NodoController;
import Modelos.Lista;
import Vistas.frmPrincipal;

/**
 *
 * @author umg
 */
public class main {
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        Lista nuevaLista = new Lista();
        NodoController Controlador = new NodoController(VistaPrincipal,nuevaLista);
    }
}
