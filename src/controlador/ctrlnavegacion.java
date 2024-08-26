/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.amarillo;
import vista.frmnavegacion;
import vista.rojo;
import vista.verde;

/**
 *
 * @author Estudiante
 */
public class ctrlnavegacion implements MouseListener{
    frmnavegacion vista;
    
    public ctrlnavegacion (frmnavegacion vista){
    
    this.vista = vista;
    vista.btnrojo.addMouseListener(this);
        vista.btnamarillo.addMouseListener(this);
        vista.btnverde.addMouseListener(this);


    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()== vista.btnverde) {
            verde objVerde = new verde();
            
            vista.jpcontenedor.removeAll();
             vista.jpcontenedor.add(objVerde);

            vista.jpcontenedor.revalidate();
            vista.jpcontenedor.repaint();                                                             

            
        }
        
         if (e.getSource()== vista.btnamarillo) {
             amarillo objamarillo = new amarillo();
            
            vista.jpcontenedor.removeAll();
            vista.jpcontenedor.add(objamarillo);

             vista.jpcontenedor.revalidate();                       
              vista.jpcontenedor.repaint();                        

            
        }
          if (e.getSource()== vista.btnrojo) {
            rojo objrojo= new rojo();
            
            vista.jpcontenedor.removeAll();
            vista.jpcontenedor.add(objrojo);

           vista.jpcontenedor.revalidate();
           vista.jpcontenedor.repaint();

            
        }
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
   
    }

    @Override
    public void mouseExited(MouseEvent e) {
    
    }
    
}
