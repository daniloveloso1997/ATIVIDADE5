package br.com.sd.agenciaTurismo.rs.dtos;


public class PassagensDTO {
	private int passagensR; ///passagens resultados
	private String Som_Ida;
	private String Ida_Volta;
	private String Origem;
	private String Destino;
	private String DataI;
	private String DataV;
	private int NPessoa;
	private int Ipessoa;
	private String Cartao;
	private int Pacela;
	
//////////////////////////////////////////////
	public String getSom_Ida() {
		return Som_Ida;
	}

	public void setSom_Ida(String som_Ida) {
		Som_Ida = som_Ida;
	}
///////////////////////////////////////////////
	public String getIda_Volta() {
		return Ida_Volta;
	}

	public void setIda_Volta(String ida_Volta) {
		Ida_Volta = ida_Volta;
	}
/////////////////////////////////////////////
	public String getOrigem() {
		return Origem;
	}

	public void setOrigem(String origem) {
		Origem = origem;
	}
////////////////////////////////////////////////////
	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
	}
//////////////////////////////////////////////////////
	public String getDataI() {
		return DataI;
	}

	public void setDataI(String dataI) {
		DataI = dataI;
	}
///////////////////////////////////////////////////////
	public String getDataV() {
		return DataV;
	}

	public void setDataV(String dataV) {
		DataV = dataV;
	}
//////////////////////////////////////////////////////
	public int getNPessoa() {
		return NPessoa;
	}

	public void setNPessoa(int nPessoa) {
		NPessoa = nPessoa;
	}
//////////////////////////////////////////////////////
	public int getIpessoa() {
		return Ipessoa;
	}

	public void setIpessoa(int ipessoa) {
		Ipessoa = ipessoa;
	}
/////////////////////////////////////////////////////
	public String getCartao() {
		return Cartao;
	}

	public void setCartao(String cartao) {
		Cartao = cartao;
	}
/////////////////////////////////////////////////////
	public int getPacela() {
		return Pacela;
	}

	public void setPacela(int pacela) {
		Pacela = pacela;
	}

	////////////////////////////////////////////////
	public int getPassagensR() {
		return passagensR;
	}

	public void setPassagensR(int passagensR) {
		this.passagensR = passagensR;
	}

}
