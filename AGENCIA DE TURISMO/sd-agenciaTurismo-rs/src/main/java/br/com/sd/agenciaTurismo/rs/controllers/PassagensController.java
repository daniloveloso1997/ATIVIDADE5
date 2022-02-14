package br.com.sd.agenciaTurismo.rs.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.sd.agenciaTurismo.rs.dtos.PassagensDTO;

@Path("/passagens")
public class PassagensController {
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})  // pode responder tanto en jersey com xml
	@Path("{n1}/{I}/{IV}/{O}/{D}/{DI}/{DV}/{NP}/{IP}/{C}/{P}")
	public Response imprimir(@PathParam("n1") int n1,
							 @PathParam("I") String SI,
							 @PathParam("IV") String IV,
							 @PathParam("O") String O,
							 @PathParam("D") String D,
							 @PathParam("DI") String DI,
							 @PathParam("DV") String DV,
							 @PathParam("NP") int NP,
							 @PathParam("IP") int IP,
							 @PathParam("C") String C,
							 @PathParam("P") int P){ /// as variaveis com infomeção
		PassagensDTO passagensR = new PassagensDTO();
		passagensR.setPassagensR(n1);  // mostrar o que esta cendo feito
		passagensR.setSom_Ida(SI);
		passagensR.setIda_Volta(IV);
		passagensR.setOrigem(O);
		passagensR.setDestino(D);
		passagensR.setDataI(DI);
		passagensR.setDataV(DV);
		passagensR.setNPessoa(NP);
		passagensR.setIpessoa(IP);
		passagensR.setCartao(C);
		passagensR.setPacela(P);
		return Response.status(200).entity(passagensR).build() ;
	}
	/*public Response somar(@PathParam("n1") int n1,@PathParam("n2") int n2){ /// as variaveis com infomeção
		PassagensDTO passagensR = new PassagensDTO();
		passagensR.setPassagensR(n1+n2);  // mostrar o que esta cendo feito
		return Response.status(200).entity(passagensR).build() ;
	}*/
}
