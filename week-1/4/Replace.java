class Replace {
    public static void main(String[] args) {
        String str = "Hello World!";
        str="Some thing like         ";
        str=str.replace("[a-zA-Z0-9]", "");
        String newStr = str.replace("World", "Java");
        System.out.println(newStr); // Output: Hello Java!
    }
}





