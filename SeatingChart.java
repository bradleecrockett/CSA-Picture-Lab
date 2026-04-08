public class SeatingChart {

  private String[][] seats;
  private int numStudents;

  public SeatingChart() {
    seats = new String[5][6];
    numStudents = 0;
  }

  public void addStudent(String name, int row, int col) {
    seats[row][col] = name;
    numStudents++;
  }

  // swap method
  public void swap(int r, int c, int r2, int c2) {
    String temp = seats[r][c];
    seats[r][c] = seats[r2][c2];
    seats[r2][c2] = temp;
  }

  // Randomize method
  public void randomize() {
    for (int r = 0; r < seats.length; r++) {
      for (int c = 0; c < seats[r].length; c++) {
        int newRow = (int) (Math.random() * seats.length);
        int newCol = (int) (Math.random() * seats[0].length);
        swap(r, c, newRow, newCol);
      }
    }
  }

  /**
   * 
   * @param row row starting at 0
   * @param col # starting at 0
   * @return teh name of the student in that row and col
   */
  public String getName(int row, int col) {
    return seats[row][col];
  }

  public String toString() {
    String output = "";
    // Use loop(s) to build the string representing the Seating chart
    for (int r = 0; r < seats.length; r++) {
      for (int c = 0; c < seats[r].length; c++) {
        if (seats[r][c] == null) {
          output += "\t|";
        } else {
          output += seats[r][c] + "\t|";
        }
      }
      output += "\n";
    }

    return output;
  }

}
