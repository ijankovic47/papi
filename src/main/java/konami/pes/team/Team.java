package konami.pes.team;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Team {

	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE, generator="TEAM_SEQ")
	@SequenceGenerator(name="TEAM_SEQ", sequenceName="TEAM_SEQ")
	private Integer id;
	private String name;
	private String emblem;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmblem() {
		return emblem;
	}
	public void setEmblem(String emblem) {
		this.emblem = emblem;
	}
}
