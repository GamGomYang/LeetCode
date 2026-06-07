SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);

'
"LIMIT와 OFFSET 이용하기
subquery로 한이유 - 만약 값이 1개라면 NULL 처리를 해야하는데
subquery에서는 만약에 값이 없다면 NULL반환 시켜줌"
SELECT (
SELECT DISTINCT salary
From Employee
ORDER BY salary DESC
LIMIT 1 OFFSET 1)
AS SecondHighestSalary;
'
