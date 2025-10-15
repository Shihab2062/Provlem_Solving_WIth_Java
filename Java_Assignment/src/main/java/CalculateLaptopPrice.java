public class CalculateLaptopPrice {
    public static void main(String[] args) {
        String str="A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        str=str.replaceAll("[^0-9]"," ");
        str=str.trim();
        str=str.replaceAll(" +"," ");
        String[] chars=str.split(" ");
        double Laptop=Double.parseDouble(chars[1]);
        double mouse=Double.parseDouble(chars[2]);
        double Total_Price= ( Laptop+mouse-((Laptop+mouse)*15/100));
        System.out.println("Total price of laptop and mouse is:"+Total_Price+" taka");
    }
}
