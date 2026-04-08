public class Main {
  public static void main(String[] args) {
    SeatingChart math = new SeatingChart();

    math.addStudent("Alan", 0, 0);
    math.addStudent("Chuck", 0, 2);
    math.addStudent("Bob", 1, 3);

    math.addStudent("David", 2, 1);
    math.addStudent("Ethan", 3, 5);
    math.addStudent("Fran", 4, 2);

    System.out.println(math);

    math.randomize();

    System.out.println(math);

  }

}
