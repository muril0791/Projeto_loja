/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author muril
 */
public class produtos {

    private String codigo = "";
    private String nome = "";
    private String quantidade = "";
    private String tipo = "";
    private String valorcompra = "";
    private String valorvenda = "";

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(String valorcompra) {
        this.valorcompra = valorcompra;
    }

    public String getValorvenda() {
        return valorvenda;
    }

    public void setValorvenda(String valorvenda) {
        this.valorvenda = valorvenda;
    }

    public void limpaCliente() {
        codigo = "";
        quantidade = "";
        nome = "";
        tipo = "";
        valorcompra = "";
        valorvenda = "";

    }

}
