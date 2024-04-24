public class APLine
{
  private int myX;
  private int myY;
  private int myA;
  private int myB;
  private int myC;

  public void APLine(int a, int b, int c){
    myA = a; 
    myB = b;
    myC = c;
  }

  public double getSlope(){
    return (double)(-1*myA)/(double)myB;
  }

  public boolean isOnLine(int x, int y){
    myX = x;
    myY = y;
    if ((myA*myX) + (myB*myY) + myC == 0){
      return true;
    }
    return false;
  }
}
