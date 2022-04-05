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
public class PersegiPanjang implements MenghitungBidang {
    protected float panjang;
    protected float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float Luas() {
       float luas = panjang * lebar;
       return luas;
    }

    @Override
    public float Keliling() {
     float kel = 2 * (panjang + lebar);
        return kel;   
    }
    
    

    
}
