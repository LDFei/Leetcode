--https://leetcode.cn/problems/not-boring-movies/?envType=study-plan-v2&envId=sql-free-50

SELECT * FROM cinema c WHERE c.description != 'boring' AND c.id % 2 != 0 order by c.rating desc;