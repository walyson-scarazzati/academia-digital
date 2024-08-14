package me.dio.academia.digital.conf;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

	 @Bean
	    public OpenAPI customOpenAPI() {
	        return new OpenAPI().info(apiInfo());
	    }

	    private Info apiInfo() {
	        return new Info()
	            .title("GYM API")
	            .description("API responsible for control GYM")
	            .version("1.0")
	            .contact(apiContact())
	            .license(apiLicence());
	    }

	    private License apiLicence() {
	        return new License()
	            .name("MIT Licence")
	            .url("https://opensource.org/licenses/mit-license.php");
	    }

	    private Contact apiContact() {
	        return new Contact()
	            .name("Walyson Scarazzati da  Silva")
	            .email("walyson.scarazzati@gmail.com")
	            .url("https://github.com/walyson-scarazzati");
	    }

}
