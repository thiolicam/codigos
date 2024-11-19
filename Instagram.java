
package br.inatel.cdg.redeSocial;

public class Instagram extends RedeSocial {
    public Instagram() {
        super("Instagram");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagram!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Instagram!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um story no Instagram!");
    }
}
