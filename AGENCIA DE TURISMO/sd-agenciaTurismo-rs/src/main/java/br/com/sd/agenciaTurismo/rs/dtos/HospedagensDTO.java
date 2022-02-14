package br.com.sd.agenciaTurismo.rs.dtos;

public class HospedagensDTO {
	private int passagensR; ///passagens resultados
	private String Cidade_Hotel;
	private String DataE;
	private String DataS;
	private String NQuartos;
	private int NPessoa;
	private int Ipessoa;
	private String Cartao;
	private int Pacela;
	
	
	
	public int getPassagensR() {
		return passagensR;
	}
	public void setPassagensR(int passagensR) {
		this.passagensR = passagensR;
	}
	public String getCidade_Hotel() {
		return Cidade_Hotel;
	}
	public void setCidade_Hotel(String cidade_Hotel) {
		Cidade_Hotel = cidade_Hotel;
	}
	public String getDataE() {
		return DataE;
	}
	public void setDataE(String dataE) {
		DataE = dataE;
	}
	public String getDataS() {
		return DataS;
	}
	public void setDataS(String dataS) {
		DataS = dataS;
	}
	public String getNQuartos() {
		return NQuartos;
	}
	public void setNQuartos(String nQuartos) {
		NQuartos = nQuartos;
	}
	public int getNPessoa() {
		return NPessoa;
	}
	public void setNPessoa(int nPessoa) {
		NPessoa = nPessoa;
	}
	public int getIpessoa() {
		return Ipessoa;
	}
	public void setIpessoa(int ipessoa) {
		Ipessoa = ipessoa;
	}
	public String getCartao() {
		return Cartao;
	}
	public void setCartao(String cartao) {
		Cartao = cartao;
	}
	public int getPacela() {
		return Pacela;
	}
	public void setPacela(int pacela) {
		Pacela = pacela;
	}
	
}
