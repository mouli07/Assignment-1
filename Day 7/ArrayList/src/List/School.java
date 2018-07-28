/*Definition of School features*/
package List;

public class School {
	
	String name;
	String city;
	String school_dist;
	int greatSchoolRanking;
	
	public School(String name,String city,String school_dist,int greatSchoolRanking)			//Construuctor
	{
		this.name=name;
		this.city=city;
		this.school_dist=school_dist;
		this.greatSchoolRanking=greatSchoolRanking;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getSchool_dist()
	{
		return school_dist;
	}
	
	public int getGreatSchoolRanking()
	{
		return greatSchoolRanking;
	}
	

}
