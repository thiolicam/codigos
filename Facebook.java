
package br.inatel.cdg.redeSocial;

public class Facebook extends RedeSocial {
    public Facebook() {
        super("Facebook");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Facebook!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma postagem no Facebook!");
    }
}
