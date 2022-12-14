package br.edu.infnet.appdrogaria;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdrogaria.model.domain.Medicamento;
import br.edu.infnet.appdrogaria.model.domain.Usuario;
import br.edu.infnet.appdrogaria.model.service.MedicamentoService;

@Order(6)
@Component
public class MedicamentoTeste implements ApplicationRunner {

	@Autowired
	private MedicamentoService medicamentoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("### Cadastro de Medicamentos ###");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Medicamento m1 = new Medicamento();
		m1.setCodigo(123456); 
		m1.setNome("Xarope");
		m1.setValor(30.90);
		m1.setFabricacao(LocalDate.now());
		m1.setValidade(LocalDate.now().plusYears(1));
		m1.setControlado(false);
		m1.setUsuario(usuario);
		System.out.println("Medicamento - " + m1);
		medicamentoService.incluir(m1);

		Medicamento m2 = new Medicamento();
		m2.setCodigo(79857); 
		m2.setNome("Reconter");
		m2.setValor(70.00);
		m2.setFabricacao(LocalDate.now());
		m2.setValidade(LocalDate.now().plusYears(1));
		m2.setControlado(true);
		m2.setUsuario(usuario);
		System.out.println("Medicamento - " + m2);
		medicamentoService.incluir(m2);

		Medicamento m3 = new Medicamento();
		m3.setCodigo(96869); 
		m3.setNome("Dorflex");
		m3.setValor(8.90);
		m3.setFabricacao(LocalDate.now());
		m3.setValidade(LocalDate.now().plusYears(1));
		m3.setControlado(false);
		m3.setUsuario(usuario);
		System.out.println("Medicamento - " + m3);
		medicamentoService.incluir(m3);
	}
}