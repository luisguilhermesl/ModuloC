
package sara;
import java.util.Random;
/**
 *
 * @author Luis
 */
public class ClasseMago extends Personagem {
    
    public void castarMagia() {
        System.out.println("\nAo identificar o alvo:\nAtaque com Misseis mágicos rolando 3d4+1 e sangre seu adversário");
    }

    public void inventario() {

        System.out.print("\n\nInventário:"
                + "\nGrimório"
                + "\nBolsa de componentes"
                + "\nPacote de estudioso\n");
    }

    /**
     *
     * @param nivel2 puxa o valor atribuído no nível do personagem (int) e o
     * converte (string)
     */
    @Override
    public void setNivel(int nivel2) {
        super.setNivel(nivel2);
        setSpellSlot(Integer.toString(nivel2));
        setCaracteristicaNivel(Integer.toString(nivel2));
       // setPontosVida(Integer.toString(pvPlus));
    }

    /**
     *
     * @param spellm puxa o nível do personagem para identificar a quantidade de
     * spellslots por nível
     */
    @Override
    public void setSpellSlot(String spellm) {
        int spellmg = Integer.parseInt(spellm);

        switch (spellmg) {
            case 1 ->
                spellSlot = "|2 (n.1)|";
            case 2 ->
                spellSlot = "|3 (n.1)|";
            case 3 ->
                spellSlot = "|4 (n.1)| |2 (n.2)|";
            case 4 ->
                spellSlot = "|4 (n.1)| |3 (n.2)|";
            case 5 ->
                spellSlot = "|4 (n.1)| |3 (n.2)| |2(n.3)|";
            default ->
                spellSlot = "Escolha inválida";
        }
    }

    /**
     * Para identificar a quantidade de pontos de vida de acordo com o nível de personagem
     * @param pvPlus 
     */
    @Override
      public void setPontosVida(int pvPlus) {
       Random gerapv = new Random();
        int pvs = gerapv.nextInt(6) + 3;
        super.setNivel(pvs);

        switch (nivel) {

            case 1 ->
                pvs = pvs;
            case 2 ->
                pvs =  pvs * 2;
            case 3 ->
                pvs =  pvs * 3;
            case 4 ->
                pvs =  pvs * 4;
            case 5 ->
                pvs =  pvs * 5;
        }
    }
   

    /**
     * 
     * @param carNivel puxa o nível do personagem para identificar quais são
     * suas características de classe por nível 
     */
    @Override
    public void setCaracteristicaNivel(String carNivel) {
        int nivel = Integer.parseInt(carNivel);

        switch (nivel) {
            case 1 ->
                caracteristicaNivel = "\n|Conjuração, Recuperação Arcana(n.1)|";
            case 2 ->
                caracteristicaNivel = "\n|Conjuração, Recuperação Arcana(n.1)|,\n|Tradição Arcana(n.2)|";
            case 3 ->
                caracteristicaNivel = "\n|Conjuração, Recuperação Arcana(n.1)|\n|Tradição Arcana(n.2)|\n|-(n,3)|";
            case 4 ->
                caracteristicaNivel = "\n|Conjuração, Recuperação Arcana(n.1)|\n|Tradição Arcana(n.2)|"
                        + " \n|-(n.3)|\n|Incremento no Valor de Habilidade(n.4)|";
            case 5 ->
                caracteristicaNivel = "\n|Conjuração, Recuperação Arcana(n.1)|\n|Tradição Arcana(n.2)|"
                        + " \n|-(n.3)|\n|Incremento no Valor de Habilidade(n.4)|\n|-(n.5)|";
            default ->
                caracteristicaNivel = "Resultado inválido";
        }
    }

    public String detalhesMago() {
        return detalhesPersonagem() + "\n\nDados sobre a Classe Mago \nSpellSlot: " + spellSlot + "\nCaracterísticas de Nível: " + caracteristicaNivel + "\nSeus PVs são: " + pontosVida;
    }
}