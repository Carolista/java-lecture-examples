/* PERFORM CRUD OPS ON DATA */

-- TODO: Write a query to display the first and last names of artists 
-- who have artwork in the Impressionist style
-- Return without duplicates, if any
SELECT DISTINCT first_name, last_name
FROM artist
INNER JOIN artwork ON artist.id = artwork.artist_id
WHERE artwork.style_id = (SELECT id FROM style WHERE style.style = "Impressionism");

-- TODO: Write a query to display the title, artist, and style of each artwork created in 1939
SELECT artwork.title, artist.first_name, artist.last_name, style.style
FROM artwork
INNER JOIN artist ON artwork.artist_id = artist.id
INNER JOIN style ON artwork.style_id = style.id
INNER JOIN artwork_details ON artwork.details_id = artwork_details.id
WHERE artwork_details.year_created = "1939";
   
-- TODO: Create exhibit record 
INSERT INTO exhibit(title)
VALUES("Renaissance and Baroque Masterpieces");

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

/* TODO: Write a script to handle table updates when putting works on exhibit */

-- Store the new exhibit_id in a variable, @exhibit
SET @exhibit=1;

-- Look up an artist_id by last_name and store it in a variable, @artist
SET @artist = (SELECT id FROM artist WHERE last_name = "da Vinci");

-- Set the exhibit_id for all artworks with the artist_id that is @artist
UPDATE artwork
SET exhibit_id=@exhibit
WHERE artist_id = @artist;

-- Put all artworks on display for the exhibit (set on_display to true)
UPDATE artwork
SET on_display=1
WHERE exhibit_id = @exhibit;

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

-- TODO: Change the @artist to another artist and re-run the addition of the exhibit_id for those artworks

-- TODO: Get total number of artworks assigned to @exhibit and return with exhibit title
SELECT exhibit.title, COUNT(*) 
FROM artwork INNER JOIN exhibit ON artwork.exhibit_id = exhibit.id
WHERE exhibit_id=@exhibit;

-- TODO: Write a query to return the exhibit title, artwork title, artist, year_created, and style of each artwork on display
-- Order by last name
SELECT exhibit.title, artwork.title, artist.first_name, artist.last_name, artwork_details.year_created, style.style
FROM artwork
INNER JOIN exhibit ON artwork.exhibit_id = exhibit.id
INNER JOIN artist ON artwork.artist_id = artist.id
INNER JOIN artwork_details ON artwork.details_id = artwork_details.id
INNER JOIN style ON artwork.style_id = style.id
WHERE artwork.on_display = 1
ORDER BY artist.last_name;