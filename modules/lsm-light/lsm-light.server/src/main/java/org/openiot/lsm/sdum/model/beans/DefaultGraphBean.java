package org.openiot.lsm.sdum.model.beans;


public class DefaultGraphBean 
{
	
	private String id;
	private String defaultGraphURI;
	
	//constructor
	public DefaultGraphBean(){		
	}
	public DefaultGraphBean(String id){	
		this.id=id;
	}

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDefaultGraphURI() {
		return defaultGraphURI;
	}
	public void setDefaultGraphURI(String defaultGraphURI) {
		this.defaultGraphURI = defaultGraphURI;
	}
}
