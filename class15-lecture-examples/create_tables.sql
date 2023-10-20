/* CREATE TABLES & IMPORT DATA FROM CSV FILES */

-- TODO: Run query to create style table
-- TODO: Import records from styles.csv
CREATE TABLE style (
	id INT PRIMARY KEY AUTO_INCREMENT,
    style VARCHAR(50)
);

-- TODO: Run query to create artist table
-- TODO: Import records from artists.csv
CREATE TABLE artist (
	id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    country VARCHAR(20)
);

-- TODO: Run query to create exhibit table
CREATE TABLE exhibit (
	id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(80)
);

-- TODO: Designate foreign keys for artist, style, and exhibit
-- TODO: Run query to create artwork table
-- TODO: Import records from artworks.csv
CREATE TABLE artwork (
	id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50),
    details_id INT,
    artist_id INT,
    style_id INT,
    exhibit_id INT,
    on_display BOOLEAN,
	FOREIGN KEY (artist_id) REFERENCES artist(id),
    FOREIGN KEY (style_id) REFERENCES style(id),
    FOREIGN KEY (exhibit_id) REFERENCES exhibit(id)
);

-- TODO: Run query to create artwork_details table
-- TODO: Import records from details.csv
CREATE TABLE artwork_details (
	id INT PRIMARY KEY AUTO_INCREMENT,
    year_created VARCHAR(20),
    media VARCHAR(80)
);

