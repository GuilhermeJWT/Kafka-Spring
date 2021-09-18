package br.com.systemsgs.model;

import java.io.Serializable;

public class ModelUser implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String[] address;
	
	public ModelUser(int id, String name, String[] addres) {
		this.id = id;
		this.name = name;
		this.address = addres;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getAddress() {
		return address;
	}

	public void setAddress(String[] address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelUser other = (ModelUser) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
