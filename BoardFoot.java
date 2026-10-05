import java.util.Scanner;

/**
 * Calculates the length of a board needed to make 1 board foot.
 * @author  Shem Irekpita
 * @version 1.0
 * @since   2026-05-10
 */
public final class BoardFoot {

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private BoardFoot() {
    }

    /**
     * Calculates the required length for 1 board foot.
     *
     * @param width  the width in inches
     * @param height the height in inches
     * @return the required length in inches
     */
    public static double calculateBoardFoot(final double width,
            final double height) {
        final double boardFootVolume = 144.0;
        return boardFootVolume / (width * height);
    }

    /**
     * Main entry point for user interaction and output.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your Width: ");
            final double width = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter your Height: ");
            final double height = Double.parseDouble(scanner.nextLine());

            if (width <= 0 || height <= 0) {
                System.out.println("Enter a valid Number greater than 0");
            } else {
                final double length = calculateBoardFoot(width, height);
                System.out.printf(
                    "To get 1 board foot (144 in³), "
                    + "the length must be: %.2f inches%n", length
                );
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. "
                    + "Please enter valid numerical values.");
        } finally {
            scanner.close();
        }
    }
}
