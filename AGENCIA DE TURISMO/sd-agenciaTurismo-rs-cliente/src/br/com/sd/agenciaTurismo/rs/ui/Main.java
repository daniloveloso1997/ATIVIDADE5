package br.com.sd.agenciaTurismo.rs.ui;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import br.com.sd.agenciaTurismo.rs.dtos.HospedagensDTO;
import br.com.sd.agenciaTurismo.rs.dtos.PassagensDTO;

public class Main {

	public static void main(String[] args) {
		Client Cliente = ClientBuilder.newClient();
		WebTarget target = 
				Cliente.target("http://localhost:8080/sd-agenciaTurismo-rs/rest").
					path("passagens/"
							+ "0/"  
							+ "SIM/"         //SOMENTE IDA
							+ "NÃO/"         //IDA_VOLTA
							+ "MARABA/"      //ORIGEM
							+ "SAGA/"        //DESTINO
							+ "02022022/"    //DATA IDA
							+ "-  - /"       //DATA VOLTA
							+ "1/"           //N. PESSOAS
							+ "24/"          //IDADE PESSOA
							+ "214521/"       //CARTÃO
							+ "0/");          //PARCALAS
		Invocation.Builder invocador = target.request(MediaType.APPLICATION_JSON);
		PassagensDTO PassagensR = invocador.get(PassagensDTO.class);
		System.out.println("FORNECIMENTO DE DADOS PARA PASSAGENS");
		//System.out.println(""+PassagensR.getPassagensR());
		System.out.println("Somente Ida: "+PassagensR.getSom_Ida());
		System.out.println("Inda e Volta: "+PassagensR.getIda_Volta());
		System.out.println("Origem: "+PassagensR.getOrigem());
		System.out.println("Destino: "+PassagensR.getDestino());
		System.out.println("Data de Ida: "+PassagensR.getDataI());
		System.out.println("Data de Volta: "+PassagensR.getDataV());
		System.out.println("Numero de Pessoas: "+PassagensR.getNPessoa());
		System.out.println("Idade de Pessoa:"+PassagensR.getIpessoa());
		System.out.println("Cartão: "+PassagensR.getCartao());
		System.out.println("Parcelas: "+PassagensR.getPacela());
		
		System.out.println("\nFORNECIEMNTO DE DADOS DE HOSPEDAGEM");
///////////////////////////////////////////////////////////////////////		
		Client ClienteH = ClientBuilder.newClient();
		WebTarget target2 = 
				ClienteH.target("http://localhost:8080/sd-agenciaTurismo-rs/rest").
					path("hospedagens/"
							+ "0/"  
							+ "BEIRA_MAR/"         //CIDADE OU HOTEL
							+ "02-02-2022/"         //DATA ENTRADA
							+ "15-02-2022/"      //DATA SAIDA
							+ "1/"        //NUMERO DE QUARTOS
							+ "1/"    //NUMERO DE PESSOAS
							+ "24/"       //IDADE PESSOA
							+ "214521/"       //CARTÃO
							+ "0/");          //PARCALAS
		
		Invocation.Builder invocadorH = target2.request(MediaType.APPLICATION_JSON);
		HospedagensDTO HospedagensR = invocadorH.get(HospedagensDTO.class);
		
		//System.out.println(""+HospedagensR.getPassagensR());
		System.out.println("Nome Cidade ou Hotel: "+HospedagensR.getCidade_Hotel());
		System.out.println("Data Entrada: "+HospedagensR.getDataE());
		System.out.println("Data Saida: "+HospedagensR.getDataS());
		System.out.println("Numero de Quartos: "+HospedagensR.getNQuartos());
		System.out.println("Numero de Pessoas: "+HospedagensR.getNPessoa());
		System.out.println("Idade de Pessoa:"+HospedagensR.getIpessoa());
		System.out.println("Cartão: "+HospedagensR.getCartao());
		System.out.println("Parcelas: "+HospedagensR.getPacela());
	}

}
