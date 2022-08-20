package pe.company.ecommer.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String username;
	private String password;
	private String email;
	private String direction;
	private String cellphone;
	private String rol;
	
	@OneToMany(mappedBy = "usuario")
	private Collection<Product> itemProducts = new ArrayList<Product>();
	
	@OneToMany(mappedBy = "usuario")
	private Collection<Order> itemOrders = new ArrayList<Order>();
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(Integer id, String name, String username, String password, String email, String direction,
			String cellphone, String rol) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.direction = direction;
		this.cellphone = cellphone;
		this.rol = rol;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	//imprimimos todos nuestro atiructos en un solo String
	//es bueno saber que esta imprimiendo en el sistema de dicho objeto

	public Collection<Product> getItemProducts() {
		return itemProducts;
	}

	public void setItemProducts(Collection<Product> itemProducts) {
		this.itemProducts = itemProducts;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", email="
				+ email + ", direction=" + direction + ", cellphone=" + cellphone + ", rol=" + rol + "]";
	}
	
	
}
