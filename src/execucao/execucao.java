package execucao;

import Direcao.diretor;
import Direcao.secretariaAdministrativa;
import Direcao.secretariaAgencia;
import departamentos.gerente;
import departamentos.presidente;

public class  execucao {
	public static void main(String args[]) {
		gerente g = new gerente();
		presidente pe = new presidente();
		diretor di = new diretor();
		secretariaAgencia sA = new secretariaAgencia();
		secretariaAdministrativa sD = new secretariaAdministrativa();
		
		g.setgerente("Marketing");
		System.out.println(g.getSetores());
		
		pe.setEmpresas("SoInfo");
		System.out.println(pe.getEmpresas());
		
		di.setCargos("gerente");
		System.out.println(di.getCargos());
		
		g.setBonificação("Promoção");
		System.out.println(g.getBonificação());
	
	}

	
}
