/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Lista;
import Modelos.Nodo;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author carlt
 */
public class NodoController implements ActionListener {
frmPrincipal VistaPrincipal;
Lista ModeloLista;

    public NodoController(frmPrincipal VistaPrincipal, Lista ModeloLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloLista = ModeloLista;
        
        this.VistaPrincipal.btnIngresar.addActionListener(this);
        
        this.VistaPrincipal.setLocationRelativeTo(VistaPrincipal);
        this.VistaPrincipal.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnIngresar)
        {
           
            this.ModeloLista.InsertarNodo(Integer.parseInt(this.VistaPrincipal.txtNumero.getText()));
            
             
            this.VistaPrincipal.txtALista.setText(this.ModeloLista.ListarNodo());
            
            
           
        }
    }
    
}
