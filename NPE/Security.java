class Security{
	boolean encryption;

	Security(boolean encryption){
		this.encryption=encryption;
	}
	void showData()
	{
		System.out.println("encryption:"+this.encryption);
	}
}