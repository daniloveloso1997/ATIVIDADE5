package br.com.sd.agenciaTurismo.rs.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.sd.agenciaTurismo.rs.dtos.HospedagensDTO;

@Path("/hospedagens")
public class HospedagensController {
		
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})  // pode responder tanto en jersey com xml
	@Path("{n1}/{C_H}/{DE}/{DS}/{NQ}/{NP}/{IP}/{C}/{P}")
	public Response imprimir(@PathParam("n1") int n1,
							 @PathParam("C_H") String C_H,
							 @PathParam("DE") String DE,
							 @PathParam("DS") String DS,
							 @PathParam("NQ") String NQ,
							 @PathParam("NP") int NP,
							 @PathParam("IP") int IP,
							 @PathParam("C") String C,
							 @PathParam("P") int P){ /// as variaveis com infomeção
		HospedagensDTO HospedagensR = new HospedagensDTO();
		HospedagensR.setPassagensR(n1);  // mostrar o que esta cendo feito
		HospedagensR.setCidade_Hotel(C_H);
		HospedagensR.setDataE(DE);
		HospedagensR.setDataS(DS);
		HospedagensR.setNQuartos(NQ);
		HospedagensR.setNPessoa(n1);
		HospedagensR.setIpessoa(IP);
		HospedagensR.setCartao(C);
		HospedagensR.setPacela(P);
		return Response.status(200).entity(HospedagensR).build() ;
	}
	/*public Response somar(@PathParam("n1") int n1,@PathParam("n2") int n2){ /// as variaveis com infomeção
		PassagensDTO passagensR = new PassagensDTO();
		passagensR.setPassagensR(n1+n2);  // mostrar o que esta cendo feito
		return Response.status(200).entity(passagensR).build() ;
	}*/
	}

