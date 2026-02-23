class LabourRunner{
	public static void main(String[] values)
	{
		Labour labour=new Labour();
		labour.name="keshav";
		labour.salary=10000;
		labour.idProofs=new String[]{"pan card","aadhar card"};
		System.out.println("labour name is:"+labour.name);
		System.out.println("salry of the labour is:"+labour.salary);
		System.out.println("labour id Proofs are:"+labour.idProofs);
		for(int i=0;i<labour.idProofs.length;i++)
		{
			System.out.println(labour.idProofs[i]);
		}
		
		Labour labour1=new Labour();
		labour1.name="kamala";
		labour1.salary=8000;
		labour1.idProofs=new String[]{"BPL card "," APL card"};
		System.out.println("labour name is:"+labour1.name);
		System.out.println("salry of the labour is:"+labour1.salary);
		System.out.println("id Proofs of labour:"+labour1.idProofs);
		for(int i=0;i<labour1.idProofs.length;i++)
		{
			System.out.println(labour1.idProofs[i]);
		}
		
	}
}