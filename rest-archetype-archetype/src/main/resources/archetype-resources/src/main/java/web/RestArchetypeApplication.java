#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestArchetypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestArchetypeApplication.class, args);
	}
}
