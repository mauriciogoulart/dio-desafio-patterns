package br.com.mg.diodesafiopatterns.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mg.diodesafiopatterns.model.Endereco;
import br.com.mg.diodesafiopatterns.provider.ViaCepServiceProvider;
import br.com.mg.diodesafiopatterns.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private ViaCepServiceProvider viaCepServiceProvider;

	public Endereco buscarPorId(String cep) {
		Optional<Endereco> endereco = enderecoRepository.findById(cep);
		if (endereco.isPresent()) {
			return endereco.get();
		}
		Endereco novoEndereco = viaCepServiceProvider.consultarCep(cep);
		enderecoRepository.save(novoEndereco);
		return novoEndereco;
	}

}
