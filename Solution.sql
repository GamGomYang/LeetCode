SELECT d.name AS Department ,
 e.name AS Employee,
 e.salary AS Salary
 FROM Department d , Employee e
 WHERE d.id = e.departmentId 
 AND e.salary = ( SELECT MAX(salary) FROM Employee e2
 WHERE e2.departmentId = e.departmentId);



SELECT DISTINCT m.player_id,
m.first_login
FROM Activity a
JOIN(
    SELECT player_id , MIN(event_date) AS first_login
    FROM Activity a2
    GROUP BY player_id
)m ON m.player_id = a.player_id