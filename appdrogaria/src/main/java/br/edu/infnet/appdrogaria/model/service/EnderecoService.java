package br.edu.infnet.appdrogaria.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdrogaria.clients.IEnderecoClient;
import br.edu.infnet.appdrogaria.model.domain.Endereco;

@Service
public class EnderecoService {
	@Autowired
	private IEnderecoClient enderecoClient;
	
	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}
}