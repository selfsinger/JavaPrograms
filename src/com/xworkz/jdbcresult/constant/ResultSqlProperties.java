package com.xworkz.jdbcresult.constant;

public enum ResultSqlProperties {
	
URL("jdbc:mysql://localhost:3306/ticket"),USERNAME("root"),PASSWORD("Sql@#meg4$");
	
	private String value;
	
	private ResultSqlProperties(String value)
	{
		this.value=value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	

}
