# Spring Boot & JPA - examples of table inheritance

Inheritance in JPA
* @MappedSuperclass
* @Inheritance
  - SINGLE_TABLE
  - TABLE_PER_CLASS
  - JOINED

Below I'll demonstrate what are differences between them.


TODO
##### @MappedSuperclass

Insert
```sql
 insert 
    into
        mammal_mapped_superclass
        (id, age, name, living_environment) 
    values
        (null, ?, ?, ?)
```

Select
```sql
    select
        mammalmapp0_.id as id1_7_0_,
        mammalmapp0_.age as age2_7_0_,
        mammalmapp0_.name as name3_7_0_,
        mammalmapp0_.living_environment as living_e4_7_0_ 
    from
        mammal_mapped_superclass mammalmapp0_ 
    where
        mammalmapp0_.id=?
```

##### @Inheritance - SINGLE_TABLE

Insert
```sql
insert 
    into
        animal_single_table
        (age, name, living_environment, dtype, id) 
    values
        (?, ?, ?, 'MM', ?)
```

Select
```sql
select
        mammalsing0_.id as id2_1_0_,
        mammalsing0_.age as age3_1_0_,
        mammalsing0_.name as name4_1_0_,
        mammalsing0_.living_environment as living_e7_1_0_ 
    from
        animal_single_table mammalsing0_ 
    where
        mammalsing0_.id=? 
        and mammalsing0_.dtype='MM'
```
##### @Inheritance - TABLE_PER_CLASS

Insert
```sql
insert 
    into
        mammal_table_per_class
        (age, name, living_environment, id) 
    values
        (?, ?, ?, ?)
```

Select
```sql
 select
         mammaltabl0_.id as id1_2_0_,
         mammaltabl0_.age as age2_2_0_,
         mammaltabl0_.name as name3_2_0_,
         mammaltabl0_.living_environment as living_e1_8_0_ 
     from
         mammal_table_per_class mammaltabl0_ 
     where
         mammaltabl0_.id=?
```

##### @Inheritance - JOINED

Insert
```sql
insert 
    into
        animal_joined
        (id, age, name) 
    values
        (null, ?, ?)
insert 
    into
        mammal_joined
        (living_environment, id) 
    values
        (?, ?)
```

Select
```sql
select
        mammaljoin0_.id as id1_0_0_,
        mammaljoin0_1_.age as age2_0_0_,
        mammaljoin0_1_.name as name3_0_0_,
        mammaljoin0_.living_environment as living_e1_6_0_ 
    from
        mammal_joined mammaljoin0_ 
    inner join
        animal_joined mammaljoin0_1_ 
            on mammaljoin0_.id=mammaljoin0_1_.id 
    where
        mammaljoin0_.id=?
```