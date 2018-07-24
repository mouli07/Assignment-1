package InterfaceAssignmentVehicle;

public class VDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle []vehicles=new Vehicle[3];
		Fourwheeler four=new Fourwheeler();
		vehicles[0]=four;
		TwoWheeler two=new TwoWheeler();
		vehicles[1]=two;
		ThreeWheeler three=new ThreeWheeler();
		vehicles[1]=three;
		for(int i=0;i<3;i++) {
			if(vehicles[i]==three) {
				vehicles[i].start();
			}
		}
	}

}
