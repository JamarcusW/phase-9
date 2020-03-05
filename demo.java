
public class demo {

	public static void main(String[] args) {
		
		Person p1 =new Person();
		
		System.out.println(p1);
		
		System.out.println(p1.getWage());
		
		p1.addCity("Oregon");
		p1.addCity("Alabama");
		p1.addCity("Germantown");
		p1.addCity("Jacksonville");
		p1.addCity("Gaithersburg");
		p1.addCity("Rockville");

		
//		String [] cities = p1.getcitiesLivedin();
//		
//		for(int i = 0; i < cities.length;i++)
//		{
//			System.out.println(cities[i]);
//		}
		
		System.out.println(p1.listofcities());
	}

}
