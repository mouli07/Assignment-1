package com.bankapp.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.moneymoney.app.model.service.MMBankAccountService;
import com.moneymoney.framework.account.pojo.BankAccount;
import com.moneymoney.framework.service.BankAccountService;

@Controller
public class ControllerUtilities {

	BankAccountService service;

	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		service = (MMBankAccountService) context.getBean("service");
	}

	@RequestMapping("viewAll")
	public String viewAll(Model model) {
		model.addAttribute("allAccount", service.getAllAccounts());
		return "viewAll";
	}

	@RequestMapping("viewCustomers")
	public String viewCustomers(Model model) {
		model.addAttribute("allAccount", service.getAllAccounts());
		return "viewAllCustomers";
	}

	@RequestMapping("editform")
	public String editCustomer(@RequestParam("accountNo") String accountNo, Model model) {

		model.addAttribute("account", service.getAccountById(Integer.parseInt(accountNo)));
		return "UpdateCustomer";
	}

	@RequestMapping("updateAccount")
	public String applyCustomerDetails(@RequestParam("accNo") String accNo,
			@RequestParam("customerName") String customerName,
			@RequestParam("email") String email,
			@RequestParam("contactNumber") String contactNumber,
			@RequestParam("dateOfBirth") String dateOfBirth,
			Model model) {

		service.getAccountById(Integer.parseInt(accNo)).getAccountHolder()
				.setCustomerName(customerName);
		service.getAccountById(Integer.parseInt(accNo)).getAccountHolder()
				.setEmailId(email);
		service.getAccountById(Integer.parseInt(accNo)).getAccountHolder()
				.setContactNumber(Long.parseLong(contactNumber));
		service.getAccountById(Integer.parseInt(accNo)).getAccountHolder().setDateOfBirth(
				LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		
		model.addAttribute("message", "Customer Details Updated");
		return "messagePage";
	}
	
	
	@RequestMapping("createSearch")
	public String createSearch() {
		return "searchAccount";
	}
	
	
	@RequestMapping("search")
	public String search(@RequestParam("search") String search,Model model) {

		BankAccount account = service.getAccountById(Integer.parseInt(search));
		if(account==null) {
			model.addAttribute("message", "No Such Account number was found");
			return "messagePage";
		}
		Collection<BankAccount> allAccount = new ArrayList<>();
		allAccount.add(account);
		model.addAttribute("allAccount", allAccount);
		return "viewAll";

	}
}
