package sara;
import java.util.Random;
/**
 *
 * @author Luis
 */
public class ClasseGuerreiro extends Personagem {

    public void ataque() {
        System.out.println("\nAtaque com sua espada longa e corte seu adversário");
    }

    public void inventario() {
        System.out.print("\n\nInventário:"
                + "\nCota de Malha"
                + "\nClava grande"
                + "\nPacote de explorador"
                + "\nBesta Leve\n");
    }

        public int gerarPv(){
     Random gerapv = new Random();
      int pvs = gerapv.nextInt(10)+5;
        System.out.print("\nVocê tem " + pvs + "PVs (Pontos de Vida)");
        return pvs;
    }
    
    @Override
    public void setNivel(int nivelg) {
        super.setNivel(nivelg);
        setCaracteristicaNivel(Integer.toString(nivelg));
    }

    @Override
    public void setCaracteristicaNivel(String carNivelg) {
        int nivelg = Integer.parseInt(carNivelg);

        switch (nivelg) {
            case 1 ->
                caracteristicaNivel = "\n|Estilo de Luta, Retomar o Fôlego(n.1)|";
            case 2 ->
                caracteristicaNivel = "\n|Estilo de Luta, Retomar o Fôlego(n.1)|,\n|Surto de Ação - um uso(n.2)|";
            case 3 ->
                caracteristicaNivel = "\n|Estilo de Luta, Retomar o Fôlego(n.1)|\n|Surto de Ação - um uso(n.2)|\n|Arquétipo Marcial(n.3)|";
            case 4 ->
                caracteristicaNivel = "\n|Estilo de Luta, Retomar o Fôlego(n.1)|\n|Surto de Ação - um uso(n.2)|"
                        + " \n|Arquétipo Marcial(n.3)|\n|Incremento no Valor de Habilidade(n.4)|";
            case 5 ->
                caracteristicaNivel = "\n|Estilo de Luta, Retomar o Fôlego(n.1)|\n|Surto de Ação - um uso(n.2)|"
                        + " \n|Arquétipo Marcial(n.3)|\n|Incremento no Valor de Habilidade(n.4)|\n|Ataque Extra(n.5)|";
        }
    }

    public String detalhesGuerreiro() {
        return detalhesPersonagem() + "\n\nDados sobre sua classe Guerreiro\nCaracterística da classe/nível: " + caracteristicaNivel;
    }
}
