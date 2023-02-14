INSERT INTO PATIENT_MODEL VALUES  
(101, 'Steve', 'Emily'),
(201, 'John', 'Jessica'),
(301, 'Emily', 'Emily'),
(401, 'Michael', 'David'),
(501, 'Jessica', 'John'),
(601, 'David', 'David'),
(701, 'Ashley', 'Michael'),
(801, 'Matthew', 'Matthew');

INSERT INTO SERVICES_MODEL VALUES  
(101, 'OPD', 9000),
(201, 'XRAY', 900),
(301, 'Emergency room services.', 15000),
(401, 'Short-term hospitalization.', 20000),
(501, 'X-ray/radiology services.', 5000),
(601, 'Blood services.', 6000),
(701, 'Laboratory services.', 2500);


INSERT INTO PATIENT_MODEL_SERVICES values 
(101, 701),
(201, 701),
(101, 701),
(301, 301),
(401, 201),
(101, 501),
(601, 701),
(401, 401),
(201, 301);