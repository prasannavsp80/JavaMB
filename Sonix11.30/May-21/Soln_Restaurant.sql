-- Apply inner join in Restaurant and Menu Tables

select R.RestaurantID, R.RestaurantName, Rating,
M.MenuId,ItemName,Price
from Restaurant R INNER JOIN Menu M
ON R.RestaurantID = M.RestaurantID;

-- Apply Left Outer Join in the given tables

select R.RestaurantID, R.RestaurantName, Rating,
M.MenuId,ItemName,Price
from Restaurant R LEFT JOIN Menu M
ON R.RestaurantID = M.RestaurantID;

-- Display Restaurant Details who don't have any menu items 
-- RestaurantId there in Restaurant but not in Menu Table 

select * from restaurant where restaurantID <> ALL(
select distinct RestaurantID from Menu);

-- Display Matching Records From Restaurant and Menu
-- RestaurantId exists in both tables 

select * from Restaurant Where RestaurantID = ANY
(select distinct RestaurantId from Menu);
