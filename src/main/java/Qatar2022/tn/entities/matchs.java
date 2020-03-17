package Qatar2022.tn.entities;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import Qatar2022.tn.entities.equipes;

@Entity

public class matchs implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "matchid")
	private long id;
 
	private Date date;
	private String stade;
	

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "equipeid", referencedColumnName = "equipeid", insertable = false, updatable = false)
	public equipes equipej;
	@JsonIgnore
	@OneToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="arbitres_id")
	  public arbitres arbitre;

	public long getId() {
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

	public arbitres getArbitre() {
		return arbitre;
	}

	public void setArbitre(arbitres arbitre) {
		this.arbitre = arbitre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public matchs(long id, Date date, String stade, equipes equipej, arbitres arbitre) {
		super();
		this.id = id;
		this.date = date;
		this.stade = stade;
		this.equipej = equipej;
		this.arbitre = arbitre;
	}

	public matchs() {
		super();
	}

		
}
