-- 코드를 입력하세요
SELECT ai.ANIMAL_ID, ao.NAME
FROM ANIMAL_INS ai JOIN ANIMAL_OUTS ao ON ai.ANIMAL_ID = ao.ANIMAL_ID
WHERE DATEDIFF(ai.DATETIME, ao.DATETIME)
ORDER BY DATEDIFF(ai.DATETIME, ao.DATETIME)
LIMIT 2
