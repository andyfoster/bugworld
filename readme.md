# Andy's Bug World


## Tasks

- [x] Task 1: Create two objects of class Bug using each constructor.

- [x] Task 2: Create a new method that asks the user to manually input values for the attributes (using a Scanner and System.in).

- [x] Task 3: Using an ArrayList, store 3 different bugs.

- [x] Task 4: Create a "move" method in Bug that can move the bug in one of the the four directions on a compass (N, S, E, W). At this point there is no concept of the size of the world, so it is ok to be in position x=-1 and y=-1.

- [x] Task 5: Create a test where one bug moves 100 times in random directions (using Math.random()).

## Bug World 2

- [x] Create a class World that stores an unspecified number of bugs in a 2D world. The bugs must be stored in an ArrayList. The world must have attributes height and width that denote the size of the world.

- [x] Create appropriate constructors for the world that all iniialise a world with bugs in positions that are inside the world's height and width.

- [ ] Create a drawWorld method. Use the symbol of each bug to show where the bug is in the world. Print the world as text in the format below:

```
|-----------------------------|
|       h      c    h         |
|                c            |
|          f    c             |
|                             |
|               hc      f     |
|  f                          |
|-----------------------------| 
```

- [ ] Create an updateWorld method that randomly moves (or doesn’t move) each bug in the world. Bugs should not be allowed to move outside the world. Remember to use the move method of bug and not to manipulate x and y directly.
Create a class Plant. Plants can grow, so each plant has a numeric value 0-9 of their size. Store a number of plants in another ArrayList within World. Change the drawWorld method so it includes plants.

```
|-----------------------------|
|       h      c    h         |
|            9    c           |
|   4      f    c             |
|                  2          |
|      0        hc      f     |
|  f                          |
|-----------------------------|  
```

Figure 2: Example text-only visualisation of the 2D map with plants

- [ ] Create a class Obstacle. Obstacles are in the way of the bugs, i.e. they cannot walk over them or eat them.




## Later (we haven't covered this yet!)

- Using inheritance create 3 different types of bugs that inherit their behaviours from Bug. At this point the only difference between the different types should be their default species and symbol.

As part of this exercise make sure you understand:

- the difference between objects and classes
- inheritance
- different levels of access modifiers (private and public that we've seen, and "protected" that is visible through the inheritance hierarchy)

