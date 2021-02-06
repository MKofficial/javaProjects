package my_projects;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 04/02/2021
 */
public class Partitions {

    private static int countPartitions(int object, int maxPartition) {
        if (object == 0) {
            return 1;
        }
        if (maxPartition == 0 || object <= 0) {
            return 0;
        }
        return countPartitions(object, maxPartition - 1) + countPartitions(object - maxPartition, maxPartition);
    }

    public static void main(String[] args) {
        System.out.println(countPartitions(9, 5));
    }
}
