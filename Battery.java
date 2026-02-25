class Battery{
	double capacity;
	boolean isRechargeable;;
	double voltage;
	String type;
	int cycleLife;
	
	Battery(){
		
	}
	Battery(double capacity,boolean isRechargeable,double voltage,String type,int cycleLife){
		this.capacity=capacity;
		this.isRechargeable=isRechargeable;
		this.voltage=voltage;
		this.type=type;
		this.cycleLife=cycleLife;
	}
	Battery(String type,double voltage){
		this.type=type;
		this.voltage=voltage;
	}
	Battery(double capacity,boolean isRechargeable,double voltage){
		this.capacity=capacity;
		this.isRechargeable=isRechargeable;
		this.voltage=voltage;
	}
	Battery(int cycleLife){
		this.cycleLife=cycleLife;
	}
	Battery(boolean isRechargeable,double voltage){
		this.isRechargeable=isRechargeable;
		this.voltage=voltage;
	}
}