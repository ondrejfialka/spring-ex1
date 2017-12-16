package cz.ucl.jee.camelot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cz.ucl.jee.camelot.nobility.BraveKnight;
import cz.ucl.jee.camelot.nobility.Knight;

@Configuration
public class KnightTraining {
	
	@Bean(name="Lancelot")
	public Knight trainLancelot() {
		//TODO create instance
		return null;
	}
	
	//TODO - create more knights
	
	//TODO - optional - add horses
}
