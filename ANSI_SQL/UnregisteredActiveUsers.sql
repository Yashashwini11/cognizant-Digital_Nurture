SELECT u.*
FROM Users u
WHERE registration_date >= CURDATE() - INTERVAL 30 DAY
AND u.user_id NOT IN (
    SELECT DISTINCT user_id FROM Registrations
);
