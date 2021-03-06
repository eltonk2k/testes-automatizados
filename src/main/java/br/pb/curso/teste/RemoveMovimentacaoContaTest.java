package br.pb.curso.teste;

import org.junit.Assert;
import org.junit.Test;

import br.pb.curso.core.BaseTeste;
import br.pb.curso.core.Propriedades;
import br.pb.curso.pages.ContasPage;
import br.pb.curso.pages.MenuPage;

public class RemoveMovimentacaoContaTest extends BaseTeste {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contaPage = new ContasPage();
	
	@Test
	public void testExcluirContaComMovimentacao() {
		menuPage.acessarTelaListarConta();
		
		contaPage.clicarExcluirConta(Propriedades.NOME_CONTA_ALTERADA);
		
		Assert.assertEquals("Conta em uso na movimentações", contaPage.obterMensagemErro());
		
	}

}
