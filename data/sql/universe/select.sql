SELECT un."name", COUNT(p.name)
FROM universe un
FULL JOIN calm_galaxy ca ON ca.universe_id = un.id
FULL JOIN active_galaxy ac ON ac.universe_id = un.id
CROSS JOIN galaxies ga
LEFT JOIN celestial_bodies ce ON ce.galaxies_id = ga.id
RIGHT JOIN star s ON s.celestial_bodies_id = ce.id
INNER JOIN planet p ON p.celestial_bodies_id = ce.id
GROUP BY (un."name")
HAVING "count"(p.name) >= 2;
