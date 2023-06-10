public class Main {
    public static void main(String[] args) {
        Author strugackiye = new Author("Братья", "Стругацкие");
        Author remark = new Author("Эрих", "Ремарк");
        Book gradObrechenniy = new Book("Град обреченный", strugackiye, 1987);
        Book triTovarischa = new Book("Три товарища", remark, 1936);

        gradObrechenniy.setYear(1972);
        System.out.println(strugackiye.toString());
        System.out.println(remark.toString());
        System.out.println(gradObrechenniy.toString());
        System.out.println(triTovarischa.toString());

        System.out.println(gradObrechenniy.equals(triTovarischa));
        System.out.println(triTovarischa.hashCode());


    }
}