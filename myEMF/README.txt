load data local infile 'c:\\Users\\Erik\\Desktop\\Hearthstone.csv' 
into table hearthstone.cards fields terminated by ',' enclosed by '"'
lines terminated by '\n'
(Name,Quality,Cost,Type,Attack,Health,Special)

