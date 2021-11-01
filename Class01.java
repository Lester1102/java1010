class CWin
 {
 int length;
 int width;
 int height;
 int radius;
 double p=3.14;
 String name;
 void setL(int l) //長
 {length=l;}
 
 void setW(int w) //寬
 {width=w;}
 
 void setH(int h) //高
 {height=h;}
 
 void setR(int r)  //半徑
 {radius=r; }
 
 void setName(String s)  {
 name=s;
 }
 public void show()
 {
 System.out.println("半徑="+ radius );
 System.out.println("球形體積="+ (4.0/3)*3.14*radius*radius*radius );
 System.out.println("長"+length+"  寬="+width+"  高="+height);
System.out.println("立體表面積"+ (length*width*2+length*height*2+width*height*2) );
 }
 } 	
  public class Class01
  {
  public static void main(String args[])
  {
  CWin cw=new CWin();
  cw.setL(4);
  cw.setW(5);
  cw.setH(6);
  cw.setR(10);
  cw.show();
  }
  }