-- 코드를 작성해주세요
SELECT SUM(hg.SCORE) AS SCORE, hg.EMP_NO, he.EMP_NAME, he.POSITION, he.EMAIL
FROM HR_EMPLOYEES he JOIN HR_GRADE hg ON he.EMP_NO = hg.EMP_NO
WHERE hg.YEAR = '2022'
GROUP BY 
    he.EMP_NO, he.EMP_NAME, he.POSITION, he.EMAIL
HAVING 
    SUM(hg.SCORE) = (
        SELECT MAX(total_score)
        FROM (
            SELECT SUM(SCORE) AS total_score
            FROM HR_GRADE
            WHERE YEAR = 2022
            GROUP BY EMP_NO
        ) AS max_scores
    )
