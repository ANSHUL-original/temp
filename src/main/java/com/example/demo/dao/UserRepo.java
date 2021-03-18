package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	@Query(value = "select employee.*, organisation.org_name from (employee inner join organisation on employee.org_id=organisation.org_id) where employee.emp_joining BETWEEN '2021/01/21' AND '2021/03/21';", nativeQuery = true)
	public List<Object[]> findFunction1();

	@Query(value = "select salary.sal from ((employee join salary on employee.emp_id=salary.emp_id) join organisation on organisation.org_id=employee.org_id) where organisation.org_name='brsofttech' and employee.emp_name='amit';", nativeQuery = true)
	public List<Object[]> findFunction2();

	@Query(value = "select min(a.sal) from (select distinct salary.sal from salary inner join\n"
			+ " (select emp.emp_id, org.org_name from employee emp inner join organisation org on emp.org_id=org.org_id) as b\n"
			+ " ON \n" + " b.emp_id=salary.emp_id where b.org_name='infosis' limit 2) as a;", nativeQuery = true)
	public List<Object[]> findFunction3();

	@Query(value = "select e.emp_joining from employee e inner join salary s on e.emp_id=s.emp_id where s.sal=20000 and e.emp_name='amit';\n"
			+ "", nativeQuery = true)
	public List<Object[]> findFunction4();

	@Query(value = "select * from user where u_tech=?1", nativeQuery = true)
	public List<User> applyFilterTech(String uTech);

	@Query(value = "SELECT u.uName FROM User u", nativeQuery = false)
	public List<Object> getNameList();

}
