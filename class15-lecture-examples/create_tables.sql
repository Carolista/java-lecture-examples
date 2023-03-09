-- CREATE STYLE TABLE 
-- TODO: Run query
-- TODO: Import records from styles.csv
CREATE TABLE style(
	id INT PRIMARY KEY AUTO_INCREMENT,
    style VARCHAR(50)
);

-- CREATE ARTIST TABLE
-- TODO: Run query
-- TODO: Import records from artists.csv
CREATE TABLE artist(
	id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    country VARCHAR(20)
);

-- CREATE EXHIBIT TABLE
-- TODO: Run query
CREATE TABLE exhibit(
	id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(80)
);

-- CREATE ARTWORK TABLE 
-- TODO: Designate foreign keys for artist, style, and exhibit
-- TODO: Run query
-- TODO: Import records from artworks.csv
CREATE TABLE artwork(
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

-- CREATE ARTWORK_DETAILS TABLE
-- TODO: Run query
-- TODO: Import records from details.csv
CREATE TABLE artwork_details(
	id INT PRIMARY KEY AUTO_INCREMENT,
    year_created VARCHAR(20),
    media VARCHAR(80)
);

