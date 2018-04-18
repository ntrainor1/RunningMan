# Running Man

## Skill Distillery - Week 2

### Project Description

This program is an interactive game in which the player assumes the role of a track runner who must balance between winning the race and not losing energy.

### Project Operation

This program begins by explaining to the player that they have 10 miles to run and 100 health points that will be deducted each time they choose to run. The player decides between running (by inputting the capital letter "Y") and resting (by inputting the capital letter "N"). Several checks are put in place so that if the player inputs an invalid value, they are returned to the original query until they put in a valid input (i.e. "Y" or "N").

Running deducts a random amount of health points between 20 and 39 points and a random amount of distance between 2 and 5 miles, leaving open the possibility of running out of health before reaching the finish line without taking a rest.

Resting allows the player to regain 10 points of health, but they lose their leading position by one. If they fall to fourth place, they have no more rests and must complete the race. Messages appear throughout the program informing the player of their health, position, distance remaining, and whether or not they win or lose the game.

### Lessons Learned

- nextLine() allows for different inputs (numerical, character, or multiple character) preventing any runtime errors from the Scanner.
