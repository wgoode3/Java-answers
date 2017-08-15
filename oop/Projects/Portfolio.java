import java.util.ArrayList;

public class Portfolio {
	private ArrayList<Project> portfolio = new ArrayList<Project>();
	public void addProject(Project project){
		portfolio.add(project);
	}
	public ArrayList<Project> getPortfolio(){
		return this.portfolio;
	}
	public double getPortfolioCost(){
		int len = this.portfolio.size();
		double cost = 0;
		for (int i = 0; i < len; i++){
			double projectCost = portfolio.get(i).getInitialCost();
			cost += projectCost;
		}
		return cost;	
	}
	public void showPortfolio(){
		int len = this.portfolio.size();
		double cost = 0;
		System.out.println("*******************");
		for (int i = 0; i < len; i++){
			Project project = portfolio.get(i);
			cost += project.getInitialCost();
			System.out.println(project.elevatorPitch());
			System.out.println("*******************");
		}
		System.out.println("The porfolio cost is $" + cost);
	}
}