package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RequirementDao;
import com.model.db.Submit_requirement;
import com.service.interfaces.RequirementService;

@Service("requirementService")
public class RequirementServiceImpl implements RequirementService {

	@Autowired
	private RequirementDao requirementDao;

	@Override
	public String addData(Submit_requirement submit_requirement) {
		System.out.println(submit_requirement.toString());
		requirementDao.insert(submit_requirement);
		return null;
	}


}
