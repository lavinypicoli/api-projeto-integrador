package br.com.picoli.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Funcionario {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idfunc;
   @NotBlank
   private String nomefunc;
   @NotBlank
   private String emailfunc;
   @NotBlank
   private String senhafunc;

    public Integer getIdfunc() { return idfunc; }

    public void setIdfunc(Integer idfunc) {
        this.idfunc = idfunc;
    }

    public String getNomefunc() {
        return nomefunc;
    }

    public void setNomefunc(String nomefunc) {
        this.nomefunc = nomefunc;
    }

    public String getEmailfunc() {
        return emailfunc;
    }

    public void setEmailfunc(String emailfunc) {
        this.emailfunc = emailfunc;
    }

    public String getSenhafunc() {
        return senhafunc;
    }

    public void setSenhafunc(String senhafunc) {
        this.senhafunc = senhafunc;
    }
}
