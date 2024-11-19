
package br.inatel.cdg.usuario;

import br.inatel.cdg.redeSocial.RedeSocial;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<RedeSocial> redesSociais;

    public Usuario(String nome) {
        this.nome = nome;
        this.redesSociais = new ArrayList<>();
    }

    public void adicionarRedeSocial(RedeSocial redeSocial) {
        redesSociais.add(redeSocial);
        System.out.println(redeSocial.getNome() + " adicionada ao usuário " + nome + ".");
    }

    public void usarRedesSociais() {
        System.out.println("\n=== Atividades do usuário " + nome + " ===\n");
        for (RedeSocial redeSocial : redesSociais) {
            System.out.println("Usando " + redeSocial.getNome() + ":");
            redeSocial.postarFoto();
            redeSocial.curtirPublicacao();
            redeSocial.compartilhar();
            System.out.println();
        }
    }
}
