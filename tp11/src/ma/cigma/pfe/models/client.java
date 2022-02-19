package ma.cigma.pfe.models;

import lombok.Data;
import javax.persistence.*;
import java.util.List;
@Entity
@Data

@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="client_type")
@DiscriminatorValue("client")


public class client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY.TABLE)
	private long id;
	private String name;
	public client(String name) {
	this.name = name;
	}
	public client() {
	}
	}


