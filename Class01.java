class CWin
 {
 int length;
 int width;
 int height;
 int radius;
 double p=3.14;
 String name;
 void setL(int l) //��
 {length=l;}
 
 void setW(int w) //�e
 {width=w;}
 
 void setH(int h) //��
 {height=h;}
 
 void setR(int r)  //�b�|
 {radius=r; }
 
 void setName(String s)  {
 name=s;
 }
 public void show()
 {
 System.out.println("�b�|="+ radius );
 System.out.println("�y����n="+ (4.0/3)*3.14*radius*radius*radius );
 System.out.println("��"+length+"  �e="+width+"  ��="+height);
System.out.println("������n"+ (length*width*2+length*height*2+width*height*2) );
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