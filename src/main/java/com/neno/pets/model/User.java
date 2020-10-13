package com.neno.pets.model;

public class User {
    
    private String id;
    private String name;
    private String breed;
    private String sex;
    private String age;
    private int d_id;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", breed=" + breed + ", sex=" + sex + ", age=" + age + ", d_id="
				+ d_id + "]";
	}   
}