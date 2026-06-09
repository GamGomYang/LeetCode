SELECT d.name AS Department ,
 e.name AS Employee,
 e.salary AS Salary
 FROM Department d , Employee e
 WHERE d.id = e.departmentId 
 AND e.salary = ( SELECT MAX(salary) FROM Employee e2
 WHERE e2.departmentId = e.departmentId);
