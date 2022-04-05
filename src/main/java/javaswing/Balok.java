/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

/**
 *
 * @author User
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {

protected float tinggi;

    public Balok(float tinggi, float panjang, float lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    
    @Override
    public float Volume() {
       float vol = panjang * lebar * tinggi;
        return vol;
    }
  
    public float Luas(float panjang, float lebar, float tinggi){
    float lpermukaan = (panjang * lebar + lebar * tinggi + tinggi * panjang) * 2;
        return lpermukaan;
    }
    
    
}