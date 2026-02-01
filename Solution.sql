SELECT
    p.firstname,
    p.lastname,
    a.city,
    a.state
FROM Person p LEFT JOIN Address A on p.PersonId = a.PersonId