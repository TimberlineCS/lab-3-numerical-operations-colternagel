public class RevNumber{

  public static void main(String args[]){
    int n1 = 1234;
    int nrev1 = n1%10; 
    int ndiv1 = n1/10; 
    int nrev2 = ndiv1%10; 
    int ndiv2 = ndiv1/10; 
    int nrev3 = ndiv2%10; 
    int ndiv3 = ndiv2/10;
    int nrev4 = ndiv3%10; 
    System.out.print(nrev1);
    System.out.print(nrev2);
    System.out.print(nrev3);
    System.out.println(nrev4);

    int a1 = 6789;
    int arev1 = a1%10; 
    int adiv1 = a1/10; 
    int arev2 = adiv1%10;
    int adiv2 = adiv1/10;
    int arev3 = adiv2%10;
    int adiv3 = adiv2/10;
    int arev4 = adiv3%10; 
    System.out.print(arev1);
    System.out.print(arev2);
    System.out.print(arev3);
    System.out.println(arev4);

    int b1 = 1080;
    int brev1 = b1%10; 
    int bdiv1 = b1/10; 
    int brev2 = bdiv1%10; 
    int bdiv2 = bdiv1/10; 
    int brev3 = bdiv2%10; 
    int bdiv3 = bdiv2/10; 
    int brev4 = bdiv3%10; 
    System.out.print(brev1);
    System.out.print(brev2);
    System.out.print(brev3);
    System.out.println(brev4);    


  }


}