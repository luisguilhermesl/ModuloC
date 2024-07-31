package sara;
import java.util.Random;
/**
 *
 * @author Luis
 */
public class ClasseBarbaro extends Personagem {

    private String resistencia = "Força e Constituição\n";

    public void furia() {
        System.out.println("\nEntre em fúria e arranque as cabeças inimigas com as próprias mãos!");
    }

    public void inventario() {
        System.out.print("\n\nInventário:"
                + "\nMachado grande"
                + "\nEspada curta"
                + "\nPacote de explorador"
                + "\n4 azagaias\n");
    }

        public int gerarPv(){
     Random gerapv = new Random();
      int pvs = gerapv.nextInt(12)+6;
        System.out.print("\nVocê tem " + pvs + "PVs (Pontos de Vida)");
        return pvs;
    }
    
    @Override
    public void setNivel(int nivelb) {
        super.setNivel(nivelb);
        setCaracteristicaNivel(Integer.toString(nivelb));
    }

    @Override
    public void setCaracteristicaNivel(String carNivelb) {
        int nivelb = Integer.parseInt(carNivelb);

        switch (nivelb) {
            case 1 ->
                caracteristicaNivel = "\n|Fúria, Defesa sem Armadura(n.1)|";
            case 2 ->
                caracteristicaNivel = "\n|Fúria, Defesa sem Armadura(n.1)|,\n|Ataque Descuidado, Sentido de Perigo(n.2)|";
            case 3 ->
                caracteristicaNivel = "\n|Fúria, Defesa sem Armadura(n.1)|\n|Ataque Descuidado, Sentido de Perigo(n.2)|\n|Caminho Primitivo(n.3)|";
            case 4 ->
                caracteristicaNivel = "\n|Fúria, Defesa sem Armadura(n.1)|\n|Ataque Descuidado(n.2)|"
                        + " \n|Caminho Primitivo(n.3)|\n|Incremento no Valor de Habilidade(n.4)|";
            case 5 ->
                caracteristicaNivel = "\n|Fúria, Defesa sem Armadura(n.1)|\n|Ataque Descuidado, Sentido de Perigo(n.2)|"
                        + " \n|Caminho Primitivo(n.3)|\n|Incremento no Valor de Habilidade(n.4)|\n|Ataque Extra, Movimento Rápido(n.5)|";
        }
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String re) {
        this.resistencia = re;
    }

    public String detalhesBarbaro() {
        return detalhesPersonagem() + "\n\nDados sobre sua classe Barbaro\n" + "Resistência: " + resistencia + "\nCaracterísticas de classe/nível: " + caracteristicaNivel;
    }
    
}
