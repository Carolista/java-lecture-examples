/* PERFORM CRUD OPS ON DATA */

-- TODO: Write a query to display the first and last names of artists 
-- who have artwork in the Impressionist style
-- Return without duplicates, if any
SELECT DISTINCT first_name, last_name
FROM artist
INNER JOIN artwork ON artist.id = artwork.artist_id
WHERE artwork.style_id = (SELECT id FROM style WHERE style.title = "Impressionism");

-- TODO: Write a query to display the title, artist, and style of each artwork created in 1939
SELECT artwork.title, artist.first_name, artist.last_name, style.title
FROM artwork
INNER JOIN artist ON artwork.artist_id = artist.id
INNER JOIN style ON artwork.style_id = style.id
INNER JOIN artwork_details ON artwork.details_id = artwork_details.id
WHERE artwork_details.year_created = "1939";
   
-- TODO: Create an exhibit record 
INSERT INTO exhibit(title)
VALUES("Renaissance and Baroque Masterpieces");

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

/* TODO: Write a script to handle table updates when putting works on exhibit */

-- Create a variable for the exhibit id
SET @exhibit = 2;

-- Create a variable for the artist's last name
SET @artist_ln = "Kahlo";

-- Look up an artist_id by last_name and store it in a variable, @artist
SET @artist = (SELECT id FROM artist WHERE last_name = @artist_ln);

-- Set the exhibit_id for all artworks with the artist_id that is @artist
-- Also set on_display to true
UPDATE artwork
SET exhibit_id = @exhibit, on_display = 1
WHERE artist_id = @artist;

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

-- TODO: Change the @artist to another artist and re-run script for those artworks

-- TODO: Create another exhibit record, then run the script above for the new exhibit with 2 more artists
INSERT INTO exhibit(title)
VALUES("Iconic Women of Modern Art");

-- TODO: Get total number of artworks assigned to a exhibit and return along with exhibit title
SELECT exhibit.title, COUNT(*) 
FROM artwork INNER JOIN exhibit ON artwork.exhibit_id = exhibit.id
WHERE exhibit_id = 2;

-- TODO: Run it again for the second exhibit id

-- TODO: Write a query to get the totals for all exhibits
SELECT exhibit.title, COUNT(*) 
FROM artwork INNER JOIN exhibit ON artwork.exhibit_id = exhibit.id
GROUP BY exhibit.id;

-- TODO: Write a query to return the exhibit title, artwork title, artist, year_created, and style of each artwork on display
-- Order first by exhibit title and then by last name
SELECT exhibit.title, artwork.title, artist.first_name, artist.last_name, artwork_details.year_created, style.title
FROM artwork
INNER JOIN exhibit ON artwork.exhibit_id = exhibit.id
INNER JOIN artist ON artwork.artist_id = artist.id
INNER JOIN artwork_details ON artwork.details_id = artwork_details.id
INNER JOIN style ON artwork.style_id = style.id
WHERE artwork.on_display = 1
ORDER BY exhibit.title, artist.last_name;