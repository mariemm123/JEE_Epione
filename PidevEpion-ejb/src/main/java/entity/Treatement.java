package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Treatements database table.
 * 
 */
@Entity
@Table(name="Treatements")
@NamedQuery(name="Treatement.findAll", query="SELECT t FROM Treatement t")
public class Treatement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TreatementId", unique=true, nullable=false)
	private int treatementId;

	@Column(name="DateTretement", nullable=false)
	private Timestamp dateTretement;

	@Column(nullable=false, length=50)
	private String description;

	@Column(name="DuréeTretement", nullable=false, length=2147483647)
	private String duréeTretement;

	@Column(name="Validation", nullable=false)
	private boolean validation;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="UserId", referencedColumnName="Id")
	private AspNetUser aspNetUser;

	public Treatement() {
	}

	public int getTreatementId() {
		return this.treatementId;
	}

	public void setTreatementId(int treatementId) {
		this.treatementId = treatementId;
	}

	public Timestamp getDateTretement() {
		return this.dateTretement;
	}

	public void setDateTretement(Timestamp dateTretement) {
		this.dateTretement = dateTretement;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuréeTretement() {
		return this.duréeTretement;
	}

	public void setDuréeTretement(String duréeTretement) {
		this.duréeTretement = duréeTretement;
	}

	public boolean getValidation() {
		return this.validation;
	}

	public void setValidation(boolean validation) {
		this.validation = validation;
	}

	public AspNetUser getAspNetUser() {
		return this.aspNetUser;
	}

	public void setAspNetUser(AspNetUser aspNetUser) {
		this.aspNetUser = aspNetUser;
	}

}