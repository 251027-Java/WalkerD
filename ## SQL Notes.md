## SQL Notes

1. Candidate Key - anything that COULD be a unique identifier for an entry
2. Primary Key - the unique identifier for each entry; must be unique and not null
3. Foreign Key - a column or set of columns in one table that references the primary key in another table, establishing a relationship between the two tables
4. Composite Key - a combination of 2 or more candidate keys

4. First Normal Form - every table has a primary key (and is atomic); requires each column to contain atomic values
5. Second Normal Form - the WHOLE key; 2NF eliminates partial dependencies on a primary key
6. Third Normal Form - nothing but the key; 3NF removes transitive dependencies among non-key attributes.

