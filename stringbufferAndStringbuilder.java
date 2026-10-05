public class stringbufferAndStringbuilder {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());

        sb.append("Reddy");
        System.out.println(sb);

        // String str = sb.toString();
        // System.out.println(str);

        // sb.deleteCharAt(2);
        // sb.insert(0,"java");
        // sb.insert(6, " Java");
        sb.ensureCapacity(100);



        System.out.println(sb);
    }

}
