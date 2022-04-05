/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.awt.event.*;
import static java.lang.Float.parseFloat;
import javax.swing.*;

/**
 *
 * @author User
 */
public class GUI extends JFrame implements ActionListener{
    JTextField tinggi = new JTextField();
    JTextField panjang = new JTextField();
    JTextField lebar = new JTextField();
    
    
    JLabel judul = new JLabel("Kalkulator Balok");
    JLabel lpp = new JLabel();
    JLabel kpp = new JLabel();
    JLabel vb = new JLabel();
    JLabel lb = new JLabel();
    JLabel hasil = new JLabel("Hasil : ");
    JLabel ltinggi = new JLabel("Tinggi ");
    JLabel lpanjang = new JLabel("Panjang ");
    JLabel llebar = new JLabel("Lebar ");
    
    
    
    JButton bhitung = new JButton("Hitung");
    JButton breset = new JButton("Reset");

    public GUI() {
        setResizable(false);
        setSize(350, 450);
        setLocationRelativeTo(null);
        
        setLayout(null);
        add(judul);
        add(ltinggi);
        add(lpanjang);
        add(llebar);
        add(tinggi);
        add(panjang);
        add(lebar);
        add(bhitung);
        add(breset);
        add(hasil);
        add(lpp);
        add(kpp);
        add(vb);
        add(lb);
        
        judul.setBounds(100,5,200,20);
        ltinggi.setBounds(25, 50, 200, 20);
        lpanjang.setBounds(25, 125, 200, 20);
        llebar.setBounds(25, 200, 200, 20);
        tinggi.setBounds(100, 50, 150, 20);
        panjang.setBounds(100, 125, 150, 20);
        lebar.setBounds(100, 200, 150, 20);
        bhitung.setBounds(65, 375, 75, 20);
        breset.setBounds(175, 375, 75, 20);
        hasil.setBounds(100, 225, 100, 50);
        lpp.setBounds(10, 250, 300, 50);
        kpp.setBounds(10, 275, 300, 50);
        vb.setBounds(10, 300, 300, 50);
        lb.setBounds(10, 325, 300, 50);
        
        bhitung.addActionListener(this);
        breset.addActionListener(this);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
  

    @Override
    public void actionPerformed(ActionEvent e) {
        errorHandling er = new errorHandling();
        if(e.getSource() == bhitung ){
             float vtinggi = 0, vpanjang = 0, vlebar = 0;
             
            try{   
             vtinggi = parseFloat(this.tinggi.getText());
             }catch(NumberFormatException t){
             er.erTinggi(this.tinggi.getText());
             vtinggi = -1;
             lpp.setText("");
             kpp.setText("");
             vb.setText("");
             lb.setText("");
             }
             
             try{
            vpanjang = parseFloat(this.panjang.getText());
             }catch(NumberFormatException t){
             er.erPanjang(this.panjang.getText());
             vpanjang = -1;
             lpp.setText("");
             kpp.setText("");
             vb.setText("");
             lb.setText("");
             }
                
            try{
            vlebar = parseFloat(this.lebar.getText());
            }catch(NumberFormatException t){
            er.erLebar(this.lebar.getText());
            vlebar = -1;
            lpp.setText("");
            kpp.setText("");
            vb.setText("");
            lb.setText("");
            }
              
          if(vtinggi >= 0 && vpanjang >= 0 && vlebar >= 0){      
          Balok balok = new Balok(vtinggi, vpanjang, vlebar);
          lpp.setText("Luas Persegi                   : "+String.valueOf(balok.Luas()));
          kpp.setText("Keliling Persegi              : "+String.valueOf(balok.Keliling()));
          vb.setText("Volume Balok                 : "+String.valueOf(balok.Volume()));
          lb.setText("Luas Permukaan Balok : "+String.valueOf(balok.Luas(vpanjang, vlebar, vtinggi)));       
          }
        } 
        
        
        if(e.getSource() == breset){
            tinggi.setText("");
            panjang.setText("");
            lebar.setText("");
            lpp.setText("");
            kpp.setText("");
            vb.setText("");
            lb.setText("");
            
            
        
        }
    }
    
    
}
