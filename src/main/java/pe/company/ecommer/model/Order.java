package pe.company.ecommer.model;

import java.util.Date;

public class Order {
	
	private Integer id;
	private String number;
	private Date dateCreation;
	private Date dateReceived;
	private Double total;
	
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

	@Override
	public String toString() {
		return "Order [id=" + id + ", number=" + number + ", dateCreation=" + dateCreation + ", dateReceived="
				+ dateReceived + ", total=" + total + "]";
	}
	
	
}
