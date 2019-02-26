package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AppointmentDao;
import com.model.db.Appointment;
import com.service.interfaces.AppointmentService;


@Service("appointmentService")
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentDao appointmentDao;

	@Override
	public String addData(Appointment appointment) {
		System.out.println(appointment.toString());
		appointmentDao.insert(appointment);
		return null;
	}


}
