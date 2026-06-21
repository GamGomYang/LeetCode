SELECT DISTINCT num AS ConsecutiveNums
FROM (SELECT num , 
LAG(num,1) OVER(ORDER BY id) prev1 , 
LAG(num,2) OVER(ORDER BY id) prev2 
FROM Logs) t
WHERE num = t.prev1 AND num = t.prev2


SELECT d.name AS Department ,
e.name AS Employee,
e.salary AS Salary
FROM Department d , Employee e 
WHERE d.id = e.department_id 
AND e.salary = (SELECT MAX(salary) FROM Employee e2 WHERE
e2.departmentId = e.departmentId);

SELECT DISTINCT m.player_id , 
m.first_login
FROM Activity a
JOIN(SELECT player_id , MIN(event_date) AS first_login FROM
Activity a2 
GROUP BY player_id) m ON m.player_id = e.player_id


SELECT p.firstName , p.lastName , a.city , a.state
FROM Person p 
LEFT JOIN (SELECT * FROM Address ) a 
ON p.personId = a.personId;

SELECT MAX(e.salary) as SecondHighestSalary
FROM Employee e
WHERE e.salary < (SELECT Max(salary) 
FROM Employee e2);

SELECT (SELECT DISTINCT salary FROM Employee
ORDER BY salary DESC
LIMIT 1 OFFSET 1) as SecondHighestSalary ;


CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN ( 
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT N-1 ,1
  );
END

SELECT score, 
DENSE_RANK() OVER (ORDER BY score DESC) AS 'rank'
FROM Scores
ORDER BY score DESC;

SELECT DISTINCT num as ConsecutiveNums 
FROM 
(SELECT num , 
LAG(num,1) OVER(ORDER BY id)AS prev1,
LAG(num,2) OVER(ORDER BY id)AS prev2 
FROM Logs) t 
WHERE num = t.prev1 and num = t.prev2;


SELECT d.name AS Department,
       emp.name AS Employee,
       emp.salary AS Salary
FROM Department d
JOIN Employee emp
  ON d.id = emp.departmentId
JOIN (
    SELECT departmentId,
           MAX(salary) AS max_salary
    FROM Employee
    GROUP BY departmentId
) e
  ON emp.departmentId = e.departmentId
 AND emp.salary = e.max_salary;

SELECT d.name AS Department,
       e.name AS Employee,
       e.salary AS Salary
FROM Department d
JOIN Employee e
    ON d.id = e.departmentId
JOIN(
    SELECT departmentId, 
    MAX(salary) AS max_salary
    FROM Employee
    GROUP by departmentId

) e2
ON e.departmentId = e2.departmentId
AND e.salary = e2.max_salary;

SELECT player_id , 
device_id , 
count(device_id) OVER (ORDER BY player_id)
FROM Activity

SELECT ROUND(
    COUNT(a2.player_id) / COUNT(a1.player_id),
    2
) AS fraction
FROM (
    SELECT player_id,
           MIN(event_date) AS first_date
    FROM Activity
    GROUP BY player_id
) a1
LEFT JOIN Activity a2
  ON a1.player_id = a2.player_id
 AND DATE_ADD(a1.first_date, INTERVAL 1 DAY) = a2.event_date;


 SELECT e.name ,
       b.bonus 
 FROM Employee e
  LEFT JOIN Bonus b 
    ON e.empId = b.empId
WHERE b.bonus IS NULL 
OR b.bonus < 1000

SELECT e1.name 
FROM Employee e1 , 
(SELECT e2.id , COUNT(e2.id) AS count
FROM Employee e2 
WHERE count > 5) e2
WHERE e1.id = e2.id; 

SELECT e1.name 
FROM Employee e1
JOIN
(SELECT managerId 
FROM Employee
GROUP BY managerId  
HAVING COUNT(*) >= 5) e2
ON e1.id = e2.managerId


SELECT name 
FROM Customer
WHERE referee_id IS NULL 
OR referee_id <> 2

SELECT ROUND(SUM(tiv_2016),2) AS tiv_2016
FROM Insurance
WHERE tiv_2015 IN (
  SELECT tiv_2015
  FROM Insurance
  GROUP BY tiv_2015
  HAVING COUNT(*)>1
)
AND
(lat , lon) IN (
  SELECT lat , lon
  FROM Insurance 
  GROUP BY lat , lon
  HAVING COUNT(*) = 1
)

SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(*) DESC
LIMIT 1