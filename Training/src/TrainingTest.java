//Driver program to test the training implementation
public class TrainingTest 
{
	public static void main(String args[])
	{
		
		Training publicTraining = new PublicTraining(5000,"Java","1678",50);
		System.out.println(publicTraining);
		System.out.println("Training Cost :: "+publicTraining.getOrderValue());
		
		Training corporateTraining=new CorporateTraining(35000,"Big Data","3444",4);
		System.out.println(corporateTraining);
		System.out.println("Training Cost :: "+corporateTraining.getOrderValue());
				
	}
	
}
