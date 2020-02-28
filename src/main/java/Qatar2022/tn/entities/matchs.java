package Qatar2022.tn.entities;
import java.io.Serializable;
import java.sql.Date;

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

public class matchs implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "matchid")
	private Integer id;
	private Date date;
	private String stade;
	

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "equipeid")
	private equipes equipej;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getStade() {
		return stade;
	}


	public void setStade(String stade) {
		this.stade = stade;
	}


	public equipes getEquipej() {
		return equipej;
	}


	public void setEquipej(equipes equipej) {
		this.equipej = equipej;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public matchs(Integer id, Date date, String stade, equipes equipej) {
		super();
		this.id = id;
		this.date = date;
		this.stade = stade;
		this.equipej = equipej;
	}


	public matchs() {
		super();
	}




	
}
