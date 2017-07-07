package exe03;

public abstract class Controller {

	protected Scholar model;
	protected ScholarView view;

	public Controller(Scholar model, ScholarView view) {
		this.model = model;
		this.view = view;
	}

	public void setName(String name) {
		model.setName(name);
	}

	public String gettName() {
		return model.getName();
	}

	public void setRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getRollNo() {
		return model.getRollNo();
	}

	public void updateView() {
		if(model.getClass().getName()=="exe03.Student")
			view.printStudentDetails(model.getName(), model.getRollNo(), "Student");
		else if(model.getClass().getName()=="exe03.Teacher")
			view.printStudentDetails(model.getName(), model.getRollNo(), "Teacher");
	}

}