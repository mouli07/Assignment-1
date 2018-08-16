package com.bankapp.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.moneymoney.app.model.service.MMBankAccountService;
import com.moneymoney.framework.service.BankAccountService;

@Controller
public class ControllerAccount {

	
	BankAccountService service;
	
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		service=(MMBankAccountService)context.getBean("service");	
	}
	

	@RequestMapping("addSavings")
	public String showSavings() {
		return "NewSavingsAccountsDetails";
	}

	@RequestMapping("addCurrent")
	public String showCurrent() {
		return "NewCurrentAccountsDetails";
	}

	@RequestMapping("createSavingsAccount")
	public String addSavings(@RequestParam("customerName")String customerName, 
			@RequestParam("contactNumber")String contactNumber, @RequestParam("email")String email, @RequestParam("dateOfBirth")String dateOfBirth, @RequestParam("address")String address, @RequestParam("nationality")String nationality, @RequestParam("gender")String gender, @RequestParam("salaried")String salaried, @RequestParam("balance")String balance,Model model)
	{
		
			Map<String, Object> map = new HashMap<>();
			map.put("accountHolderName",customerName);
			map.put("contactNo", Long.parseLong(contactNumber));
			map.put("email", email);
			map.put("dateOfBirth",
					LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
			map.put("address",address);
			map.put("nationality", nationality);
			map.put("gender", gender);
			map.put("salary", Boolean.parseBoolean(salaried));
			map.put("accountBalance", Double.parseDouble(balance));
			// System.out.println("L1");
			// dob check
			boolean isDob = dobCheck((LocalDate) map.get("dateOfBirth"));
			boolean check = (((boolean) map.get("salary") && (double) map.get("accountBalance") >= 0.0)
					|| (!(boolean) map.get("salary") && (double) map.get("accountBalance") >= 5000.0)) ? true : false;

			if (isDob && check) {
				service.createNewSavingsAccount(map);
			} else {
				if (!isDob) {
					model.addAttribute("message", "You must be above 18 years of age to bank with us. Sorry!");
					/*request.getRequestDispatcher("messagePage.jsp").forward(request, response);*/
					return "messagePage";
				} else {
					model.addAttribute("message",
							"Minimum balance of Rs.5000.00 is required to open a Savings account!! Sorry");
					return "messagePage";
				}
			}
			model.addAttribute("message","Savings account created with account number "+(service.getNextAccountNumber()-1));
	return "messagePage";
}

	@RequestMapping("createCurrentAccount")
	public String addCurrent(@RequestParam("customerName")String customerName, 
			@RequestParam("contactNumber")String contactNumber, @RequestParam("email")String email, @RequestParam("dateOfBirth")String dateOfBirth, @RequestParam("address")String address, @RequestParam("nationality")String nationality, @RequestParam("gender")String gender, @RequestParam("overdraft")String overdraft, @RequestParam("balance")String balance,Model model)
	{
		
			Map<String, Object> map = new HashMap<>();
			map.put("accountHolderName",customerName);
			map.put("contactNo", Long.parseLong(contactNumber));
			map.put("email", email);
			map.put("dateOfBirth",
					LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
			map.put("address",address);
			map.put("nationality", nationality);
			map.put("gender", gender);
			map.put("overdraft",  Double.parseDouble(overdraft));
			map.put("accountBalance", Double.parseDouble(balance));
			// System.out.println("L1");
			// dob check
			boolean isDob = dobCheck((LocalDate) map.get("dateOfBirth"));
			boolean check = ((double) map.get("accountBalance") >= 10000.0) ? true : false;

			if (isDob && check) {
				service.createNewCurrentAccount(map);
			} else {
				if (!isDob) {
					model.addAttribute("message", "You must be above 18 years of age to bank with us. Sorry!");
					/*request.getRequestDispatcher("messagePage.jsp").forward(request, response);*/
					return "messagePage";
				} else {
					model.addAttribute("message",
							"Minimum balance of Rs.5000.00 is required to open a Savings account!! Sorry");
					return "messagePage";
				}
			}
			model.addAttribute("message","Current account created with account number "+(service.getNextAccountNumber()-1));
	return "messagePage";
}
	
	
	private boolean dobCheck(LocalDate date) {
		LocalDate now = LocalDate.now();
		return (now.getYear() - date.getYear() >= 18) ? true : false;
		
	}
}
