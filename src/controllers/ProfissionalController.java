package controllers;

import entities.Profissional;
import inputs.ProfissionalInput;
import interfaces.IProfissionalRepository;

public class ProfissionalController {

	// atributo
	private IProfissionalRepository profissionalRepository;

	// Construtor para receber a inst�ncia da interface..
	public ProfissionalController(IProfissionalRepository profissionalRepository) {
		this.profissionalRepository = profissionalRepository;
	}

	// M�todo para fazer a exporta��o dos dados de um profissional para um
	// reposit�rio de arquivo
	public void executarExportacao() throws Exception {

		Profissional profissional = new Profissional();

		profissional.setId(ProfissionalInput.lerIdProfissional());
		profissional.setNome(ProfissionalInput.lerNome());
		profissional.setCpf(ProfissionalInput.lerCpf());
		profissional.setTelefone(ProfissionalInput.lerTelefone());
		profissional.setTipoContratacao(ProfissionalInput.lerTipoContratacao());

		profissionalRepository.exportarDados(profissional);
	}

}
