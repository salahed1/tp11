package ma.cigma.pfe.models;
import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
@Entity
@Data

public class company {
	@EmbeddedId
	private CompanyId Id;

	private Long id;
	private String name;
	private String address;
	private String phone;
	private String contactFirstName;
	private String contactLastName;
	private String contactPhone;
	@Embedded
	@AttributeOverride(name = "phone", column = @Column(name =
			"PHONE_PERSON"))
			

	private ContactPerson contactPerson;

}
