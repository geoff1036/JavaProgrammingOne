package Chapter8;
/**
 * Program searches an array for information on a specific employee and displays it
 * 
 * @author Geoffrey Fuller
 */
public class C8_1 {
    /**
    * Main Method
    *
    * @param args arguments from command line prompt
    */
    static final int employees = 0;
    static final int hours = 1;
    public static void main(String[] args)
    {
          int[][] employeeHours = new int[][] 
{
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};


        int[][] totalHoursChart = calcTotalHours(employeeHours);

        descendingSort(totalHoursChart);

        for (int i = 0; i < totalHoursChart.length; i++)
 {

            System.out.println("Employee #"+ totalHoursChart[i][employees] + " total hours = " +
                            totalHoursChart[i][hours]);
        }

    }
/**
 * Method Calculates total hours and puts them in a chart
 * @param m placeholder value representing the array
 * @return returns a chart of total hours
 */
    public static int[][] calcTotalHours(int[][] m)
 {

        int[][] totalHoursChart = new int[m.length][2];

        for (int i = 0; i < m.length; i++) {
            totalHoursChart[i][hours] = getRowTotalHour(m, i);
            totalHoursChart[i][employees] = i;
        }


        return totalHoursChart;
    }
/**
 * Method gets the total hours of one row
 * @param m placeholder value representing the array
 * @param row specifies which row to total
 * @return returns a totaled row
 */
    public static int getRowTotalHour(int[][] m, int row) 
{

        int total = 0;
        for (int column = 0; column < m[row].length; column++) 
{
            total += m[row][column];
        }
        return total;
    }
/**
 * Method sorts the array in descending order
 * @param m placeholder value representing the array
 */
    public static void descendingSort(int[][] m) 
{

        for (int i = 0; i < m.length - 1; i++) 
{

            int currentIndex = i;
            int currentMax = m[i][hours];
            int empNum = m[i][employees];
            for (int k = i + 1; k < m.length; k++) 
{

                if (currentMax < m[k][hours]) 
{
                    currentMax = m[k][hours];
                    currentIndex = k;
                    empNum = m[k][employees];
                }
            }

            if (currentIndex != i) 
{
                m[currentIndex][employees] = m[i][employees];
                m[currentIndex][hours] = m[i][hours];
                m[i][employees] = empNum;
                m[i][hours] = currentMax;
            }

        }
    }

}
