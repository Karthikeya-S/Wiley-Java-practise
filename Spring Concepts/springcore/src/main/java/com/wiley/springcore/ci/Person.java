package com.wiley.springcore.ci;

public class Person {
	private String name;
	private int id;
	private Cert cert;
	public Person(String name, int id, Cert cert) {
		super();
		this.name = name;
		this.id = id;
		this.cert = cert;
	}
//	public Cert getCert() {
//		return cert;
//	}
//	public void setCert(Cert cert) {
//		this.cert = cert;
//	}
//	public Person(String name, int id) {
//		super();
//		this.name = name;
//		this.id = id;
//	}
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", id=" + id + "]";
//	}
	@Override
	public String toString() {
		return this.name+" : "+this.id+"{"+this.cert.name+"}";
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	
}



//<bean class="com.wiley.springcore.ci.Person" name="p1">
//<constructor-arg>
//	<value>Karthikeya</value>
//</constructor-arg>
//<constructor-arg>
//	<value>99</value>
//</constructor-arg>
//</bean>
//
//<bean class="com.wiley.springcore.ci.Person" name="p2">
//<constructor-arg type="int" value="99" />
//<constructor-arg type="String" value="Karthik" />
//</bean>

