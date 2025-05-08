/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo2;

/**
 *
 * @author user
 */
import java.util.ArrayList;


public class KelasMahasiswa {
    
    private String namaKelas;
    private ArrayList<Mahasiswa> listMahasiswa;
    
    
    public KelasMahasiswa(String namaKelas) {
        this.namaKelas = namaKelas;
        this.listMahasiswa = new ArrayList<>();
    }
    
    
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        listMahasiswa.add(mahasiswa);
    }
    
    public String tampilkanSemuaBiodata() {
        StringBuilder result = new StringBuilder();
        result.append("Daftar Mahasiswa UTB ").append(namaKelas).append(":\n\n");
        
        if (listMahasiswa.isEmpty()) {
            result.append("Belum ada mahasiswa yang terdaftar.");
        } else {
            for (int i = 0; i < listMahasiswa.size(); i++) {
                result.append("Mahasiswa ke-").append(i + 1).append("\n");
                result.append(listMahasiswa.get(i).tampilkanBiodata()).append("\n\n");
            }
        }
        
        return result.toString();
    }
    
    
    public String getNamaKelas() {
        return namaKelas;
    }
    
    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }
    
    public ArrayList<Mahasiswa> getListMahasiswa() {
        return listMahasiswa;
    }
}
