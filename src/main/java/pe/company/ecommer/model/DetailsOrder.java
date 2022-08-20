package pe.company.ecommer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detailorders")
public class DetailsOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Double amount;
	private Double price;
	private Double total;
	
	@OneToOne
	private Order order;
	
	@ManyToOne
	private Product product;
	
	public DetailsOrder() {
		// TODO Auto-generated constructor stub
	}

	public DetailsOrder(Integer id, String name, Double amount, Double price, Double total) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "DetailsOrder [id=" + id + ", name=" + name + ", amount=" + amount + ", price=" + price + ", total="
				+ total + "]";
	}
	
}
