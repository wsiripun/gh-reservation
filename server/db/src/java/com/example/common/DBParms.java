package com.example.common;

public class DBParms {
    private String url = "jdbc:mysql://localhost:3306/wijs_reservation";
    private String user = "dbuser";
    private String password = "dbpassword";
    
    static DBParms dbParms = new DBParms();
    
    private DBParms() {
    }
    
    public static DBParms getInstance() {
    	return dbParms;
    }
    
    public String getUrl() {
    	return url;
    }
    
    public String getUser() {
    	return user;
    }
    
    public String getPassword() {
    	return password;
    }
}
