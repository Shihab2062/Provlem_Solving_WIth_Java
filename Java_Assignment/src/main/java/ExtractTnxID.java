public class ExtractTnxID {
    public static void main(String[] args) {
        String html="<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Transactions</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div>\n" +
                "        <div class=\"button\">\n" +
                "            <p>Transaction Id: TXN1234</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";

        int FirstIndex=html.indexOf("Transaction Id: ");
        if (FirstIndex !=-1){
            int lastIndex=html.indexOf("</p>",FirstIndex);
            String tnxID=html.substring(FirstIndex,lastIndex).trim();
            System.out.println(tnxID);
        } else {
            System.out.println("Not found");
        }
    }
}
