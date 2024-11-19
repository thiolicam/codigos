
package br.inatel.cdg.main;

import br.inatel.cdg.usuario.Usuario;
import br.inatel.cdg.redeSocial.Facebook;
import br.inatel.cdg.redeSocial.Instagram;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana");

        // Instanciar redes sociais
        Facebook facebook = new Facebook();
        Instagram instagram = new Instagram();

        // Adicionar redes sociais ao usuário
        usuario.adicionarRedeSocial(facebook);
        usuario.adicionarRedeSocial(instagram);

        // Usar redes sociais
        usuario.usarRedesSociais();
    }
}
