

CREATE TABLE IF NOT EXISTS `accounts` (
  `account_id` int AUTO_INCREMENT PRIMARY KEY,
  `customer_id` int NOT NULL,
  `account_number` varchar(20) NOT NULL UNIQUE,
  `account_type` varchar(30) NOT NULL,
  `branch_address` varchar(200) NOT NULL,
  `balance` decimal(19, 4) NOT NULL DEFAULT 0.0000,
  `version` int DEFAULT 0, -- Added for JPA Optimistic Locking
  `created_at` datetime NOT NULL, -- Changed to datetime for precision
  `created_by` varchar(20) NOT NULL,
  `updated_at` datetime DEFAULT NULL,
  `updated_by` varchar(20) DEFAULT NULL
);

-- Essential: Add an index for the foreign key reference
CREATE INDEX idx_customer_id ON accounts(customer_id);