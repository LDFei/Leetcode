--https://leetcode.cn/problems/replace-employee-id-with-the-unique-identifier/?envType=study-plan-v2&envId=sql-free-50

SELECT eu.UNIQUE_ID,e.name
FROM Employees e
    LEFT JOIN EmployeeUNI eu
                   ON e.id = eu.id