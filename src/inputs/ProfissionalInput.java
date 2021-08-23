package inputs;

import javax.swing.JOptionPane;

import enums.TipoContratacao;

public class ProfissionalInput {

	// Método estático para ler o id do profissional
	public static Integer lerIdProfissional() throws Exception {

		Integer idProfissional = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do profissional:"));

		if (idProfissional <= 0)
			throw new Exception("O ID do profissional deve ser maior do que zero.");

		return idProfissional;
	}

	// Método estático para ler o nome do profissional
	public static String lerNome() throws Exception {

		String nome = JOptionPane.showInputDialog("Informe o nome do profissional:").trim();

		if (nome.length() < 6)
			throw new Exception("O Nome do profissional deve ter no minimo 6 caracteres.");

		return nome;
	}

	// Método estático para ler o cpf do profissional
	public static String lerCpf() throws Exception {

		String cpf = JOptionPane.showInputDialog("Informe o CPF do profissional:").trim();

		if (cpf.length() != 11)
			throw new Exception("O CPF deve conter exatamente 11 digitos.");

		return cpf;
	}

	// Método estático para ler o telefone do profissional
	public static String lerTelefone() throws Exception {

		String telefone = JOptionPane.showInputDialog("Informe o telefone do profissional:").trim();

		if (telefone.length() < 9)
			throw new Exception("O Telefone deve conter no minimo 9 digitos.");

		return telefone;
	}

	// Método para ler o tipo de contratação do profissional
	public static TipoContratacao lerTipoContratacao() throws Exception {

		Integer tipoContratacao = Integer
				.parseInt(JOptionPane.showInputDialog("Informe (1)CLT, (2)ESTAGIO ou (3)TERCEIRIZADO:"));

		switch (tipoContratacao) {
		case 1:
			return TipoContratacao.CLT;
		case 2:
			return TipoContratacao.ESTAGIO;
		case 3:
			return TipoContratacao.TERCEIRIZADO;
		default:
			throw new Exception("Tipo de contratação inválido.");
		}
	}
}
