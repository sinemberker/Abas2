public class AveragePrice {
    public static void main(String[] args) {
        double[][] data = {
            {1000, 2000, 12, 100.51},
            {1000, 2001, 31, 200},
            {1000, 2002, 22, 150.86},
            {1000, 2003, 41, 250},
            {1000, 2004, 55, 244},
            {1001, 2001, 88, 44.531},
            {1001, 2002, 121, 88.11},
            {1001, 2004, 74, 211},
            {1001, 2002, 14, 88.11},
            {1002, 2003, 2, 12.1},
            {1002, 2004, 3, 22.3},
            {1002, 2003, 8, 12.1},
            {1002, 2002, 16, 94},
            {1002, 2005, 9, 44.1},
            {1002, 2006, 19, 90}
        };

        double totalPrice = 0;
        int count = 0;
        for (double[] row : data) {
            totalPrice += row[3];
            count++;
        }

        double averagePrice = totalPrice / count;
        System.out.println("Ortalama Fiyat: " + averagePrice + " TL");
    }
}
