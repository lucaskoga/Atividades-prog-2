package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "veiculo")
public class Veiculo implements Serializable{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   @Column(length = 30)
   private String marca;
   @Column(length = 30)
   private String modelo;
   @Column(length = 8)
   private String placa;
   @Column(length = 30)
   private boolean alocado = false;

   public Veiculo(){
       this.marca = "";
       this.modelo = "";
       this.placa = "";
       this.alocado = false;
   }

    public Veiculo(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.alocado = false;
    }

   @Override
   public String toString(){
       return marca + " " + modelo + ", Placa: " + placa;
   }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public void setAlocado(boolean alocado) {
        this.alocado = alocado;
    }
    
    public boolean isAlocado() {
        return alocado;
    }

   
}
