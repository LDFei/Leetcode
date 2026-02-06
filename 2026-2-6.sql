--https://leetcode.cn/problems/employee-bonus/?envType=study-plan-v2&envId=sql-free-50

SELECT e.name name,b.bonus
FROM Employee e
         LEFT JOIN Bonus b
                   ON e.empId = b.empId
WHERE b.bonus
    IS NULL OR b.bonus < 1000