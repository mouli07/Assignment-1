package com.bankapp.controller;

import java.time.LocalDate;
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
public class ControllerTransactions {

	BankAccountService service;

	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		service = (MMBankAccountService) context.getBean("service");
	}

	@RequestMapping("withdrawl")
	public String withdraw(Model model) {
		return "withdrawl";
	}
	// doWithdraw

	@RequestMapping("doWithdraw")
	public String doWithdraw(@RequestParam("accNo") String accNo, @RequestParam("amount") String amt, Model model) {

		if (service.withdraw(Integer.parseInt(accNo), Double.parseDouble(amt)) == -1) {
			model.addAttribute("message", "Transaction Unsuccessful due to insufficient funds");
			return "messagePage";

		} else {
			double amount = Double.parseDouble(amt);
			Map<Integer, Integer> denomination = new HashMap<>();
			int ar[] = { 2000, 500, 200, 100, 50, 20, 5, 2, 1 };
			int i = 0;
			for (i = 0; i < 9; i++)
				denomination.put(ar[i], 0);
			for (i = 0; i < 9; i++) {
				denomination.put(ar[i], (int) amount / ar[i]);
				amount = amount % ar[i];
			}

			int totalNotes = 0;
			for (i = 0; i < 9; i++)
				totalNotes += denomination.get(ar[i]);

			String message = "<h3>Transaction Successful</h3><br><h3>Total no. of notes: " + totalNotes + "</h3>";
			for (i = 0; i < 9; i++) {
				if (denomination.get(ar[i]) > 0)
					message = message + "<h5>Denomination " + ar[i] + " : " + denomination.get(ar[i]) + "</h5>";
			}
			model.addAttribute("message", message);
//			System.out.println(request.getAttribute("message"));
			return "messagePage";
		}
	}

	@RequestMapping("deposit")
	public String deposit(Model model) {
		return "deposit";
	}

	@RequestMapping("doDeposit")
	public String doDeposit(@RequestParam("accNo") String accNo, @RequestParam("amount") String amt, Model model) {
		service.getAccountById(Integer.parseInt(accNo)).deposit(Double.parseDouble(amt));
		String message = "<h2>Transaction Successful.</h2><br>Account balance after Deposit : Rs "
				+ service.getCurrrentBalance(service.getAccountById(Integer.parseInt(accNo)));
		model.addAttribute("message", message);
		return "messagePage";
	}

	
	@RequestMapping("fundTransfer")
	public String fundTransfer(Model model) {
		return "fundTransfer";
	}
	
	
	@RequestMapping("doFundTransfer")
	public String doFundTransfer(@RequestParam("accNoSender") String accNoSender, 
			@RequestParam("accNoReciever") String accNoReciever,
			@RequestParam("amount") String amount,
			
			Model model) {
		int status = service.fundTransfer(Integer.parseInt(accNoSender),
				Integer.parseInt(accNoReciever),
				Double.parseDouble(amount));
		String message = "Fund transfer unsuccessful due to insufficient funds in the senders account";
		if (status != -1) {
			message = "<h2>Fund Transfer was successful</h2> Date and time of transfer is "
					+ (LocalDate.now()).toString();
			System.out.println(LocalDate.now());
		}
		model.addAttribute("message", message);
		return "messagePage";
	}
}

