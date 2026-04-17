import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class MineSweeper {

  // Since a MineTile extends a JButton, it can do anything a JButton can do
  // This MineTile class is private and only used in MineSweeper because it
  // really has no other use outside of the game
  private class MineTile extends JButton {
    int r;
    int c;

    public MineTile(int r, int c) {
      this.r = r;
      this.c = c;
    }
  }

  final int tileSize = 70;
  private int numRows;
  private int numCols;
  private int boardWidth;
  private int boardHeight;
  private int mineCount;
  private MineTile[][] board;
  private int tilesClicked; // goal is to click all tiles except the ones containing mines
  private boolean gameOver;

  ArrayList<MineTile> mineList;

  JFrame frame = new JFrame("Minesweeper");
  JLabel textLabel = new JLabel();
  JPanel textPanel = new JPanel();
  JPanel boardPanel = new JPanel();

  /** generic 8x8 game with 10 mines */
  public MineSweeper() {
    numRows = 8;
    numCols = numRows;
    boardWidth = numCols * tileSize;
    boardHeight = numCols * tileSize;
    mineCount = 10;
    board = new MineTile[numRows][numCols];
    tilesClicked = 0;
    gameOver = false;
    mineList = new ArrayList<MineTile>();
    // placeMines();
  }

  /** generic 8x8 game with 10 mines */
  public MineSweeper(int w, int h, int numMines) {
    numRows = h;
    numCols = w;
    boardWidth = numCols * tileSize;
    boardHeight = numCols * tileSize;
    mineCount = numMines;
    board = new MineTile[numRows][numCols];
    tilesClicked = 0;
    gameOver = false;
    mineList = new ArrayList<MineTile>();
    // placeMines();
  }

  public void play() {
    // frame.setVisible(true);
    frame.setSize(boardWidth, boardHeight);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    textLabel.setFont(new Font("Arial", Font.BOLD, 25));
    textLabel.setHorizontalAlignment(JLabel.CENTER);
    textLabel.setText("Minesweeper: " + Integer.toString(mineCount));
    textLabel.setOpaque(true);

    textPanel.setLayout(new BorderLayout());
    textPanel.add(textLabel);
    frame.add(textPanel, BorderLayout.NORTH);

    boardPanel.setLayout(new GridLayout(numRows, numCols)); // 8x8
    // boardPanel.setBackground(Color.green);
    frame.add(boardPanel);

    for (int r = 0; r < numRows; r++) {
      for (int c = 0; c < numCols; c++) {
        MineTile tile = new MineTile(r, c);
        board[r][c] = tile;

        tile.setFocusable(false);
        tile.setMargin(new Insets(0, 0, 0, 0));
        tile.setFont(new Font("Arial Unicode MS", Font.PLAIN, tileSize / 2));
        // tile.setText("💣");
        tile.addMouseListener(new MouseAdapter() {
          @Override
          public void mousePressed(MouseEvent e) {
            if (gameOver) {
              return;
            }
            MineTile tile = (MineTile) e.getSource();

            // left click
            if (e.getButton() == MouseEvent.BUTTON1) {
              if (tile.getText() == "") {
                if (mineList.contains(tile)) {
                  revealMines();
                } else {
                  checkMine(tile.r, tile.c);
                }
              }
            }
            // right click
            else if (e.getButton() == MouseEvent.BUTTON3) {
              if (tile.getText() == "" && tile.isEnabled()) {
                tile.setText("🚩");
              } else if (tile.getText() == "🚩") {
                tile.setText("");
              }
            }
          }
        });

        boardPanel.add(tile);

      }
    }

    frame.setVisible(true);

    placeMines();
  }

  /*
   * Place the mines in random locations on the game board.
   * Ensure that the appropriate number of mines are placed and that it
   * does not place more than one mine on a cell in the game board.
   */
  public void placeMines() {
    mineList = new ArrayList<MineTile>();

    int mineLeft = mineCount;
    while (mineLeft > 0) {
      int r = (int) (Math.random() * numRows); // 0-7
      int c = (int) (Math.random() * numCols);

      MineTile tile = board[r][c];
      if (!mineList.contains(tile)) {
        mineList.add(tile);
        mineLeft -= 1;
      }
    }
  }

  /*
   * Game Over (loser) method. This changes reveals the location of all mines
   * and changes the Label of the JFrame to GameOver
   */
  public void revealMines() {
    for (int i = 0; i < mineList.size(); i++) {
      MineTile tile = mineList.get(i);
      tile.setText("💣");
    }

    gameOver = true;
    textLabel.setText("Game Over!");
  }

  /**
   * precondition
   * 
   * @param r must be between 0 and number of rows
   * @param c must be between 0 and number of cols
   */
  private void checkMine(int r, int c) {
    // Check for invalid params if they are otu of bounds return to stop method

    // create a new tile at the row and col
    MineTile tile = board[r][c];

    // if the tile is not enabled (already clicked) return to stop method
    if (!tile.isEnabled()) {
      return;
    }

    tile.setEnabled(false);
    tilesClicked += 1;

    int minesFound = 0;

    // Count the mines adjacent to where the player clicked (r,c)
    // top left
    // top
    // top right

    // left and right
    // left
    // right

    // bottom 3
    // bottom left
    // bottom
    // bottom right

    if (minesFound > 0) {
      tile.setText(Integer.toString(minesFound));
    } else {
      tile.setText("");

      // Check for mines in the adjacent cells
      // top left
      // top
      // top right

      // left and right
      // left
      // right

      // bottom 3
      // bottom left
      // bottom
      // bottom right
    }

    if (tilesClicked == numRows * numCols - mineList.size()) {
      gameOver = true;
      textLabel.setText("Mines Cleared!");
    }
  }

  /**
   * 
   * @param r the row number
   * @param c the col number
   * @return 1 if there is a mine located at r, c
   */
  int countMine(int r, int c) {

    // check for invalid r and c, if invalid return 0
    if (/* valid r and c */) {
      return 0;
    }

    // if list of mines has this board location return 1 
    if (/* todo */) {
      return 1;
    }
    return 0;
  }

}
