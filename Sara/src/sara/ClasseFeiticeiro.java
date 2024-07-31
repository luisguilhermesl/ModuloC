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
public class ClasseFeiticeiro extends Personagem {
    
    public void castarMagia() {
        System.out.println("\nAtaque com Raio de Bruxa rolando 1d12 de dano elétrico e torre seu adversário");
    }

    public void inventario() {
        System.out.print("\n\nInventário:"
                + "\nBastão"
                + "\nPacote de explorador"
                + "\nFoco arcano\n");
    }

        public int gerarPv(){
     Random gerapv = new Random();
      int pvs = gerapv.nextInt(6)+3;
        System.out.print("\nVocê tem " + pvs + "PVs (Pontos de Vida)");
        return pvs;
    }
    
    @Override
    public void setNivel(int nivelf) {
        super.setNivel(nivelf);
        setSpellSlot(Integer.toString(nivelf));
        setCaracteristicaNivel(Integer.toString(nivelf));
    }

    @Override
    public void setSpellSlot(String spellf) {
        int spellfe = Integer.parseInt(spellf);

        switch (spellfe) {
            case 1 ->
                spellSlot = "|2 (n.1)|";
            case 2 ->
                spellSlot = "|3 (n.1)| ";
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
    public void setCaracteristicaNivel(String carNivelf) {
        int nivelf = Integer.parseInt(carNivelf);

        switch (nivelf) {
            case 1 ->
                caracteristicaNivel = "\n|Conjuração, Origem da Feitiçaria(n.1)|";
            case 2 ->
                caracteristicaNivel = "\n|Conjuração, Origem da Feitiçaria(n.1)|,\n|Fonte de Magia(n.2)|";
            case 3 ->
                caracteristicaNivel = "\n|Conjuração, Origem da Feitiçaria(n.1)|\n|Fonte de Magia(n.2)|\n|Metamagia(n.3)|";
            case 4 ->
                caracteristicaNivel = "\n|Conjuração, Origem da Feitiçaria(n.1)|\n|Fonte de Magia(n.2)|"
                        + " \n|Metamagia(n.3)|\n|Incremento no Valor de Habilidade(n.4)|";
            case 5 ->
                caracteristicaNivel = "\n|Conjuração, Origem da Feitiçaria(n.1)|\n|Fonte de Magia(n.2)|"
                        + " \n|Metamagia(n.3)|\n|Incremento no Valor de Habilidade(n.4)|\n|-(n.5)|";
        }
    }

    public String detalhesFeiticeiro() {
        return detalhesPersonagem() + "\n\nDados sobre sua Classe Feiticeiro\nSpellSlot: " + spellSlot + "\nCaracterísticas da classe/nível: " + caracteristicaNivel;
    }
    
}
