-- Create a new table, artist, with an artist_id, name, and style
-- Add AUTO_INCREMENT keyword for artist_id
CREATE TABLE artist (
	artist_id INT PRIMARY KEY AUTO_INCREMENT,
	full_name VARCHAR(50),
	nationality VARCHAR(20)
);

-- Add records for van Gogh, da Vinci, Vermeer, Dalí and Monet (ids will auto-generate)
INSERT INTO artist (full_name, nationality)
VALUES ("Vincent van Gogh", "Dutch"),
("Leonardo da Vinci", "Italian"),
("Johannes Vermeer", "Dutch"),
("Salvador Dalí", "Spanish"),
("Claude Monet", "French");

-- Select an inner join on the artwork table using the artists' names 
SELECT artist
FROM artwork
INNER JOIN artist ON artwork.artist = artist.full_name;

-- Run the previous query but eliminate duplicates 
SELECT DISTINCT artist
FROM artwork
INNER JOIN artist ON artwork.artist = artist.full_name;

-- List all artwork titles and artists and add nationalities from artist table using a left inner join
SELECT DISTINCT artwork.title, artwork.artist, artist.nationality
FROM artwork
LEFT JOIN artist ON artwork.artist = artist.full_name;

-- List all artwork titles and styles and add full_name and nationality from artist table using a right inner join
SELECT DISTINCT artwork.title, artwork.style, artist.full_name, artist.nationality
FROM artwork
RIGHT JOIN artist ON artwork.artist = artist.full_name;

-- List all records using a full outer join of both tables
SELECT DISTINCT * FROM artwork LEFT JOIN artist ON artwork.artist = artist.full_name
UNION
SELECT DISTINCT * FROM artwork RIGHT JOIN artist ON artwork.artist = artist.full_name;
