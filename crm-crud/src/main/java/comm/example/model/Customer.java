package comm.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="firstName")
	private String firstName;
	@Column(name="secondName")
	private String secondName;
	@Column(name="email")
	private String email;
	public Customer(String firstName, String secondName, String email) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.email = email;
	}
	
	
	

}
