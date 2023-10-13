# Write your MySQL query statement below
Select u.unique_id as unique_id, n.name as name
from Employees n LEFT JOIN EmployeeUNI u
on n.id = u.id;