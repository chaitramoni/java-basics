class WashingMachineTester
{
	public static void main(String a[])
	{
		WashingMachine.brand = "Whirlpool";
		WashingMachine.price = 35999;
		WashingMachine.onOrOff();
		WashingMachine.increaseVolume();
		WashingMachine.increaseVolume();
		WashingMachine.decreaseVolume();
		WashingMachine.increaseVolume();
		WashingMachine.increaseVolume();
		WashingMachine.decreaseVolume();
		WashingMachine.increaseVolume();
		WashingMachine.onOrOff();
		WashingMachine.onOrOff();
		WashingMachine.increaseVolume();
		
		System.out.println("Main Method ended");
	}

}