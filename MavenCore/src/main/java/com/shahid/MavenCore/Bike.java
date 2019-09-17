package com.shahid.MavenCore;

import org.springframework.stereotype.Component;

@Component
public class Bike  implements Vehicle{
	
	public void Drive()  {
		
		System.out.println("Riding........");
	}

}
