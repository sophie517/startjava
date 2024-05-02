\echo вывод таблицы
SELECT * 
  FROM jaegers 
 ORDER BY model_name;

\echo не уничтоженные роботы
SELECT * 
  FROM jaegers 
 WHERE status != 'Destroyed' 
 ORDER BY model_name;

\echo роботы серий Mark-1 и Mark-4 
SELECT * 
  FROM jaegers 
 WHERE mark IN ('Mark-1', 'Mark-4') 
 ORDER BY model_name;

\echo все роботы, кроме Mark-1 и Mark-4
SELECT * 
  FROM jaegers 
 WHERE mark NOT IN ('Mark-1', 'Mark-4') 
 ORDER BY mark DESC;

\echo информация о самом старом роботе
SELECT * 
  FROM jaegers 
 WHERE launch = (SELECT MIN(launch) 
		   FROM jaegers);

\echo роботы, которые уничтожили больше всех kaiju
SELECT model_name, mark, launch, kaiju_kill 
  FROM jaegers 
 WHERE kaiju_kill = (SELECT MAX(kaiju_kill) 
		       FROM jaegers) 
 ORDER BY model_name;

\echo средний вес роботов
SELECT ROUND(AVG(weight), 3)
  FROM jaegers;

\echo увеличить на 1 количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1 
 WHERE status != 'Destroyed';

SELECT * 
  FROM jaegers 
 ORDER BY model_name;

\echo удалить уничтоженных роботов
DELETE FROM jaegers 
 WHERE status = 'Destroyed';

SELECT * 
  FROM jaegers 
 ORDER BY model_name;