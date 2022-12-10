import org.example.GameBoard;
import org.example.Snake;

public class Game {
    private Snake snake;
    private GameBoard board;
    private int direction;
    private boolean gameOver;

    public Game(Snake snake, GameBoard board) {
        this.snake = snake;
        this.board = board;
    }
    public Snake getSnake() {
        return snake;
    }
    public void setSnake(Snake snake) {
        this.snake = snake;
    }
    public GameBoard getBoard() {
        return board;
    }
    public void setBoard (GameBoard board) {
        this.board = board;
    }
    public boolean isGameOver() {
        return gameOver;
    }
    public int getDirection () {
        return direction;
    }
    public void setDirection (int direction) {
        this.direction = direction;
    }
}


