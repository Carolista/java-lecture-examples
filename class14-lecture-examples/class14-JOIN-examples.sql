-- Create a new table, artist, with an artist_id, name, and style
-- Add AUTO_INCREMENT keyword for artist_id
CREATE TABLE artist (
	artist_id INT PRIMARY KEY AUTO_INCREMENT,
	full_name VARCHAR(50),
	style VARCHAR(25)
);

-- Add records for van Gogh, da Vinci, Vermeer, and Monet (ids will auto-generate)
INSERT INTO artist (full_name, style)
VALUES ("Vincent van Gogh", "Pointillism"),
("Leonardo da Vinci", "Renaissance"),
("Johannes Vermeer", "Baroque"),
("Claude Monet", "Impressionism");

-- Select an inner join on the artwork table using the artists' names 
SELECT artist
FROM artwork
INNER JOIN artist ON artwork.artist = artist.full_name;

-- Run the previous query but eliminate duplicates 
SELECT DISTINCT artist
FROM artwork
INNER JOIN artist ON artwork.artist = artist.full_name;

-- List all artwork titles and artists and add style using a left inner join
SELECT DISTINCT artwork.title, artwork.artist, artist.style
FROM artwork
LEFT JOIN artist ON artwork.artist = artist.full_name;

# List all artwork titles and artists and add full_name and style using a right inner join
SELECT DISTINCT artwork.title, artwork.artist, artist.full_name, artist.style
FROM artwork
RIGHT JOIN artist ON artwork.artist = artist.full_name;

-- List all records using a full outer join of both tables
SELECT DISTINCT * FROM artwork LEFT JOIN artist ON artwork.artist = artist.full_name
UNION
SELECT DISTINCT * FROM artwork RIGHT JOIN artist ON artwork.artist = artist.full_name;
