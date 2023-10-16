-- Create the artwork table
CREATE TABLE artwork (
    artwork_id INT PRIMARY KEY,
    title VARCHAR(50),
    artist VARCHAR(50),
    style VARCHAR(20)
);

-- Add a record with all values
INSERT INTO artwork
VALUES (1, "Mona Lisa", "Leonardo da Vinci", "Renaissance");

-- Add a record with partial values
INSERT INTO artwork(artwork_id, title, artist)
VALUES (2, "Girl with a Pearl Earring", "Johannes Vermeer");

-- Add 2 more records at the same time
INSERT INTO artwork
VALUES (3, "The Starry Night", "Vincent van Gogh", "Post-Impressionism"),
(4, "The Kiss", "Gustav Klimt", "Art Nouveau");

-- Add a new column, on_display, to the existing table
ALTER TABLE artwork
ADD on_display BOOLEAN; 

-- Update the third record to indicate that it is on display
UPDATE artwork
SET on_display=1
WHERE artwork_id=3;

-- Update the second record to assign the style and indicate that it is on display
UPDATE artwork
SET style="Baroque", on_display=1
WHERE artwork_id=2;

-- View all records in the table
SELECT * FROM artwork;

-- View only artwork currently on display
SELECT * FROM artwork
WHERE on_display=1;

-- Add a few more records
INSERT INTO artwork
VALUES (5, "Vase with Twelve Sunflowers", "Vincent van Gogh", "Post-Impressionism", 0),
(6, "The Church at Auvers", "Vincent van Gogh", "Post-Impressionism", 0),
(7, "Still Life with a Curtain", "Paul Cézanne", "Post-Impressionism", 1),
(8, "The Milkmaid", "Johannes Vermeer", "Baroque", 0),
(9, "The Last Supper", "Leonardo da Vinci", "Renaissance", 1);

-- View titles, artist, and styles of all post-impressionist artwork
SELECT title, artist, style 
FROM artwork
WHERE style="Post-Impressionism";

-- Run a similar query as the last but only those NOT on display
SELECT title, artist, style
FROM artwork
WHERE (style="Post-Impressionism") AND (on_display=0);

-- View titles and artist if artwork is by either da Vinci or Vermeer
SELECT title, artist 
FROM artwork
WHERE (artist="Leonardo da Vinci") OR (artist="Johannes Vermeer");

-- View all records again, but order by style, ascending
SELECT * FROM artwork
ORDER BY style ASC;

-- Delete "The Church at Auvers" record (use ID number)
DELETE FROM artwork
WHERE artwork_id=6;

-- View all records
SELECT * FROM artwork;

# comment one line
-- comment one line

/* 
  comment
  multiple
  lines
*/

