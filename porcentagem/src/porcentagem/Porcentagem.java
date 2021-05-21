package porcentagem;

public class Porcentagem {

	public static void main(String[] args) {
		
		double valor = 150;// VALOR A SER DISTRIBUIDO
		double tempvalor = valor;
		int quantidadeUsuarios = 3;//+1 do primeiro usuario
		double porcentagem =0;
		
		System.out.println(valor/2+"---"+valor/2/valor*100+"%");
		porcentagem +=valor/2/valor*100;
		
		for(int i = 0; i<quantidadeUsuarios;i++) {
			
			if(i > 0 && i < quantidadeUsuarios-1) {
				
				valor = valor/3;
				
				porcentagem += valor/tempvalor*100;
				
				System.out.println(valor+" ---"+valor/tempvalor*100+"%");
				
			}else if(i == quantidadeUsuarios-1) {
				
				valor = valor/2;
				
				porcentagem += valor/tempvalor*100;
				
				System.out.println(valor+" --- "+valor/tempvalor*100+"%");
				
			}
		}
		
		System.out.println();
		
		System.out.println("Total Porcentagem = "+porcentagem+"%");

	}
}
