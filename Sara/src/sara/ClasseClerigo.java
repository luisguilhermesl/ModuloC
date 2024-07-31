/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sara;
import java.util.Random;
/**
 *
 * @author Luis
 */
public class ClasseClerigo extends Personagem {

    public void conjurarSpell() {
        System.out.println("\nToque seu alvo e conjure Inflingir ferimentos rolando 3d10 de dano e o veja se contorcer em dor");
    }

    public void inventario() {
        System.out.print("\n\nInventário:"
                + "\nMaça"
                + "\nCota de Malha"
                + "\nEspada curta"
                + "\nPacote de Sacerdote"
                + "\nEscudo"
                + "\nSimbolo Mágico\n");
    }

        public int gerarPv(){
     Random gerapv = new Random();
      int pvs = gerapv.nextInt(8)+4;
        System.out.print("\nVocê tem " + pvs + "PVs (Pontos de Vida)");
        return pvs;
    }
    
    @Override
    public void setNivel(int nivelc) {
        super.setNivel(nivelc);
        setSpellSlot(Integer.toString(nivelc));
        setCaracteristicaNivel(Integer.toString(nivelc));
    }

    @Override
    public void setSpellSlot(String spell) {
        int spellS = Integer.parseInt(spell);

        switch (spellS) {
            case 1 ->
                spellSlot = "|2 (n.1)|";
            case 2 ->
                spellSlot = "|3 (n.1)|";
            case 3 ->
                spellSlot = "|4 (n.1)| |2 (n.2)|";
            case 4 ->
                spellSlot = "|4 (n.1)| |3 (n.2)|";
            case 5 ->
                spellSlot = "|4 (n.1)| |3 (n.2)| |2 (n.3)|";
            default ->
                spellSlot = "Escolha Inválida";
        }
    }

    @Override
    public void setCaracteristicaNivel(String carNivelc) {
        int nivelcl = Integer.parseInt(carNivelc);

        switch (nivelcl) {
            case 1 ->
                caracteristicaNivel = "\n|Conjuração, Domínio Divino(n.1)|";
            case 2 ->
                caracteristicaNivel = "\n|Conjuração, Domínio Divino(n.1)|,\n|Canalizar Divindade-1/descanso, Característica de Domínio Divino(n.2)|";
            case 3 ->
                caracteristicaNivel = "\n|Conjuração, Domínio Divino(n.1)|,\n|Canalizar Divindade-1/descanso, Característica de Domínio Divino(n.2)|\n|-(n.3)|";
            case 4 ->
                caracteristicaNivel = "\n|Conjuração, Domínio Divino(n.1)|\n|Canalizar Divindade-1/descanso, Característica de Domínio Divino(n.2)|"
                        + " \n|-(n.3)|\n|Incremento no Valor de Habilidade(n.4)|";
            case 5 ->
                caracteristicaNivel = "\n|Conjuração, Domínio Divino(n.1)|\n|Canalizar Divindade-1/descanso, Característica de Domínio Divino(n.2)|"
                        + " \n|-(n.3)|\n|Incremento no Valor de Habilidade(n.4)|\n|Destruir Mortos_Vivos-ND.1/2(n.5)|";
        }
    }

    public String detalhesClerigo() {
        return detalhesPersonagem() + "\n\nDados sobre sua classe Clerigo\n" + "\nSpellSlot: " + spellSlot + "\nCaracterísticas de classe/nível: " + caracteristicaNivel;
    }
    
}
