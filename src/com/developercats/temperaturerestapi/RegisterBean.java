package com.developercats.temperaturerestapi;

import java.sql.Date;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;

import org.json.JSONObject;

public class RegisterBean {
	@PathParam("id")
	private int id;
	
	@FormParam("degreesCelsius")
	private double degreesCelsius;
	
	@FormParam("date")
	private Date date;
	
	@FormParam("clientId")
	private int clientId;
	
	public double getDegreesCelsius() {
		return degreesCelsius;
	}
	
	public void setDegreesCelsius(double degreesCelsius) {
		this.degreesCelsius = degreesCelsius;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getClientId() {
		return clientId;
	}
	
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	
	public JSONObject toJSON() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", this.id);
		jsonObject.put("degreesCelsius", this.degreesCelsius);
		jsonObject.put("clientId", this.clientId);
		jsonObject.put("date", this.date);
		return jsonObject;
	}
}
