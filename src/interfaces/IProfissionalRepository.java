package interfaces;

import entities.Profissional;

public interface IProfissionalRepository {

	// m�todo abstrato (somente assinatura)
	void exportarDados(Profissional profissional) throws Exception;

}
