/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak1class;

/**
 *
 * @author MSI TRIDENT
 */
public class Siswa {
    private int nrp;
    private String nama;
    
    //default data = null data
    public Siswa(){
    }
    
    public Siswa(int nrp, String nama){
        this.nrp = nrp;
        this.nama = nama;
    }
    
    public void SetNRP(int nrp){
        this.nrp = nrp;
    }
    
    public void Info(String tipeSiswa){
        System.out.println(""+tipeSiswa+
                " Nama : "+this.nama+
                " nrp : "+this.nrp);
    }
    
}
