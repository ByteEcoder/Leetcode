# Write your MySQL query statement below
select p.firstName,p.lastName,r.city,r.state
from Person p
left join Address r
on p.personId=r.personId