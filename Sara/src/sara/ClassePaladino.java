
package sara;

import java.util.Random;

/**
 *
 * @author Luis
 */
public class ClassePaladino extends Personagem {

        public void maosConsagradas() {
            System.out.println("\nCure um companheiro com o valor do seu nível x 5 e siga com seu machado de batalha"
                    + " contra o inimigo causando 1d8+mod.força e destrua seu alvo.");
        }

        public void inventario() {
            System.out.print("\n\nInventário:"
                    + "\nMachado de batalha"
                    + "\nMachadinha"
                    + "\nPacote de explorador"
                    + "\nCota de Malha"
                    + "\nSímbolo mágico\n");
        }

            public int gerarPv(){
     Random gerapv = new Random();
      int pvs = gerapv.nextInt(10)+5;
        System.out.print("\nVocê tem " + pvs + "PVs (Pontos de Vida)");
        return pvs;
    }
        
        @Override
        public void setNivel(int nivelp) {
            super.setNivel(nivelp);
            setSpellSlot(Integer.toString(nivelp));
            setCaracteristicaNivel(Integer.toString(nivelp));
        }

        @Override
        public void setSpellSlot(String spellp) {
            int spellpa = Integer.parseInt(spellp);
            switch (spellpa) {
                case 1 ->
                    spellSlot = "|0 (n.1)|";
                case 2 ->
                    spellSlot = "|2 (n.1)|";
                case 3 ->
                    spellSlot = "|3 (n.1)|";
                case 4 ->
                    spellSlot = "|3 (n.1)|";
                case 5 ->
                    spellSlot = "|4 (n.1)| |2 (n.2)|";
                default ->
                    spellSlot = "Escolha Inválida";
            }
        }

        @Override
        public void setCaracteristicaNivel(String carNivelp) {
            int nivelpa = Integer.parseInt(carNivelp);

            switch (nivelpa) {
                case 1 ->
                    caracteristicaNivel = "\n|Sentido Divino, Cura pelas Mãos(n.1)|";
                case 2 ->
                    caracteristicaNivel = "\n|Sentido Divino, Cura pelas Mãos(n.1)|\n|Estilo de Luta, Conjuração, Destruíção Divina(n.2)|";
                case 3 ->
                    caracteristicaNivel = "\n|Sentido Divino, Cura pelas Mãos(n.1)|\n|Estilo de Luta, Conjuração, Destruição Divina(n.2)|\n|Saúde Divina, Juramento Sagrado(n.3)|";
                case 4 ->
                    caracteristicaNivel = "\n|Sentido Divino, Cura pelas Mãos(n.1)|\n|Estilo de Luta, Conjuração, Destruição Divina(n.2)|"
                            + " \n|Saúde Divina, Juramento Sagrado(n.3)|\n|Incremento no Valor de Habilidade(n.4)|";
                case 5 ->
                    caracteristicaNivel = "\n|Sentido Divino, Cura pelas Mãos(n.1)|\n|Estilo de Luta, Conjuração, Destruição Divina(n.2)|"
                            + " \n|Saúde Divina(n.3)|\n|Incremento no Valor de Habilidade(n.4)|\n|Ataque Extra(n.5)|";
            }
        }

        public String detalhesPaladino() {
            return detalhesPersonagem() + "\nDados sobre sua classe Paladino\nSpellSlot: " + spellSlot + "\nCaracterísticas de classe/nível: " + caracteristicaNivel;
        }
    
}
