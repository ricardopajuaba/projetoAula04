package interfaces;

import entities.Profissional;

public interface IProfissionalRepository {

	// método abstrato (somente assinatura)
	void exportarDados(Profissional profissional) throws Exception;

}
