package com.orga.provider;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Organization {
	
	String name;
	Address address;
	double marketVal;
	String established;
	int empCount;
	Set<String> globalPresence=new TreeSet<>();
	List<String> boardMember=new ArrayList<>();
	Map<String,String> projectManager=new HashMap<>();
	
	
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public double getMarketVal() {
		return marketVal;
	}
	public String getEstablished() {
		return established;
	}
	public int getEmpCount() {
		return empCount;
	}
	public Set<String> getGlobalPresence() {
		return globalPresence;
	}
	public List<String> getBoardMember() {
		return boardMember;
	}
	public Map<String, String> getProjectManeger() {
		return projectManager;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setMarketVal(double marketVal) {
		this.marketVal = marketVal;
	}
	public void setEstablished(String established) {
		this.established = established;
	}
	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	public void setGlobalPresence(Set<String> globalPresence) {
		this.globalPresence = globalPresence;
	}
	public void setBoardMember(List<String> boardMember) {
		this.boardMember = boardMember;
	}
	public void setProjectManeger(Map<String, String> projectManeger) {
		this.projectManager = projectManeger;
	}
	
	public Organization(String name, Address address, double marketVal, String established, int empCount,
			Set<String> globalPresence, List<String> boardMember, Map<String, String> projectManager) {
		super();
		this.name = name;
		this.address = address;
		this.marketVal = marketVal;
		this.established = established;
		this.empCount = empCount;
		this.globalPresence = globalPresence;
		this.boardMember = boardMember;
		this.projectManager = projectManager;
	}
	@Override
	public String toString() {
		return "Organization [name=" + name + ", address=" + address + ", marketVal=" + marketVal + ", established="
				+ established + ", empCount=" + empCount + ", globalPresence=" + globalPresence + ", boardMember="
				+ boardMember + ", projectManager=" + projectManager + "]";
	}
	
	
	
	
	

}
