package Qatar2022.tn.entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;


import Qatar2022.tn.entities.joueurs;

@XmlRootElement
@Entity
public class equipes implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="equipeid")
	private long id;
	private String nom;
	private Integer effectif;
	@JsonIgnore
	
	@OneToMany(mappedBy="equipest")
	//@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	@JsonFormat(shape=JsonFormat.Shape.ARRAY)
	public List<joueurs> joueur ;
	
	@OneToMany(mappedBy="equipej",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	//@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	@JsonFormat(shape=JsonFormat.Shape.ARRAY)
	public List<matchs> matches ;
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
	public Integer getEffectif() {
		return effectif;
	}
	public void setEffectif(Integer effectif) {
		this.effectif = effectif;
	}
	public List<joueurs> getJoueur() {
		return joueur;
	}
	public void setJoueur(List<joueurs> joueur) {
		this.joueur = joueur;
	}
	public List<matchs> getMatches() {
		return matches;
	}
	public void setMatches(List<matchs> matches) {
		this.matches = matches;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public equipes(long id, String nom, Integer effectif, List<joueurs> joueur, List<matchs> matches) {
		super();
		this.id = id;
		this.nom = nom;
		this.effectif = effectif;
		this.joueur = joueur;
		this.matches = matches;
	}
	public equipes() {
		super();
	}
	

	
}

	