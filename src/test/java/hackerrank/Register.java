package hackerrank;

import jdk.jshell.spi.ExecutionControl;

public interface Register {
    void addAttendance(int[] studentIds);

    void changeAttendance(int studentId, char symbol);

    void reduceRegister(int limit);

    void personalAttendance(int studentId);

    int maxAttendance();
}
