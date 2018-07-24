
 class Sub extends Base1{
	 int j,k;
	Sub()
	{}
	 Sub(int i)
	 {
		 super(i);
		 System.out.println(i);
	 }
	 Sub(int j,int k)
	 {
	 this.j=j;
	 this.k=k;
	 System.out.println(j);
	 System.out.println(k);
	 }
	

}
