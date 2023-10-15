SELECT E1.name 
FROM Employee E1
 JOIN Employee E2
 ON E2.managerId = E1.id
 GROUP BY E2.managerId
 HAVING COUNT(E2.id)>=5;