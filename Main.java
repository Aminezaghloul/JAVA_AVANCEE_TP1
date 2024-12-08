import DAO.EmployeeDAOImpl;
import Model.EmployeeModel;
import Vue.Vue;
import Controller.EmployeeController;

public class Main {
    public static void main(String[] args) {
        EmployeeDAOImpl dao = new EmployeeDAOImpl();
        EmployeeModel model = new EmployeeModel(dao);
        Vue view = new Vue();
        new EmployeeController(model, view);
    }
}
