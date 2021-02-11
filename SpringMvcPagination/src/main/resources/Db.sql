--
-- Create database springmvcpagination
--

CREATE DATABASE springmvcpagination;

--
-- Table structure for table employee_tbl
--

CREATE TABLE Employee_tbl (
  EMPLOYEE_ID int(11) NOT NULL AUTO_INCREMENT,
  EMPLOYEE_FULLNAME varchar(100) NOT NULL,
  EMPLOYEE_DESIGNATION varchar(100) NOT NULL,
  EMPLOYEE_SALARY decimal(10,2) NOT NULL,
  PRIMARY KEY (EMPLOYEE_ID)
);

--
-- Dumping data for table employee_tbl
--

INSERT INTO Employee_tbl (EMPLOYEE_ID, EMPLOYEE_FULLNAME, EMPLOYEE_DESIGNATION, EMPLOYEE_SALARY) VALUES
(1, 'Daniel', 'Technical Lead', '1300000.00'),
(2, 'Charlotte', 'Technical Lead', '1100000.00'),
(3, 'Rakesh', 'Software Developer', '550000.00'),
(4, 'Jane', 'Senior Software Developer', '970000.00'),
(5, 'Smith', 'UI Developer', '1000000.00'),
(6, 'Bob', 'Associate HR', '80000.00'),
(7, 'Rahul', 'Senior Software Developer', '90000.00'),
(8, 'Rakesh', 'UI Developer', '25000.00'),
(9, 'Udit', 'Junior Developer', '35000.00'),
(10, 'Jai', 'Technical Lead', '45000.00'),
(11, 'Nikhil', 'UI Developer', '55000.00'),
(12, 'Somesh', 'Senior Software Developer', '65000.00'),
(13, 'Rajesh', 'Manager', '75000.00'),
(14, 'Ankit', 'UI Developer', '85000.00'),
(15, 'Ratan', 'Technical Lead', '95000.00');

--
-- Selecting data from table employee_tbl
--

SELECT * FROM Employee_tbl;