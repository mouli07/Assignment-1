package com.app.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.factory.MMBankFactory;
import com.app.service.MMBankService;

/**
 * Servlet implementation class AppController
 */
@WebServlet("/AppController")
public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, Object> account = new HashMap<String, Object>();
		MMBankFactory mmBankFactory = new MMBankFactory();
		HttpSession session = request.getSession();

		MMBankService serviceLayer = new MMBankService();

		String name = request.getServletPath();
		System.out.println(name);

		switch (name) {
		case "/addNewAccount.app":
			account.put("accountHolderName", request.getParameter("customerName"));
			account.put("gender", request.getParameter("gender"));

			String dob = request.getParameter("dob");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date = LocalDate.parse(dob, formatter);

			account.put("dateOfBirth", date);
			account.put("contactNumber", request.getParameter("contact_no"));
			account.put("houseNo", request.getParameter("houseNo"));
			account.put("street", request.getParameter("street"));
			account.put("city", request.getParameter("city"));
			account.put("state", request.getParameter("state"));
			account.put("pincode", request.getParameter("pincode"));
			account.put("email", request.getParameter("email"));
			account.put("nationality", request.getParameter("nationality"));

			account.put("accountType", request.getParameter("accountType"));
			System.out.println("&************************&");

			if (request.getParameter("accountType").equals("savingAccount")) {
				if (request.getParameter("salaried").equals("salaried")) {
					account.put("salaried", true);
					account.put("accountBalance", request.getParameter("savSbalance"));
				} else {
					account.put("salaried", false);
					account.put("accountBalance", request.getParameter("savNbalance"));
				}
				System.out.println();
				System.out.println("Map : " + account);
				System.out.println();

				session.setAttribute("createdbankAccount",
						serviceLayer.addBankAccount(mmBankFactory.createNewSavingsAccount(account)));

			} else {
				account.put("odLimit", request.getParameter("overDraft"));

				account.put("accountBalance", request.getParameter("curbalance"));

				session.setAttribute("createdbankAccount",
						serviceLayer.addBankAccount(mmBankFactory.createNewCurrentAccount(account)));

			}

			response.sendRedirect("addNewSuccess.jsp");
			break;

		case "/viewAllAccount.app":
			System.out.println("All Accounts : " + serviceLayer.getBankAccounts());
			session.setAttribute("BankAccounts", serviceLayer.getBankAccounts());
			response.sendRedirect("viewAllCustomers.jsp");
			break;

		case "/viewAccount.app":

			System.out.println("*********************1");

			String accountToSearched = request.getParameter("typedAccount");
			int accountToSearched2 = Integer.parseInt(accountToSearched);
			System.out.println("Account number : " + accountToSearched2);
			System.out.println(serviceLayer.getAccountByAccountNumber(accountToSearched2));

			System.out.println("*********************2");

			session.setAttribute("createdbankAccount", serviceLayer.getAccountByAccountNumber(accountToSearched2));

			System.out.println("*********************3");
			response.sendRedirect("viewAccount.jsp");

			break;
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
