package br.jus.tst.esocial.dominio.semvinculo.termino;

import java.util.Calendar;

public class RemunAposTerm {
    public Byte indRemun;
    public Calendar dtFimRemun;

    public Byte getIndRemun() {
        return indRemun;
    }

    public void setIndRemun(Byte indRemun) {
        this.indRemun = indRemun;
    }

    public Calendar getDtFimRemun() {
        return dtFimRemun;
    }

    public void setDtFimRemun(Calendar dtFimRemun) {
        this.dtFimRemun = dtFimRemun;
    }
}
