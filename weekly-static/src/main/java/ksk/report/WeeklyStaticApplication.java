package ksk.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) // DB 설정 막아둠
public class WeeklyStaticApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeeklyStaticApplication.class, args);
	}

}
