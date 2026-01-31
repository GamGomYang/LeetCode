SELECT 
    p.firstName,
    p.lastName,
    a.city,
    a.state

FROM Person p LEFT JOIN Address a On p.personId = a.personId;