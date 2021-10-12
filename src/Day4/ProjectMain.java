package Day4;

public class ProjectMain {
        public static void main(String[] args) {

            Project project1 = new Project("NewERA","Dec 30, 2021", 20000.00);
            project1.display();

            Project project2 = new Project("EraITProject","Jan 01, 2021", 50000.00);
            project2.display();

            Project project3 = new Project("NewERA",3,"Dec 30, 2021", 20000.00);
            project3.display();

            Project project4 = new Project("EraITProject",4,"Jan 01,2021", 50000.00);
            project4.display();
        }

    }
