-- Step 1: Create Database
CREATE DATABASE IF NOT EXISTS bank_system;

-- Step 2: Use the Database
USE bank_system;

-- Step 3: Create Table
CREATE TABLE IF NOT EXISTS accounts (
    account_number VARCHAR(20) PRIMARY KEY,
    holder_name VARCHAR(100) NOT NULL,
    account_type ENUM('savings', 'current') NOT NULL,
    balance DECIMAL(12,2) NOT NULL DEFAULT 0.00,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Step 4: Insert 5 Sample Members
INSERT INTO accounts (account_number, holder_name, account_type, balance)
VALUES
('ACC1001', 'Shivansh Agrawal', 'savings', 5000.00),
('ACC1002', 'Rahul Verma', 'current', 10000.00),
('ACC1003', 'Priya Sharma', 'savings', 7500.00),
('ACC1004', 'Ananya Gupta', 'current', 12500.00),
('ACC1005', 'Karan Singh', 'savings', 3000.00);

-- Step 5: View All Accounts
SELECT * FROM accounts;
