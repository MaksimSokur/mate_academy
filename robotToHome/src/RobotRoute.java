import java.sql.Time;
import java.util.Timer;

public class RobotRoute {
    public static void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println("Current time - " + time + "(ms)");
        Robot robot = new Robot(Direction.LEFT, 3, 3);
        System.out.println(robot.toString());
        moveRobot(robot, 5, 6);
        System.out.println(robot.toString());
        System.out.println("Time for run and compile program - " + (System.currentTimeMillis() - time) + "(ms)");
    }
}
