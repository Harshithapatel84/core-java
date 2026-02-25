class DropRunner{
	public static void main(String[] args)
	{
		Drop drop=new Drop("water",2.34,"white","spherical",true);
		System.out.println("droplet type is:"+drop.type);
		System.out.println("droplet weight is:"+drop.weight);
		System.out.println("droplet color is:"+drop.color);
		System.out.println("droplet shape is:"+drop.shape);
		System.out.println(" is droplet evaporate:"+drop.evaporate);
	}
}