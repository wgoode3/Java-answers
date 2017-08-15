public class Project {
	private String name;
	private String description;
	private double initialCost = 0;
	public Project(){
		this.name = "placeholder";
		this.description = "placeholder";
	}
	public Project(String name){
		this.name = name;
		this.description = "placeholder";
	}
	public Project(String name, String description){
		this.name = name;
		this.description = description;
	}
	public Project(String name, String description, double initialCost){
		this.name = name;
		this.description = description;
		this.initialCost = initialCost;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public double getInitialCost(){
		return this.initialCost;
	}
	public void setInitialCost(double initialCost){
		this.initialCost = initialCost;
	}
	public String elevatorPitch(){
		if(this.initialCost == 0){
			String pitch = String.format("%s: %s", this.name, this.description);
			return pitch;
		} else {
			String pitch = String.format("%s ($%.2f): %s", this.name, this.initialCost, this.description);
			return pitch;
		}
	}
}