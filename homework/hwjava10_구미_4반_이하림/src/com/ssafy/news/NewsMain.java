package com.ssafy.news;

import javax.swing.*;

public class NewsMain extends NewsDAOSAXImpl{
	JFrame f;
	JButton b;
	JList li;
	JTextArea ta;
	INewsDAO dao;
	
	public NewsMain() {
		dao = new NewsDAOSAXImpl();
		createGUI();
		addEvent();
		showList();
	}
	
	private void showList() {
		// TODO Auto-generated method stub
		
	}

	private void addEvent() {
		// TODO Auto-generated method stub
		
	}

	private void createGUI() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		
		

	}

}
