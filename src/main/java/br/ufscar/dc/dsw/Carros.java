package br.ufscar.dc.dsw;

import java.util.ArrayList;

public class Carros {
    private Long id, loja_id, ano, quilometragem;
    private String placa, modelo, chassi, descricao;
    private float valor;
    private ArrayList<String> imagens;

    public Carros(Long id, Long loja_id, Long ano, Long quilometragem, String placa, String modelo, String chassi, String descricao, float valor, ArrayList<String> imagens){
        this.chassi = chassi;
        this.descricao = descricao;
        this.id = id;
        this.imagens = imagens;
        this.modelo = modelo;
        this.placa = placa;
        this.valor = valor;
        this.ano = ano;
        this.loja_id = loja_id;
        this.quilometragem = quilometragem;
    }

    public String getChassi() {
        return chassi;
    }
    public Long getAno() {
        return ano;
    }
    public Long getLoja_id() {
        return loja_id;
    }
    public Long getQuilometragem() {
        return quilometragem;
    }
    public String getDescricao() {
        return descricao;
    }
    public Long getId() {
        return id;
    }
    public ArrayList<String> getImagens() {
        return imagens;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public float getValor() {
        return valor;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public void setAno(Long ano) {
        this.ano = ano;
    }
    public void setLoja_id(Long loja_id) {
        this.loja_id = loja_id;
    }
    public void setQuilometragem(Long quilometragem) {
        this.quilometragem = quilometragem;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
}