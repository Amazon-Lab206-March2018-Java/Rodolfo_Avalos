public class ProjectTest{
    public static void main(String[] args){
        Project none = new Project();
        Project onlyname = new Project("onlyname");
        Project fullinfo = new Project("fullinfo", "Project with the full description entered into the field for it.");
        Project completeinfo = new Project("fullinfo", "Project with the full description entered into the field for it.", 25000.00);
        none.elevatorPitch();
        onlyname.elevatorPitch();
        fullinfo.elevatorPitch();
        completeinfo.elevatorPitch();
        Project none2 = new Project();
        Project onlyname2 = new Project("onlyname2");
        none2.setName("This project had no name before.");
        onlyname2.setDescription("This project did not have a description before.");
        none2.elevatorPitch();
        onlyname2.elevatorPitch();
    }
}