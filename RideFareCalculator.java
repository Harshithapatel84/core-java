class RideFareCalculator{
	double distance;
	int timeOfDay;
	boolean isSurgePricing;
	double waitingMinutes;
	double baseFare;
	double waitingCharge;
	
	
	RideFareCalculator(double distance,int timeOfDay,boolean isSurgePricing,double waitingMinutes)
	{
		this.distance=distance;
		this.timeOfDay=timeOfDay;
		this.isSurgePricing=isSurgePricing;
		this.waitingMinutes=waitingMinutes;
	}
    double calculateBaseFare()
	{
	if(distance <= 2)
		{
			baseFare=5;
		}
		else 
		{
			baseFare=5+(distance-2)*1.5;
			
		}
		return baseFare;
	}
	double applyTimeSurcharge(double baseFare)
	{
		if(timeOfDay == 23 || timeOfDay < 5)
		{
		baseFare=baseFare+(baseFare*0.25);
		}
		else if(timeOfDay >= 7 && timeOfDay <= 9 )
		{
		baseFare=baseFare+(baseFare * 0.15);
		}
		else{
			System.out.println("no surcharge");
		}
		return baseFare;
	}
	double applyWaitingCharges(double fareAfterTime)
	{
			for (int i = 3; i <= waitingMinutes; i++)
		{
            waitingCharge = waitingCharge + 0.50;
        }

        return fareAfterTime + waitingCharge;
    }
	double calculateFinalFare()
	{
		double baseFare = calculateBaseFare();
        double fareAfterTime = applyTimeSurcharge(baseFare);
        double fareAfterWaiting = applyWaitingCharges(fareAfterTime);
	 if (isSurgePricing) 
	 {
            fareAfterWaiting *= 1.5;
     }
	return Math.round(fareAfterWaiting * 100.0) / 100.0;
	}
}