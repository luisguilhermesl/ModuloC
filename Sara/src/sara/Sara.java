package sara;
import java.util.Scanner;

/**
 * @author Luis
 */

public class Sara {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "UTF-8");
        Scanner sc2 = new Scanner(System.in, "UTF-8");

        System.out.println("ESCOLHA SEU PERSONAGEM:\n"
                + "\n"
                + "MAGO\n"
                + "FEITICEIRO\n"
                + "GUERREIRO\n"
                + "BÁRBARO\n"
                + "CLÉRIGO\n"
                + "PALADINO");

        //comandos para ignorar acentuação
        String ClasseEscolha = sc.nextLine();
        char[] ClasseEscolhaToCharArray = ClasseEscolha.toLowerCase().toCharArray();
        String acento = "";
        for (int i = 0; i < ClasseEscolhaToCharArray.length; i++) {
            char nome = ClasseEscolhaToCharArray[i];
            switch (nome) {
                case 'á', 'à', 'ã' -> {
                    nome = 'a';
                }
                case 'é', 'ê' -> {
                    nome = 'e';
                }
                case 'ó', 'ô' -> {
                    nome = 'o';
                }
                case 'í' -> {
                    nome = 'i';
                }
                case 'ú' -> {
                    nome = 'u';
                }
            }
            acento += nome;
        }
        
        /*
        ao ser executado, o programa deve pedir ao usiário alguns dados
        (nome do personagem; classe do mesmo; pontos de vida; nível)
        e a partir dessas informa estipular quais serão suas informações básicas
        (inventário; spellslots por nível; características de nível)
        */        
        switch (acento) {
            case "mago":
                ClasseMago m = new ClasseMago();
                System.out.print("\nQual o nome do seu personagem? ");
                m.setNome(sc.nextLine());
                System.out.print("Qual seu nivel?(1 a 5) ");
                m.setNivel(sc2.nextInt());
                //System.out.print("Agora acrescente seus pontos de vida: ");
                //m.setPontosVida(sc2.nextInt());
                System.out.println(m.detalhesMago());
                //m.setPontosVida(pvs);
                //m.aumentarPv(pvPlus);
                m.inventario();
                m.gerarPo();
                m.castarMagia(); 
                break;
            case "feiticeiro":
                ClasseFeiticeiro f = new ClasseFeiticeiro();
                System.out.print("\nQual o nome do seu personagem? ");
                f.setNome(sc.nextLine());
                System.out.print("Qual seu nível?(1 a 5) ");
                f.setNivel(sc2.nextInt());
                //System.out.print("Agora acrescente seus pontos de vida: ");
               // f.setPontosVida(sc2.nextInt());
                System.out.println(f.detalhesFeiticeiro());
                f.gerarPv();
                f.inventario();
                f.gerarPo();
                f.castarMagia();
                break;
            case "guerreiro":
                ClasseGuerreiro g = new ClasseGuerreiro();
                System.out.println("\nQual o nome do seu personagem? ");
                g.setNome(sc.nextLine());
                System.out.print("Qual seu nível?(1 a 5) ");
                g.setNivel(sc2.nextInt());
               // System.out.print("Agora acrescente seus pontos de vida: ");
               // g.setPontosVida(sc2.nextInt());
                System.out.println(g.detalhesGuerreiro());
                g.gerarPv();
                g.inventario();
                g.gerarPo();
                break;
            case "barbaro":
                ClasseBarbaro b = new ClasseBarbaro();
                System.out.println("\nQual o nome do seu personagem? ");
                b.setNome(sc.nextLine());
                System.out.print("Qual seu nível?(1 a 5) ");
                b.setNivel(sc2.nextInt());
                //System.out.print("Agora acrescente seus pontos de vida: ");
                //b.setPontosVida(sc2.nextInt());
                System.out.println(b.detalhesBarbaro());
                b.gerarPv();
                b.inventario();
                b.gerarPo();
                b.furia();
                break;
            case "clerigo":
                ClasseClerigo c = new ClasseClerigo();
                System.out.print("\nQual o nome do seu personagem? ");
                c.setNome(sc.nextLine());
                System.out.print("Qual seu nível?(1 a 5) ");
                c.setNivel(sc2.nextInt());
                //System.out.print("Agora acrescente seus pontos de vida: ");
                //c.setPontosVida(sc2.nextInt());
                System.out.println(c.detalhesClerigo());
                c.gerarPv();
                c.inventario();
                c.gerarPo();
                c.conjurarSpell();
                break;
            case "paladino":
                ClassePaladino p = new ClassePaladino();
                System.out.print("\nQual o nome do seu personagem? ");
                p.setNome(sc.nextLine());
                System.out.print("Qual seu nível?(1 a 5) ");
                p.setNivel(sc2.nextInt());
                //System.out.print("Agora acrescente seus pontos de vida: ");
                //p.setPontosVida(sc2.nextInt());
                System.out.println(p.detalhesPaladino());
                p.gerarPv();
                p.inventario();
                p.gerarPo();
                p.maosConsagradas();
                break;
        }
    }
}
    
