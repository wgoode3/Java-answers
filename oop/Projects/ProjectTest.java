public class ProjectTest {
	public static void main(String[] args){
		
		Project project1 = new Project();
		Project project2 = new Project("name");
		Project project3 = new Project("name", "description");
		
		String pitch1 = project1.elevatorPitch();
		String pitch2 = project2.elevatorPitch();
		String pitch3 = project3.elevatorPitch();
		
		System.out.println(pitch1);
		System.out.println(pitch2);
		System.out.println(pitch3);
		
		project1.setName("New name");
		project1.setDescription("New description");
		String pitch4 = project1.elevatorPitch();
		System.out.println(pitch4);

		String str1 = project3.getName();
		String str2 = project2.getDescription();
		System.out.println(str1);
		System.out.println(str2);

		Project project4 = new Project("test", "also test", 99.99);
		String pitch5 = project4.elevatorPitch();
		System.out.println(pitch5);
		
		project1.setInitialCost(10.50);
		String pitch6 = project1.elevatorPitch();
		double cost = project2.getInitialCost();
		System.out.println(pitch6);
		System.out.println(cost);

		Portfolio portfolio = new Portfolio();
		portfolio.addProject(project1);
		portfolio.addProject(project2);
		portfolio.addProject(project3);
		portfolio.addProject(project4);
		double porfolioCost = portfolio.getPortfolioCost();
		System.out.println(porfolioCost);
		portfolio.showPortfolio();

	}
}