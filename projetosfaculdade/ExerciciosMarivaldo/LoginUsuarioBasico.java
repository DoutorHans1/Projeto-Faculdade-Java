
package projetosmarivaldo;

import java.util.Scanner;

public class LoginUsuarioBasico {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nomeUsuario, senha;
        String nomeUsuarioPadrao = "Ian";
        String senhaPadrao = "1234";
        
        System.out.println("Digite o nome de usuário: ");
        nomeUsuario = ler.nextLine();
        
        System.out.println("Digite a senha: ");
        senha = ler.nextLine();
        
        if(nomeUsuario.equals(nomeUsuarioPadrao)){
            System.out.println("Login realizado com suceso!");
        } else {
            System.out.println("Erro, usuário ou senha estão incorretos.");
        }
    }
}
