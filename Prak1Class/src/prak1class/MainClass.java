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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Siswa siswaReguler = new Siswa();
        Siswa siswaLJ = new Siswa(10, "Budi");
        Siswa siswaPJJ = new Siswa();

        siswaReguler.Info("Reguler");
        siswaLJ.Info("LJ");
        siswaPJJ.Info("PJJ");
        
        siswaReguler.SetNRP(20);
        System.out.println("");

        siswaReguler.Info("Reguler");
        siswaLJ.Info("LJ");
        siswaPJJ.Info("PJJ");

    }

}
