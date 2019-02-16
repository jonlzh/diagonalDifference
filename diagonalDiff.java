// Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int leftToRight = 0;
        int rightToLeft = 0;
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("lr" +arr[i][i]);
            leftToRight += arr[i][i];
        
        }
        System.out.println(leftToRight);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("rl" +arr[i][arr.length-1-i]);
            rightToLeft += arr[i][arr.length-1-i];
        
        }
        System.out.println(rightToLeft);
        return Math.abs(Math.abs(leftToRight)-Math.abs(rightToLeft));
    }
