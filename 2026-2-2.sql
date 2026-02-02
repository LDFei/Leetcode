--https://leetcode.cn/problems/product-sales-analysis-i/?envType=study-plan-v2&envId=sql-free-50

SELECT p.product_name,s.year,s.price FROM Sales s LEFT JOIN Product p on s.product_id = p.product_id