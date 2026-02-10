--https://leetcode.cn/problems/managers-with-at-least-5-direct-reports/?envType=study-plan-v2&envId=sql-free-50

SELECT e2.name
FROM Employee e1              -- e1 作为“下属”表
         JOIN Employee e2              -- e2 作为“经理”表
              ON e1.managerId = e2.id       -- 连接条件：下属的 managerId = 经理的 id
GROUP BY e2.id, e2.name       -- 按经理分组
HAVING COUNT(e1.id) >= 5;     -- 统计下属的数量