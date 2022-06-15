import java.util.Scanner;

class Stock {
    private int numberOfStocks;
    private int numberOfShares;
    private int sharePrice;
    private String shareName;

    public Stock() {
    }

    public int getNumberOfStocks() {
        return numberOfStocks;
    }

    public void setNumberOfStocks(int numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }


    @Override
    public String toString() {
        return "Stock{" +
                "numberOfStocks=" + numberOfStocks +
                ", numberOfShares=" + numberOfShares +
                ", sharePrice=" + sharePrice +
                ", shareName='" + shareName + '\'' +
                '}';
    }
}

public class StockReport extends Stock {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Stock stock = new Stock();

    public static void main(String[] args) {
        System.out.println("Welcome to stock report");
        System.out.println("Enter number of stocks");
        stock.setNumberOfStocks(scanner.nextInt());
        float valueOfStock, totalValueOfStock;
        for (int i = 0; i < stock.getNumberOfStocks(); i++) {
            System.out.println(stockDetails());
            valueOfStock = stock.getNumberOfShares() / stock.getSharePrice();
            totalValueOfStock = stock.getNumberOfShares() * stock.getSharePrice();
            System.out.println("Each Stock Value of  " + stock.getShareName() + "  company is  " + valueOfStock);
            System.out.println("Total Stock value of " + stock.getShareName() + " company is  " + totalValueOfStock);
        }
    }

    private static Stock stockDetails() {
        System.out.println("Enter the name of stocks");
        stock.setShareName(scanner.next());
        System.out.println("Enter the number of share");
        stock.setNumberOfShares(scanner.nextInt());
        System.out.println("Enter rhe share price");
        stock.setSharePrice(scanner.nextInt());
        return stock;
    }

}
