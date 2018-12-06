# Graphql demo

# Running
1. Create MySql Schema :

CREATE SCHEMA IF NOT EXISTS demo_users CHARACTER SET = 'utf16';  
CREATE USER IF NOT EXISTS 'demo'@'%' IDENTIFIED BY 'logmein';  
GRANT ALL PRIVILEGES ON demo_users.* TO 'demo'@'%' IDENTIFIED by 'logmein';  

2. Run command to the project directory: gradle bootRun


