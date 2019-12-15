package com.sankha.exception;

import com.sankha.exception.MySQLAccess;
public class DatabaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MySQLAccess dao = new MySQLAccess();
        try {
			dao.readDataBase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
