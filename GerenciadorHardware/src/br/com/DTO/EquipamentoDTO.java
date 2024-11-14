/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DTO;

public class EquipamentoDTO {

    private int id_maq;
    private String nome_maquina, status, tipo; 

    public int getIdMaq() {
        return id_maq;
    }

    public void setIdMaq(int id) {
        this.id_maq = id_maq;
    }

    public String getNome_maquina() {
        return nome_maquina;
    }

    public void setNome_maquina(String nome_maquina) {
        this.nome_maquina = nome_maquina;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
