package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	@Autowired
	VehicleRepo vrep;
	
	
	
	@RequestMapping("Home")
	String homepage()
	{
		return "index.jsp";
	}
	
	
	
	@RequestMapping("checkin")
	String checkin() {
		
		return "checkin.jsp";
	}
	
	@RequestMapping("result")
	String result(Vehicle v,HttpSession s) {
		v.setCheckInTime(new Date());
		vrep.save(v);
		s.setAttribute("id", v.getId());
		return "result.jsp";
	}
	
	@RequestMapping("checkout")
	String checkout() {
		
		return "checkout.jsp";
	}
	
	@RequestMapping("display")
	String display12345()
	{
		return "display.jsp";
	}
	
	@RequestMapping("get")
	String dddl(int id,HttpSession s)
	{
		Vehicle v=vrep.findById(id).orElse(null);
		s.setAttribute("id", v.getId());
		s.setAttribute("vNo", v.getVehicleNo());
		s.setAttribute("vModel", v.getVehicleModel());
		s.setAttribute("vType", v.getVehicleType());
		s.setAttribute("customername", v.getCustomerName());
		s.setAttribute("mobileno", v.getMobileNo());
		s.setAttribute("checkintime", v.getCheckInTime());

		return "display.jsp";
	}
	//--------------------------------------------
	
	
}
