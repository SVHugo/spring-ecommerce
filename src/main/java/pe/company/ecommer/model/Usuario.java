package pe.company.ecommer.model;

public class Usuario {

	private Integer id;
	private String name;
	private String username;
	private String password;
	private String email;
	private String direction;
	private String cellphone;
	private String rol;
	
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

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", email="
				+ email + ", direction=" + direction + ", cellphone=" + cellphone + ", rol=" + rol + "]";
	}
	
	
}
