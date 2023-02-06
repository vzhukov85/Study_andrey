public class CheckInheritationSameClass {
   static class Ok {
       int Summa(int FirstSummand, int SecondSummand) {
            return (FirstSummand + SecondSummand);
        }

    }
    public static class InheritOK extends Ok {
        @Override
        int Summa(int FirstSummand, int SecondSummand) {
            // return (FirstSummand + SecondSummand + ThirdSummand)*2;
            return (FirstSummand + SecondSummand)*2;
        } // int ThirdSummand
    }
    public static class InheritNotOK extends Ok {
        //@Override
        short Summa(short FirstSummand, short SecondSummand) {
            // return (FirstSummand + SecondSummand + ThirdSummand)*2;
            //return (FirstSummand + SecondSummand)*2;
            return FirstSummand;
        } // int ThirdSummand
    }


    public static void main(String[] args) {
        int x=5, y=10, z= 6;
        short a = 9, b = 7, c =3;
        long k = 1, l = 4, m = 2;
        // short x = 5, y = 10, z = 6;
        InheritOK inh = new InheritOK();
        System.out.println(inh.Summa(x, y));
        InheritNotOK inh2 = new InheritNotOK();
        System.out.println(inh.Summa(a, b));

        // inh.Summa(x,y);
    }
}


