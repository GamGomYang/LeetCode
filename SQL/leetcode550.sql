SELECT ROUND(
    COUNT(a2.player_id)/COUNT(a1.player_id), 2
) AS fraction
FROM 
(SELECT player_id,
 MIN(event_date) AS first_date
 FROM Activity
 GROUP BY player_id) a1
 LEFT JOIN
 Activity a2
 ON 
 a1.player_id = a2.player_id 
 AND
 DATE_ADD(a1.first_date , INTERVAL 1 DAY) 
 = a2.event_date