package br.com.picoli.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idaluno;
    @NotBlank
    private String nomealuno;
    @NotBlank
    private String datanasc;
    @NotBlank
    private String emailaluno;
    @NotBlank
    private String senhaaluno;

    @ManyToMany(mappedBy = "alunos")
    private List<Atividade> atividades;

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public Aluno(){}


    public Integer getIdaluno() { return idaluno;}

    public void setIdaluno(Integer idaluno) { this.idaluno = idaluno; }

    public String getNomealuno() { return nomealuno; }

    public void setNomealuno(String nomealuno) { this.nomealuno = nomealuno; }

    public String getDatanasc() { return datanasc; }

    public void setDatanasc(String datanasc) { this.datanasc = datanasc; }

    public String getEmailaluno() { return emailaluno; }

    public void setEmailaluno(String emailaluno) { this.emailaluno = emailaluno; }

    public String getSenhaaluno() { return senhaaluno; }

    public void setSenhaaluno(String senhaaluno) { this.senhaaluno = senhaaluno; }
}
