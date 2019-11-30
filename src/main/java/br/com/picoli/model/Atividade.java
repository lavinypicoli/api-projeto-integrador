package br.com.picoli.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idativ;
    @NotBlank
    private String nomeativ;
    @NotBlank
    private String diaativ;
    @NotBlank
    private String horaativ;
    @NotBlank
    private String descricaoativ;

    @ManyToMany
    @JoinTable(name = "participa",
            joinColumns ={
                @JoinColumn(name = "idaluno")
            } ,
            inverseJoinColumns = {
                @JoinColumn(name = "idativ")
            }
            )
    private List<Aluno> alunos;

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @ManyToOne
    @JoinColumn(name = "idfunc")
    private Funcionario funcionario;

    public Integer getIdativ() { return idativ; }

    public void setIdativ(Integer idativ) { this.idativ = idativ; }

    public String getNomeativ() { return nomeativ; }

    public void setNomeativ(String nomeativ) { this.nomeativ = nomeativ; }

    public String getDiaativ() { return diaativ; }

    public void setDiaativ(String diaativ) { this.diaativ = diaativ; }

    public String getHoraativ() { return horaativ; }

    public void setHoraativ(String horaativ) { this.horaativ = horaativ; }

    public String getDescricaoativ() { return descricaoativ; }

    public void setDescricaoativ(String descricaoativ) { this.descricaoativ = descricaoativ; }
}
