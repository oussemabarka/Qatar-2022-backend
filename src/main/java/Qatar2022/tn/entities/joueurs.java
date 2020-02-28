package Qatar2022.tn.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import Qatar2022.tn.entities.equipes;

@Entity

public class joueurs implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "joueurid")
	private Long id;
	private String nom;
	private String prenom;
	private Integer numero;
    @JsonIgnore
	@ManyToOne
	@JoinColumn(name = "equipeid_FK")
	private equipes equipest;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public equipes getEquipest() {
		return equipest;
	}

	public void setEquipest(equipes equipest) {
		this.equipest = equipest;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public joueurs(Long id, String nom, String prenom, Integer numero, equipes equipest) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.equipest = equipest;
	}

	public joueurs() {
		super();
	}

	
}
