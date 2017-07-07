package exe03;

public abstract class ControllerFactory {
	
	public static Controller getController(Scholar model, ScholarView view) throws Exception{
		
		Controller _controller; 
		
		if( model.getClass().getName() == "exe03.Student")
			_controller = new StudentController(model, view);
		else if( model.getClass().getName() == "exe03.Teacher")
			_controller = new TeacherController(model, view);
		else 
			throw new Exception("Invalid class"); //Codigo inacessivel
		return _controller;
	}
	
}
