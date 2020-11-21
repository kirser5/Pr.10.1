
class Complex {
    int real, imaginary;
    Complex()
    {
    }

    Complex(int tempReal, int tempImaginary)
    {
        real = tempReal;
        imaginary = tempImaginary;
    }

    Complex CreateComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();

        temp.real = C1.real + C2.real;


        temp.imaginary = C1.imaginary + C2.imaginary;


        return temp;
    }


    Complex subtractComp(Complex C1, Complex C2)
    {

        Complex temp = new Complex();


        temp.real = C1.real - C2.real;


        temp.imaginary = C1.imaginary - C2.imaginary;

        return temp;
    }


    void printComplexNumber()
    {
        System.out.println("Complex number: "
                + real + " + "
                + imaginary + "i");
    }
}


public class main {


    public static void main(String[] args)
    {


        Complex C1 = new Complex(3, 2);

        C1.printComplexNumber();

        Complex C2 = new Complex(9, 5);

        C2.printComplexNumber();

        Complex C3 = new Complex();

        C3 = C3.CreateComp(C1, C2);

        System.out.print("Sum of ");
        C3.printComplexNumber();

        C3 = C3.subtractComp(C1, C2);

        System.out.print("Difference of ");
        C3.printComplexNumber();
    }
} 