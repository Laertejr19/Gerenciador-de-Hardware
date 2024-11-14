/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DTO;

/**
 *
 * @author W10
 */
public class LaboratorioDTO {

    private int id_lab;
    private String nome_laboratorio, status_laboratorio;

    public int getIdLab() {
        return id_lab;
    }

    public void setIdLab(int id_lab) {
        this.id_lab = id_lab;
    }

    public String getNomeLab() {
        return nome_laboratorio;
    }

    public void setNomeLab(String nome_laboratorio) {
        this.nome_laboratorio = nome_laboratorio;
    }
    public String getStatusLab(){
        return nome_laboratorio;
    }
    public void setStatusLab(LaboratorioDTO dto){
this.status_laboratorio = nome_laboratorio;
    }
}
