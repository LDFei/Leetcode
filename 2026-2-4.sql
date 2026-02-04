--https://leetcode.cn/problems/rising-temperature/?envType=study-plan-v2&envId=sql-free-50

SELECT w1.id FROM Weather w1 JOIN Weather w2
    ON datediff(w1.recorddate,w2.recorddate) = 1
    WHERE w1.temperature > w2.temperature