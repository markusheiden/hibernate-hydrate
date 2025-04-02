package com.javaetmoi.core.persistence.hibernate.manyToOneList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SubSystem extends BaseSystem {

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SYSTEM_KEY_FK", referencedColumnName = "SYSTEM_KEY_PK")
	private System parent;

	public System getParent() {
		return parent;
	}

	public void setParent(System parent) {
		this.parent = parent;
	}

}
