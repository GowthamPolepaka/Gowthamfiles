package org.jsp.app;

public enum SeatType 
{
	VIP(200),
	NORMAL(300),
	EXECUTIVE(400),
	PREMIUM(500);

	int value;
	SeatType(int value) 
	{
		this.value=value;
		
	}


}
