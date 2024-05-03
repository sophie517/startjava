\echo table output
SELECT * 
  FROM jaegers 
 ORDER BY model_name;

\echo non-destroyed robots
SELECT * 
  FROM jaegers 
 WHERE status != 'Destroyed' 
 ORDER BY model_name;

\echo Mark-1 and Mark-4 robots 
SELECT * 
  FROM jaegers 
 WHERE mark IN ('Mark-1', 'Mark-4') 
 ORDER BY model_name;

\echo all robots exept Mark-1 and Mark-4
SELECT * 
  FROM jaegers 
 WHERE mark NOT IN ('Mark-1', 'Mark-4') 
 ORDER BY mark DESC;

\echo the oldest robots information
SELECT * 
  FROM jaegers 
 WHERE launch = (SELECT MIN(launch) 
                   FROM jaegers);

\echo robots that have destroyed the most number of kaiju
SELECT model_name, mark, launch, kaiju_kill 
  FROM jaegers 
 WHERE kaiju_kill = (SELECT MAX(kaiju_kill) 
                       FROM jaegers) 
 ORDER BY model_name;

\echo robots average weight
SELECT ROUND(AVG(weight), 3)
  FROM jaegers;

\echo increased by 1 the number of destroyed kaiju for robots that are still not destroyed
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1 
 WHERE status != 'Destroyed';

SELECT * 
  FROM jaegers 
 ORDER BY model_name;

\echo delete destroyed robots
DELETE FROM jaegers 
 WHERE status = 'Destroyed';

SELECT * 
  FROM jaegers 
 ORDER BY model_name;