package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.model.db.Submit_requirement;
import com.opensymphony.xwork2.ActionSupport;
import com.service.interfaces.RequirementService;

@Controller
@Scope("prototype")
public class RequirementAction extends ActionSupport{
	@Autowired
	private RequirementService requirementService;

	public String submit() {
		try {
			propery_type = propery_type_1+"-"+propery_type_2;
			price = price_1 + "-" + price_2;
			bedrooms = bdro_1 +"-"+ bdro_2;
			bathrooms = bhro_1 +"-"+ bhro_2;
			parking_lot = pkl_1 +"-"+pkl_2;
			Submit_requirement submit_requirement = new Submit_requirement(buy_sell, from_place, fullname, contact, email, title_type, size, propery_type, price, bedrooms, bathrooms, parking_lot);
			String resultMsg = requirementService.addData(submit_requirement);
			setErrormsg(resultMsg);
		} catch (Exception e) {
			e.printStackTrace();
			setErrormsg(e.getMessage());
			return INPUT;
		}
		return SUCCESS;
	}

	private Integer id;
	private String buy_sell;
	private String from_place;
	private String fullname;
	private String contact;
	private String email;
	private String title_type;
	private String size;
	private String propery_type;
	private String price;
	private String bedrooms;
	private String bathrooms;
	private String parking_lot;
	private String errormsg;
	private String propery_type_1;
	private String propery_type_2;
	private String price_1;
	private String price_2;
	private String bdro_1;
	private String bdro_2;
	private String bhro_1;
	private String bhro_2;
	private String pkl_1;
	private String pkl_2;
	
	

	public RequirementService getRequirementService() {
		return requirementService;
	}
	public void setRequirementService(RequirementService requirementService) {
		this.requirementService = requirementService;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBuy_sell() {
		return buy_sell;
	}
	public void setBuy_sell(String buy_sell) {
		this.buy_sell = buy_sell;
	}
	public String getFrom_place() {
		return from_place;
	}
	public void setFrom_place(String from_place) {
		this.from_place = from_place;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle_type() {
		return title_type;
	}
	public void setTitle_type(String title_type) {
		this.title_type = title_type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getPropery_type() {
		return propery_type;
	}
	public void setPropery_type(String propery_type) {
		this.propery_type = propery_type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(String bedrooms) {
		this.bedrooms = bedrooms;
	}
	public String getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(String bathrooms) {
		this.bathrooms = bathrooms;
	}
	public String getParking_lot() {
		return parking_lot;
	}
	public void setParking_lot(String parking_lot) {
		this.parking_lot = parking_lot;
	}
	public String getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	public String getPropery_type_1() {
		return propery_type_1;
	}
	public void setPropery_type_1(String propery_type_1) {
		this.propery_type_1 = propery_type_1;
	}
	public String getPropery_type_2() {
		return propery_type_2;
	}
	public void setPropery_type_2(String propery_type_2) {
		this.propery_type_2 = propery_type_2;
	}
	public String getPrice_1() {
		return price_1;
	}
	public void setPrice_1(String price_1) {
		this.price_1 = price_1;
	}
	public String getPrice_2() {
		return price_2;
	}
	public void setPrice_2(String price_2) {
		this.price_2 = price_2;
	}
	public String getBdro_1() {
		return bdro_1;
	}
	public void setBdro_1(String bdro_1) {
		this.bdro_1 = bdro_1;
	}
	public String getBdro_2() {
		return bdro_2;
	}
	public void setBdro_2(String bdro_2) {
		this.bdro_2 = bdro_2;
	}
	public String getBhro_1() {
		return bhro_1;
	}
	public void setBhro_1(String bhro_1) {
		this.bhro_1 = bhro_1;
	}
	public String getBhro_2() {
		return bhro_2;
	}
	public void setBhro_2(String bhro_2) {
		this.bhro_2 = bhro_2;
	}
	public String getPkl_1() {
		return pkl_1;
	}
	public void setPkl_1(String pkl_1) {
		this.pkl_1 = pkl_1;
	}
	public String getPkl_2() {
		return pkl_2;
	}
	public void setPkl_2(String pkl_2) {
		this.pkl_2 = pkl_2;
	}
	
	
}
