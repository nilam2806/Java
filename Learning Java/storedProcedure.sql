use world;
create table emp(emp_id int primary key,
emp_name varchar(20),
salary decimal(10,2)
);
insert into emp values(101,"Ansh",20000);
insert into emp values(102,"Danish",16000);
insert into emp values(103,"Priya",30000);

select * from emp;

drop procedure if exists updateEmpSalary;

DELIMITER $$
CREATE PROCEDURE updateEmpSalary(IN id INT,IN incRate DECIMAL(4,2))
BEGIN
UPDATE emp SET salary = salary*(1+incRate)
   WHERE emp_id=id;
END$$ 
DELIMITER ;

-- *****************************************************************************************

DROP PROCEDURE IF EXISTS countEmp;
DELIMITER $$
CREATE PROCEDURE countEmp (OUT count INT)
BEGIN
DECLARE id INT;
   DECLARE name VARCHAR(20);
   DECLARE salary DECIMAL(10,4);
   
DECLARE finished INT DEFAULT 0;
   DECLARE c CURSOR FOR SELECT * FROM emp;
   DECLARE CONTINUE HANDLER FOR NOT FOUND
   BEGIN
 SET finished=1;
END;
SET count=0;
   OPEN c;
   l:LOOP
 FETCH c INTO id,name,salary;
       IF finished=1 THEN
  LEAVE l;
 END IF;
       SET count=count+1;
END LOOP;
   CLOSE c;
END$$
DELIMITER ;

CALL countEmp(@count);
select @count;

-- **********************************************************************

DROP PROCEDURE IF EXISTS incSalary;
DELIMITER $$
CREATE PROCEDURE incSalary (in id INT, in incRate int, out oldSal int, out newSal int )
BEGIN
  SELECT salary INTO oldSal FROM emp WHERE emp_id = id;
  UPDATE emp SET salary = salary * (1 + incRate) WHERE emp_id = id;
  SELECT salary INTO newSal FROM emp WHERE emp_id = id;
END$$


-- ************************************************************************
DROP PROCEDURE IF EXISTS incCounter;
DELIMITER $$
CREATE PROCEDURE incCounter(INOUT counter INT)
BEGIN
SET counter=counter+1;
END$$
DELIMITER ;


-- ********************************************************************************
select * from emp; 





