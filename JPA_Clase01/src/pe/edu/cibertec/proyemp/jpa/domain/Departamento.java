package pe.edu.cibertec.proyemp.jpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Departamento {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;

	public Departamento(){}
	
	
	//@OneToMany(mappedBy="departamento",cascade=CascadeType.PERSIST)
	@OneToMany(mappedBy="departamento", cascade =CascadeType.PERSIST)
	private List<Empleado> empleados = 
			new ArrayList<Empleado>();

	
	public Departamento(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	

	
	
}
