package az.spring.jdbc;

import az.spring.jdbc.config.SpringJdbcConfig;
import az.spring.jdbc.dao.EmployeeDao;
import az.spring.jdbc.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);

//        Employee employee = new Employee();
//        employee.setName("Elnur");
//        employee.setSurname("Muradov");
//        employee.setAge(21);
//        employee.setSalary(2000);
//        employee.setId(21);
        employeeDao.delete(23);

       long count = employeeDao.count();

        System.out.println("count:"+count);

        System.out.println(employeeDao.getEmployee(1));
        System.out.println(employeeDao.getAllEmployees());
    }

}
