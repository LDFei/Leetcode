--https://leetcode.cn/problems/students-and-examinations/?envType=study-plan-v2&envId=sql-free-50
SELECT
    s.student_id,
    s.student_name,
    su.subject_name,
    COUNT(e.subject_name) AS attended_exams
FROM
    Students AS s
        JOIN
    Subjects AS su
        LEFT JOIN
    Examinations AS e
    ON
        e.student_id = s.student_id
            AND
        e.subject_name = su.subject_name
GROUP BY
    s.student_id,
    su.subject_name
ORDER BY
    s.student_id,
    su.subject_name