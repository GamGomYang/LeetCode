SELECT DISTINCT m.player_id,
m.first_login
FROM Activity a
JOIN(
    SELECT player_id , MIN(event_date) AS first_login
    FROM Activity a2
    GROUP BY player_id
)m ON m.player_id = a.player_id