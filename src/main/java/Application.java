import DAO.CityDAO;
import DAO.CityDAOImpl;
import DAO.EmployeeDAO;
import DAO.EmployeeDAOImpl;
import model.City;
import model.Employee;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();

        Employee employee1 = new Employee("Petr", "Petrov", "male", 25, new City("Moscow"));
        employeeDAO.create(employee1);

        System.out.println(employeeDAO.readById(31));

        List<Employee> employeeList = employeeDAO.readAll();
        employeeList.forEach(System.out::println);

        Employee employee2 = new Employee(31, "Sergey", "Ivanov", "male", 20, new City("N.NOVGOROD"));
        employeeDAO.updateEmployee(employee2);

        employeeDAO.deleteEmployee(employee2);

        City city1 = new City("Serov");
        cityDAO.create(city1);

        System.out.println(cityDAO.readById(3));

        List<City> cityList = cityDAO.readAll();
        cityList.forEach(System.out::println);

        City city2 = new City("Sarov");
        cityDAO.updateCity(city2);

        cityDAO.deleteCity(city2);
    }
}