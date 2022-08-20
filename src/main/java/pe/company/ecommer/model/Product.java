package pe.company.ecommer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String description;
	private String imagen;
	private Double precio;
	private Integer cantidad;
	
	//
	@ManyToOne
	private Usuario usuario;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Integer id, String name, String description, String imagen, Double precio, Integer cantidad,
			Usuario usuario) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
		this.usuario = usuario;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	//
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	//

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", imagen=" + imagen
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
}
