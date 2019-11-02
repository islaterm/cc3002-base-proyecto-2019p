package view;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * Main class of the Alpaca Emblem game.
 *
 * @author Ignacio Slater Muño<
 * @version 3.0b3
 * @since 3.0
 */
public class AlpacaEmblem extends JFrame {

  /**
   * Creates the game's graphic interface
   */
  public AlpacaEmblem() {
    FieldGUI fieldGUI = new FieldGUI();
    add(fieldGUI);

    setTitle("Alpaca Emblem");

    final int OFFSET = 30;
    setSize(fieldGUI.getFieldWidth() + OFFSET, fieldGUI.getFieldHeight() + 2 * OFFSET);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }

  /**
   * Runs the game.
   *
   * @param args
   *     not used
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(AlpacaEmblem::run);
  }

  /**
   * Initiates the GUI and makes it visible
   */
  private static void run() {
    AlpacaEmblem game = new AlpacaEmblem();
    game.setVisible(true);
  }
}