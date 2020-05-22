package controle;

import java.text.ParseException;

import apresentacao.SimuladorApresentacao;
import modelo.ClientePessoaFisica;
import modelo.ClientePessoaJuridica;
import modelo.Pacote;

public class SimuladorControle {

	SimuladorApresentacao simuladorApresentacao = new SimuladorApresentacao();
	PacoteControle pacoteControle = new PacoteControle();
	ClienteControle clienteControle = new ClienteControle();

	public SimuladorControle() throws ParseException {
		int op = 0;
		while (op != 3) {
			op = simuladorApresentacao.mostraMenuPrincipal();
			switch (op) {
			case 1:
				menuPacote();
				break;
			case 2:
				menuCliente();
				break;
			}
		}

	}

	private void menuCliente() throws ParseException {
		int op = 0;
		while (op != 2) {
			op = simuladorApresentacao.mostraMenuCliente();
			switch (op) {
			case 1:
				adicionaClienteControle();
				break;
			}
		}
	}

	public void menuPacote() {
		int op = 0;
		while (op != 2) {
			op = simuladorApresentacao.mostraMenuPacote();
			switch (op) {
			case 1:
				adicionaPacoteControle();
				break;
			}
		}
	}

	private void adicionaPacoteControle() {
		Pacote pacote = new Pacote();
		pacoteControle.pacoteApresentacao.cadastraPacote(pacote);
	}

	private void adicionaClienteControle() throws ParseException {
		ClientePessoaFisica clientePessoaFisica = new ClientePessoaFisica();
		ClientePessoaJuridica clientePessoaJuridica = new ClientePessoaJuridica();
		clienteControle.clienteApresentacao.cadastraCliente(clientePessoaFisica, clientePessoaJuridica);
	}

}