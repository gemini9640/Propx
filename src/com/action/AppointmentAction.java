package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.model.db.Appointment;
import com.opensymphony.xwork2.ActionSupport;
import com.service.interfaces.AppointmentService;

@Controller
@Scope("prototype")
public class AppointmentAction extends ActionSupport{
	@Autowired
	private AppointmentService appoinmentService;

	public String submit() {
		try {
			Appointment appointment = new Appointment(first_name, last_name, email, phone);
			String resultMsg = appoinmentService.addData(appointment);
			setErrormsg(resultMsg);
		} catch (Exception e) {
			e.printStackTrace();
			setErrormsg(e.getMessage());
			return INPUT;
		}
		return SUCCESS;
	}

	private Integer id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone;
	private String errormsg;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	
	

}
