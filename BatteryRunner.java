class BatteryRunner
{
	public static void main(String[] args){
		Battery battery=new Battery(120,true,50,"Li-ion",2);
		System.out.println("battery capacity:"+battery.capacity);
		System.out.println("battery is rechargeble:"+battery.isRechargeable);
		System.out.println("battery voltage:"+battery.voltage);
		System.out.println("battery type:"+battery.type);
		System.out.println("battery life cycle:"+battery.cycleLife);
		
	}
}