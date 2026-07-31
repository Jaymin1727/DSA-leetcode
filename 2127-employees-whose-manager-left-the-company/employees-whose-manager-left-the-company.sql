# Write your MySQL query statement below

select e.employee_id from employees e
left join employees e2
on e.manager_id=e2.employee_id
where e.salary<30000 and e.manager_id is not null and e2.employee_id is null
order by e.employee_id;