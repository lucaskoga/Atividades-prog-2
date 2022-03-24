package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "motorista")
@DiscriminatorValue("motorista")

public class Motorista extends Pessoa implements Serializable{
    
    @Column(length = 30)
    private String cnh;
    @Column(length = 30)
    private String Sessao;
    @Column(length = 30)
    private boolean trabalhando = false;

    

    public Motorista() {

    }

    public Motorista(String nome, Endereco endereco, String cnh, String Sessao) {
        super(nome, endereco);
        this.cnh = cnh;
        this.Sessao = Sessao;
        this.trabalhando = false;
        
    }
    
    public String toString(){
        return getNome();
    }
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getSessao() {
        return Sessao;
    }

    public void setSessao(String Sessao) {
        this.Sessao = Sessao;
    }
    
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }
    
}