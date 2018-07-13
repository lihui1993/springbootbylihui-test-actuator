package cn.allcheer.lihui.springbootbylihuitestactuator;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringbootbylihuiTestActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootbylihuiTestActuatorApplication.class, args);
	}
}
