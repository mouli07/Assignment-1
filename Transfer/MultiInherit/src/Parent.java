//Parent class inherited from GrandParent class
class Parent extends GrandParent
{
	int im1;
	
	//Non-arg Constructor
	Parent()
	{
		System.out.println("Parent Constructor");
	}
	
	//Parameterized Constructor
	Parent(int im1,double im2) {
		this.im1 = im1;
		System.out.println("Parent Non-arg Constructor "+im2);
	}
}
