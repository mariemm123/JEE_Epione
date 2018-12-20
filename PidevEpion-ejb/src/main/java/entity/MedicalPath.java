package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the MedicalPaths database table.
 * 
 */
@Entity
@Table(name="MedicalPaths")
@NamedQuery(name="MedicalPath.findAll", query="SELECT m FROM MedicalPath m")
public class MedicalPath implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MedicalPathId", unique=true, nullable=false)
	private int medicalPathId;

	@Column(name="DateParcour", nullable=false)
	private Date dateParcour;
	//private Timestamp dateParcour;

	@Column(name="Description", nullable=false, length=50)
	private String description;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="DoctorId", referencedColumnName="Id")
	private AspNetUser aspNetUser1;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="UserId", referencedColumnName="Id")
	private AspNetUser aspNetUser2;

	//bi-directional many-to-one association to Speciality
	@ManyToOne
	@JoinColumn(name="SpecialityId")
	private Speciality speciality;

	public MedicalPath() {
	}

	public int getMedicalPathId() {
		return this.medicalPathId;
	}

	public void setMedicalPathId(int medicalPathId) {
		this.medicalPathId = medicalPathId;
	}

	public Date getDateParcour() {
		return this.dateParcour;
	}

	public void setDateParcour(Date dateParcour) {
		this.dateParcour = dateParcour;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AspNetUser getAspNetUser1() {
		return this.aspNetUser1;
	}

	public void setAspNetUser1(AspNetUser aspNetUser1) {
		this.aspNetUser1 = aspNetUser1;
	}

	public AspNetUser getAspNetUser2() {
		return this.aspNetUser2;
	}

	public void setAspNetUser2(AspNetUser aspNetUser2) {
		this.aspNetUser2 = aspNetUser2;
	}

	public Speciality getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}

	public MedicalPath(String description) {
		super();
		this.description = description;
	}

	public MedicalPath(Date dateParcour, String description) {
		super();
		this.dateParcour = dateParcour;
		this.description = description;
	}

}