package principal;

import controllers.ProfissionalController;
import repositories.ProfissionalRepositoryCSV;
import repositories.ProfissionalRepositoryTXT;

public class Program {

	public static void main(String[] args) {

		try {
			
			ProfissionalController profissionalController 
				= new ProfissionalController(new ProfissionalRepositoryCSV()); //POLIMORFISMO
			
			profissionalController.executarExportacao();
			
			System.out.println("\nDados gravados com sucesso!");
		}
		catch(Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}

	}

}


