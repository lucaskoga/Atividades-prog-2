package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "operador")
@DiscriminatorValue("operador")

public class Operador extends Pessoa implements Serializable{
    @Column(length = 30)
    private String login;
    @Column(length = 30)
    private String senha;
    @Column(length = 30)
    private boolean operando = false;
    
    public Operador() {
        this.login = "";
        this.senha = "";
    }
    
    public Operador(String nome, Endereco endereco, String login, String senha){
            super(nome, endereco);
            this.login = login;
            this.senha = senha;
    }
    
    @Override
    public String toString(){
       return login;
    }
   
    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isOperando() {
        return operando;
    }

    public void setOperando(boolean operando) {
        this.operando = operando;
    }
    
    
}
