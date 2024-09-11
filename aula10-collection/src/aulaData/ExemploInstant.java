package aulaData;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ExemploInstant {

	public static void main(String[] args) {
		 Instant dataHora = Instant.now();
		 System.out.println(dataHora);
		 
		 LocalDateTime dataLocalSystem = LocalDateTime.ofInstant(dataHora, ZoneId.systemDefault());
		 LocalDateTime dataLocal = LocalDateTime.ofInstant(dataHora, ZoneId.of("Europe/Athens"));
		 System.out.println(dataLocalSystem);
	}
}
