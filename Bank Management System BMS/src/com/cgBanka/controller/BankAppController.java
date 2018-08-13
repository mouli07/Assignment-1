package com.cgBanka.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cgBanka.service.cgBankService;
import com.framework.service.BankService;

/**
 * Servlet implementation class BankAppController
 */
@WebServlet("*.app")
public class BankAppController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BankService service = new cgBankService();
    /**
     * Default constructor. 
     */
    public BankAppController() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String action = request.getServletPath();
		
		switch(action)	{
		
		case "/viewAccount.app" :
			session = request.getSession();
			session.setAttribute("viewAcc", service.getAllAccounts());	
			System.out.println(service.getAllAccounts());
			response.sendRedirect("viewaccount.jsp");
			break;
		
			
		
		case "/searchaccount.app" :
			int accNum = Integer.parseInt(request.getParameter("accnum"));
			service.searchAccount(accNum);
			response.sendRedirect("search.jsp");
			
		case "/deposit.app" :
			accNum=Integer.parseInt(request.getParameter("accnum"));
			double amount=Double.parseDouble(request.getParameter("amount"));
			service.deposit(accNum, amount);
			response.sendRedirect("depositform.jsp");
			
		case "/withdraw.app" :
			accNum=Integer.parseInt(request.getParameter("accnum"));
			amount=Double.parseDouble(request.getParameter("amount"));
			service.withdraw(accNum, amount);
			response.sendRedirect("withdrawform.jsp");
			
		case "/fundtransfer.app" :
			int accNum1=Integer.parseInt(request.getParameter("accnum1"));
			int accNum2=Integer.parseInt(request.getParameter("accnum2"));
			amount=Double.parseDouble(request.getParameter("amount"));
			service.fundTransfer(accNum1, accNum2, amount);
			response.sendRedirect("fundtransfer.jsp");
		}		
			
			
		
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	


}
