package Qatar2022.tn.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class arbitres implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="arbitre_id")
	private long id;
	private String nom;
	private String prenom;
	
	@OneToOne(mappedBy="arbitre")  // référence la relation dans la classe Commune
    private matchs matchs ;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public matchs getMatchs() {
		return matchs;
	}

	public void setMatchs(matchs matchs) {
		this.matchs = matchs;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public arbitres(long id, String nom, String prenom, Qatar2022.tn.entities.matchs matchs) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.matchs = matchs;
	}

	public arbitres() {
		super();
	}
	
		
}
