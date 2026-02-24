class BucketRunner{
	public static void main(String[] args)
	{
		Bucket bucket=new Bucket("Blue",24,150,"Plastic",50);
		System.out.println("Bucket color:"+bucket.color);
		System.out.println("Bucket capacity:"+bucket.capacity);
		System.out.println("Bucket price:"+bucket.price);
		System.out.println("Bucket made by:"+bucket.material);
		System.out.println(" no of Bucket:"+bucket.noOfBucket);
	}
}