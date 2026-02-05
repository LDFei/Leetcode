--https://leetcode.cn/problems/average-time-of-process-per-machine/?envType=study-plan-v2&envId=sql-free-50
SELECT
    t1.machine_id,
    ROUND(AVG(t2.timestamp - t1.timestamp), 3) AS processing_time
FROM Activity t1
         JOIN Activity t2 ON t1.machine_id = t2.machine_id
    AND t1.process_id = t2.process_id
    AND t1.activity_type = 'start'
    AND t2.activity_type = 'end'
GROUP BY t1.machine_id;