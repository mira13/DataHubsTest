DROP TABLE IF EXISTS item;
CREATE TABLE item (
  id INT SERIAL  PRIMARY KEY,
  sku INT NOT NULL,
  name VARCHAR(250) NOT NULL,
  count INT NOT NULL
);

INSERT INTO item (sku, name, count) VALUES (23, 'Pencil', 365);
INSERT INTO item (sku, name, count) VALUES (543, 'Pen', 664);
INSERT INTO item (sku, name, count) VALUES (457, 'Sticky notes', 738);
INSERT INTO item (sku, name, count) VALUES (233, 'Tablet', 466);
INSERT INTO item (sku, name, count) VALUES (43, 'Paper', 59);
INSERT INTO item (sku, name, count) VALUES (22, 'Calendar', 345);
INSERT INTO item (sku, name, count) VALUES (1, 'Chair', 37);
INSERT INTO item (sku, name, count) VALUES (654, 'Wipes', 776);
INSERT INTO item (sku, name, count) VALUES (653, 'Pen holder', 34);
INSERT INTO item (sku, name, count) VALUES (124, 'Eraiser', 465);