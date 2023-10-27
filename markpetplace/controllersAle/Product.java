package org.markpetplace.markpetplace.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//la anotacio afecta a lo debajo iunmeditatdo

@Entity
@Table(name = "producto")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_producto", unique=true, nullable=false)
	private Long id;
	private String nombre_producto;
	private String imagen;
	private String descripcion;
	private String descripcion_larga;
	private Float precio;
	private Integer stock;
	private String categoria;
	private String mascota;
	private String ciudad;
	private String estado;
	private String vendedor;
	
	public Product() {
	}

	public Product(Long id, String nombre_producto, String imagen, String descripcion, String descripcion_larga,
			Float precio, Integer stock, String categoria, String mascota, String ciudad, String estado,
			String vendedor) {
		super();
		this.id = id;
		this.nombre_producto = nombre_producto;
		this.imagen = imagen;
		this.descripcion = descripcion;
		this.descripcion_larga = descripcion_larga;
		this.precio = precio;
		this.stock = stock;
		this.categoria = categoria;
		this.mascota = mascota;
		this.ciudad = ciudad;
		this.estado = estado;
		this.vendedor = vendedor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion_larga() {
		return descripcion_larga;
	}

	public void setDescripcion_larga(String descripcion_larga) {
		this.descripcion_larga = descripcion_larga;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMascota() {
		return mascota;
	}

	public void setMascota(String mascota) {
		this.mascota = mascota;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", nombre_producto=" + nombre_producto + ", imagen=" + imagen + ", descripcion="
				+ descripcion + ", descripcion_larga=" + descripcion_larga + ", precio=" + precio + ", stock=" + stock
				+ ", categoria=" + categoria + ", mascota=" + mascota + ", ciudad=" + ciudad + ", estado=" + estado
				+ ", vendedor=" + vendedor + "]";
	}

	
	
	

}
