public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        Fraction ans = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + ans);
    }
}
