/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class errorHandling {

    public errorHandling() {
    }

public void erTinggi(String erTinggi){
 JOptionPane.showMessageDialog(null, "For input string : '" + erTinggi + "'", "Message", JOptionPane.ERROR_MESSAGE);
}
    
public void erPanjang(String erPanjang){
 JOptionPane.showMessageDialog(null, "For input string : '" + erPanjang + "'", "Message", JOptionPane.ERROR_MESSAGE);
}

public void erLebar(String erLebar){
 JOptionPane.showMessageDialog(null, "For input string : '" + erLebar +"'", "Message", JOptionPane.ERROR_MESSAGE);
}
}