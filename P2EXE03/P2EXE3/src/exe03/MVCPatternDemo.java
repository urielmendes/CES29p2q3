package exe03;

public class MVCPatternDemo {
	public static void main(String[] args) throws Exception {

		// fetch student record based on his roll no from the database
		Scholar model = retrivePersonFromDatabase("student");

		// Create a view : to write student details on console
		ScholarView view = new ScholarView();

		//ControllerFactory é uma classe factory que pode gerar dois tipos de controller
		Controller controller = ControllerFactory.getController(model, view);

		controller.updateView();

		// update model data
		controller.setName("John");

		controller.updateView();
		
		////////////////////////////////////////////
		model = retrivePersonFromDatabase("teacher");
		controller = ControllerFactory.getController(model, view);
		controller.updateView();
		
		controller.setName("James");
		controller.updateView();
		///////////////////////////////////////////
		
	}

	private static Scholar retrivePersonFromDatabase(String scholar) throws Exception{
		Scholar model;
		if(scholar == "student"){
			model = new Student();
			model.setName("Robert");
			model.setRollNo("10");	
		}
		else if (scholar == "teacher"){
			model = new Teacher();
			model.setName("Paul");
			model.setRollNo("2");
		}
		else
			throw new Exception("invalid occupation");
		return model;
	}

}
