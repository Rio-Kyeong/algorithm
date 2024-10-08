-- 코드를 입력하세요
SELECT u.USER_ID, u.NICKNAME, CONCAT(u.CITY, ' ', u.STREET_ADDRESS1, ' ', u.STREET_ADDRESS2) AS 전체주소, CONCAT(SUBSTR(u.TLNO, 1, 3), '-', SUBSTR(u.TLNO, 4, 4), '-', SUBSTR(u.TLNO, 8, 4)) AS 전화번호
FROM USED_GOODS_USER u
JOIN USED_GOODS_BOARD b ON b.WRITER_ID = u.USER_ID
GROUP BY u.USER_ID, u.NICKNAME, u.CITY, u.STREET_ADDRESS1, u.STREET_ADDRESS2, u.TLNO
HAVING COUNT(b.BOARD_ID) >= 3
ORDER BY u.USER_ID DESC;
                                                                                                     