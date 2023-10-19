package me.dio.doc;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfiguration {

	@Bean
	public OpenAPI customOpenAPI() {
	    Server server = new Server();
	    server.setUrl("https://sdw-2023-api-production-sellan.up.railway.app");
	    return new OpenAPI().servers(List.of(server));
	    
	}
}
