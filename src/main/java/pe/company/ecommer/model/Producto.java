package pe.company.ecommer.model;

public class Producto {
	private Integer id;
	private String name;
	private String description;
	private String imagen;
	private Double precio;
	private Integer cantidad;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(Integer id, String name, String description, String imagen, Double precio, Integer cantidad) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
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

	@Override
	public String toString() {
		return "Producto [id=" + id + ", name=" + name + ", description=" + description + ", imagen=" + imagen
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
}
