package org.javaprotrepticon.android.vagenginereference.storage.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Engine {

	@DatabaseField
	private Integer id;
	
	@DatabaseField
	private String name;
	
	@DatabaseField
	private Integer kw;
	
	@DatabaseField
	private Integer hp;
	
	@DatabaseField
	private Float ltr;
	
	@DatabaseField
	private Integer cyl;
	
	@DatabaseField
	private String mountingTime;
	
	@DatabaseField
	private String model;
	
	@DatabaseField
	private String remark;
	
	public Engine() {}

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

	public Integer getKw() {
		return kw;
	}

	public void setKw(Integer kw) {
		this.kw = kw;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Float getLtr() {
		return ltr;
	}

	public void setLtr(Float ltr) {
		this.ltr = ltr;
	}

	public Integer getCyl() {
		return cyl;
	}

	public void setCyl(Integer cyl) {
		this.cyl = cyl;
	}

	public String getMountingTime() {
		return mountingTime;
	}

	public void setMountingTime(String mountingTime) {
		this.mountingTime = mountingTime;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
