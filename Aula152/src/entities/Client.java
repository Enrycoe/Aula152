package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
	
	private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String name;
	private String email;
	private LocalDate d02;
	
	public Client(){
	}

	public Client(String name, String email, LocalDate d02) {
		this.name = name;
		this.email = email;
		this.d02 = d02;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getD02() {
		return d02;
	}

	public void setD02(LocalDate d02) {
		this.d02 = d02;
	}
	
	public String toString() {
		return "Client: " +  name + " (" + d02.format(fmt1) + ") - " + email;
	}
}
