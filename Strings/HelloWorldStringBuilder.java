public class HelloWorldStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        // sb.append("Hello, ");
        // sb.append("World!");

        String result = sb.toString();
        System.out.println(result);
    }
}
