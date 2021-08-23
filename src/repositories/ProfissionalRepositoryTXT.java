package repositories;

import java.io.File;
import java.io.PrintWriter;

import entities.Profissional;
import interfaces.IProfissionalRepository;

public class ProfissionalRepositoryTXT implements IProfissionalRepository {

	@Override // annotation
	public void exportarDados(Profissional profissional) throws Exception {

		PrintWriter writer = new PrintWriter(new File("c:\\temp\\profissional.txt"));

		writer.write("\nID DO PROFISSIONAL....: " + profissional.getId());
		writer.write("\nNOME..................: " + profissional.getNome());
		writer.write("\nCPF...................: " + profissional.getCpf());
		writer.write("\nTELEFONE..............: " + profissional.getTelefone());
		writer.write("\nTIPO DE CONTRATAÇÃO...: " + profissional.getTipoContratacao());

		writer.flush(); // salvar
		writer.close(); // fechar o arquivo
	}
}


