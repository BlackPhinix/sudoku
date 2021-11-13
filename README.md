# sudoku
java sudoku game source code
The most important part of this application is in the Game class, which includes the following functionality:

Generate a new solution;
Generate a new game from a solution;
Keep track of user input;
Check user input against generated solution;
Keep track of selected number;
Keep track of help is on or off.
Because the Game class extends Observable, it can and does notify observers when certain changes have been performed. This particular application contains two observers, ButtonPanel and SudokuPanel. When the Game class executes setChanged() followed by notifyObservers(...), the observers will execute their update(...) method.

Besides the Game class, the model consists of an enumeration called UpdateAction which will tell observers what kind of update has taken place.

Generate Solution
Before we can start generating a game, we must first generate a solution. This is achieved by the method below, which needs to be called by the user as generateSudoku(new int[9][9], 0). The following steps are taken:

Check if a solution is found.
Found -> solution is returned.
Not found -> continue.
X (of current field) is found by finding the remainder of the division of the current index by the count of fields in a row using the modulo operation.
Y (of current field) is found by dividing the current index by the count of fields in a row.
An ArrayList is filled with the numbers 1 to 9 and shuffled. Shuffling is important because otherwise you always get the same solution.
As long as there are numbers in the ArrayList, the following will be executed:
The next possible number is obtained by the method getNextPossibleNumber(int[][], int, int, List<Integer>), which will be explained later on. If there's no next possible number (return value of -1), null is returned.
Found number is placed on the current location.
The method is recursively called with an increase of the index, and the returning value is stored in a variable.
If this variable is not null, it is returned; otherwise, the current location is put back to 0 (meaning the field is a blank).
null is returned. This part will never be reached, hopefully.
