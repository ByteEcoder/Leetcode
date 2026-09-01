# Write your MySQL query statement below
delete c1
from Person c1
join Person c2
on c1.email = c2.email
and c1.id>c2.id;


