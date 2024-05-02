\echo ����� �������
SELECT * 
  FROM jaegers 
 ORDER BY model_name;

\echo �� ������������ ������
SELECT * 
  FROM jaegers 
 WHERE status != 'Destroyed' 
 ORDER BY model_name;

\echo ������ ����� Mark-1 � Mark-4 
SELECT * 
  FROM jaegers 
 WHERE mark IN ('Mark-1', 'Mark-4') 
 ORDER BY model_name;

\echo ��� ������, ����� Mark-1 � Mark-4
SELECT * 
  FROM jaegers 
 WHERE mark NOT IN ('Mark-1', 'Mark-4') 
 ORDER BY mark DESC;

\echo ���������� � ����� ������ ������
SELECT * 
  FROM jaegers 
 WHERE launch = (SELECT MIN(launch) 
		   FROM jaegers);

\echo ������, ������� ���������� ������ ���� kaiju
SELECT model_name, mark, launch, kaiju_kill 
  FROM jaegers 
 WHERE kaiju_kill = (SELECT MAX(kaiju_kill) 
		       FROM jaegers) 
 ORDER BY model_name;

\echo ������� ��� �������
SELECT ROUND(AVG(weight), 3)
  FROM jaegers;

\echo ��������� �� 1 ���������� ������������ kaiju � �������, ������� �� ��� ��� �� ���������
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1 
 WHERE status != 'Destroyed';

SELECT * 
  FROM jaegers 
 ORDER BY model_name;

\echo ������� ������������ �������
DELETE FROM jaegers 
 WHERE status = 'Destroyed';

SELECT * 
  FROM jaegers 
 ORDER BY model_name;