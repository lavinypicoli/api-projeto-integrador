package br.com.picoli.model;

public class FuncionarioAutenticavel {

    private String emailfunc;
    private String senhafunc;

    public FuncionarioAutenticavel(String emailfunc, String senhafunc) {
        this.emailfunc = emailfunc;
        this.senhafunc = senhafunc;
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
