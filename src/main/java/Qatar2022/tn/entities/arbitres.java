package Qatar2022.tn.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;


@Entity
public class arbitres implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="arbitres_id")
	
	private long id;
	
	private String nom;
	

	private String prenom;
	@JsonIgnore
	@OneToOne(mappedBy="arbitre")  // référence la relation dans la classe Commune
	
	private matchs matches ;
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
	public matchs getMatches() {
		return matches;
	}
	public void setMatches(matchs matches) {
		this.matches = matches;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public arbitres(long id, String nom, String prenom, matchs matches) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.matches = matches;
	}
	public arbitres() {
		super();
	}

	
}
