public class Project{
    private String name;
    private String description;
    private Double initialCost;
    public void elevatorPitch(){
        System.out.println(name +" ("+initialCost+") :"+ description);
    }
    public Project(){
        name = "";
        description = "";
        initialCost = 0.0;
    }
    public Project(String name){
        this.name = name;
        description = "";
        initialCost = 0.0;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
        initialCost = 0.0;
    }
    public Project(String name, String description, Double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setInitialCost(Double initialCost){
        this.initialCost = initialCost;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public Double getInitialCost(){
        return initialCost;
    }
}