package br.com.sd.agenciaTurismo.rs.config;

import org.glassfish.jersey.server.ResourceConfig;

import br.com.sd.agenciaTurismo.rs.controllers.HospedagensController;
import br.com.sd.agenciaTurismo.rs.controllers.PassagensController;

public class AppConfig extends ResourceConfig {

	public AppConfig() {
		register(PassagensController.class);
		register(HospedagensController.class);
	}
	
}
