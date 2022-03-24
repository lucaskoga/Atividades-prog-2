package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 *
 * @author iedu1
 */

@Entity
@Table(name = "Historco")
@DiscriminatorValue("historico")

public class HistoricoRetiradas implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @JoinColumn(name = "veiculo", referencedColumnName = "id")
    @ManyToOne(optional=false, cascade = CascadeType.MERGE)
    private Veiculo veiculo;
    
    @JoinColumn(name = "motorista", referencedColumnName = "id")
    @ManyToOne(optional=false, cascade = CascadeType.MERGE)
    private Motorista motorista;
    
    @JoinColumn(name = "operador", referencedColumnName = "id")
    @ManyToOne(optional=false)
    //@Transient
    private Operador operador;
    
    @Column
    private LocalDate dataRetirada;
    
    @Column
    private LocalDate dataDevolucao;
    
    public HistoricoRetiradas(Veiculo veiculo, Motorista motorista, Operador operador, LocalDate dataRetirada){
        this.operador = new Operador();
        this.motorista = new Motorista();
        this.veiculo = new Veiculo();
        //veiculo
        this.veiculo = veiculo;

        //motorista
        this.motorista = motorista;
 
        //Operador
        this.operador = operador;

        //data
        this.dataRetirada = dataRetirada;
    }
    
    public HistoricoRetiradas(){
        this.operador = new Operador();
        this.motorista = new Motorista();
        this.veiculo = new Veiculo();

    }
    
    
    public String toString(){
        return getVeiculo() + ", " + getMotorista() + ", " + getOperador() + ", " + getDataRetirada();
    }
    
    public Integer getId() {
        return id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    
}
