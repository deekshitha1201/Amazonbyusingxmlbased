package com.amazon;

public class paymentprocess {
	
	private payment pay;
	
	public void setPay(payment pay) {
		this.pay = pay;
	}
	public String dopayment()
	{
	  return pay.paybill();
	}

	

}
