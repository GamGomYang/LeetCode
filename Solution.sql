SELECT
    p.firstname,
    p.lastname,
    a.city,
    a.state
FROM Person p LEFT JOIN Address A on p.PersonId = a.PersonId


DELETE p1 
FROM Person p1 JOIN Person p2 ON p1.email = p2.email AND p1.id > p2.id

