package br.com.picoli.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Aviso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idaviso;
    @NotBlank
    private String textoaviso;
    @NotBlank
    private String dataaviso;
    @NotBlank
    private String horaaviso;

    @ManyToOne
    @JoinColumn(name = "idfunc")
    private Funcionario funcionario;

    public Integer getIdaviso() { return idaviso; }

    public void setIdaviso(Integer idaviso) { this.idaviso = idaviso; }

    public String getTextoaviso() { return textoaviso; }

    public void setTextoaviso(String textoaviso) { this.textoaviso = textoaviso; }

    public String getDataaviso() { return dataaviso; }

    public void setDataaviso(String dataaviso) { this.dataaviso = dataaviso; }

    public String getHoraaviso() { return horaaviso; }

    public void setHoraaviso(String horaaviso) { this.horaaviso = horaaviso; }
}
