/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DTO;


public class EquipamentoDTO {
    
    
    private String nome_maquina, laboratorio_maquina, processador_maquina, ram_maquina, armazenamento_maquina, data_maquina, serie_maquina;

    public String getNome() {
        return nome_maquina;
    }

    public void setNome(String nome_maquina) {
        this.nome_maquina = nome_maquina;
    }

    public String getLaboratorio() {
        return laboratorio_maquina;
    }

    public void setLaboratorio(String laboratorio_maquina) {
        this.laboratorio_maquina = laboratorio_maquina;
    }

    public String getProcessador() {
        return processador_maquina;
    }

    public void setProcessador(String processador_maquina) {
        this.processador_maquina = processador_maquina;
    }

    public String getRam() {
        return ram_maquina;
    }

    public void setRam(String ram_maquina) {
        this.ram_maquina = ram_maquina;
    }

    public String getArmazenamento() {
        return armazenamento_maquina;
    }

    public void setArmazenamento(String armazenamento_maquina) {
        this.armazenamento_maquina = armazenamento_maquina;
    }
    public String getData() {
        return data_maquina;
    }

    public void setData(String data_maquina) {
        this.data_maquina = data_maquina;
    }
    public String getSerie() {
        return serie_maquina;
    }

    public void setSerie(String serie_maquina) {
        this.serie_maquina = serie_maquina;
    }
}

