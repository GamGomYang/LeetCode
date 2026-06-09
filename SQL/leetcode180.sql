'solution 1
Runtime
547ms
Beats
81.29%
'

SELECT DISTINCT num AS ConsecutiveNums
FROM (SELECT num , 
LAG(num,1) OVER (ORDER BY id) AS prev , 
LAG(num,2) OVER(ORDER BY id) AS prev2
FROM Logs
) t
WHERE num = t.prev AND num = t.prev2;


'solution 2
Runtime
864ms
Beats
5.22%'

SELECT DISTINCT num AS ConsecutiveNums
FROM
    (SELECT num,
    LAG(num) OVER(ORDER BY id) AS prev,
    LEAD(NUM) OVER(ORDER BY ID) AS next
    FROM Logs) t
WHERE num = t.prev AND num = t.next;