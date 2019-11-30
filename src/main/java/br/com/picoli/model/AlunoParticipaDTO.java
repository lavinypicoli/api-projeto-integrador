package br.com.picoli.model;

public class AlunoParticipaDTO {

    private Integer idaluno;
    private Integer idatividade;


    public AlunoParticipaDTO(Integer idaluno, Integer idatividade) { this.idaluno = idaluno;this.idatividade = idatividade; }

    public Integer getIdaluno() {
        return idaluno;
    }

    public void setIdaluno(Integer idaluno) {
        this.idaluno = idaluno;
    }

    public Integer getIdatividade() {
        return idatividade;
    }

    public void setIdatividade(Integer idatividade) {
        this.idatividade = idatividade;
    }
}
