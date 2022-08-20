package pe.company.ecommer.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String number;
	private Date dateCreation;
	private Date dateReceived;
	private Double total;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne(mappedBy = "order")
	private DetailsOrder detailsOrder;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Integer id, String number, Date dateCreation, Date dateReceived, Double total) {
		super();
		this.id = id;
		this.number = number;
		this.dateCreation = dateCreation;
		this.dateReceived = dateReceived;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateReceived() {
		return dateReceived;
	}

	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	
	//
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public DetailsOrder getDetailsOrder() {
		return detailsOrder;
	}

	public void setDetailsOrder(DetailsOrder detailsOrder) {
		this.detailsOrder = detailsOrder;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", number=" + number + ", dateCreation=" + dateCreation + ", dateReceived="
				+ dateReceived + ", total=" + total + "]";
	}

	
	
}
