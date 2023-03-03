-- Create the artwork table
CREATE TABLE artwork (
	artwork_id INT PRIMARY KEY,
    title VARCHAR(50),
    artist VARCHAR(50),
    period VARCHAR(20)
);

-- Add a record with all values
INSERT INTO artwork
VALUES (1, "Mona Lisa", "Leonardo da Vinci", "1503-1506");

-- Add a record with partial values
INSERT INTO artwork(artwork_id, title, artist)
VALUES (2, "Girl with a Pearl Earring", "Johannes Vermeer");

-- Add 2 more records at the same time
INSERT INTO artwork
VALUES (3, "The Starry Night", "Vincent van Gogh", 1889),
(4, "The Kiss", "Gustav Klimt", 1908);

-- Add a new column, on_display, to the existing table
ALTER TABLE artwork
ADD on_display BOOLEAN; 

-- Update the fourth record to indicate that it is on display
UPDATE artwork
SET on_display=1
WHERE artwork_id=4;

-- Update the second record to assign the period and indicate that it is on display
UPDATE artwork
SET period="1665", on_display=1
WHERE artwork_id=2;

-- View all records in the table
SELECT * FROM artwork;

-- View only artwork currently on display
SELECT * FROM artwork
WHERE on_display=1;

-- Add a few more records for some of the same artists
INSERT INTO artwork
VALUES (5, "Vase with Twelve Sunflowers", "Vincent van Gogh", 1888, 0),
(6, "The Church at Auvere", "Vincent van Gogh", 1890, 0),
(7, "The Bedroom", "Vincent van Gogh", 1889, 0),
(8, "The Milkmaid", "Johannes Vermeer", 1658, 0),
(9, "The Last Supper", "Leonardo da Vinci", 1498, 0);

-- View titles, artist, and periods of all artwork by van Gogh
SELECT title, artist, period 
FROM artwork
WHERE artist="Vincent van Gogh";

-- Run a similar query as the last but limit it to 1889
SELECT title, artist, period 
FROM artwork
WHERE (artist="Vincent van Gogh") AND (period="1889");

-- View titles and artist if artwork is by either da Vinci or Vermeer
SELECT title, artist 
FROM artwork
WHERE (artist="Leonardo da Vinci") OR (artist="Johannes Vermeer");

-- View all records again, but order by period, ascending
SELECT * FROM artwork
ORDER BY period ASC;

-- Delete "The Bedroom" record (use ID number)
DELETE FROM artwork
WHERE artwork_id=7;

-- View all records
SELECT * FROM artwork;

# comment one line
-- comment one line

/* 
  comment
  multiple
  lines
*/

