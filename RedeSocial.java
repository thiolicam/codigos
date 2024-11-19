
package br.inatel.cdg.redeSocial;

public abstract class RedeSocial {
    protected String nome;

    public RedeSocial(String nome) {
        this.nome = nome;
    }

    public abstract void postarFoto();
    public abstract void curtirPublicacao();
    public abstract void compartilhar();

    public String getNome() {
        return nome;
    }
}
