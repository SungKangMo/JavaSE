public class Test1{
      public static void main(String [] args){
             //int a;   ����
             Sungjuk  sujan, lisa;
             sujan = new Sungjuk();
             lisa = new Sungjuk();
             sujan.kor = 100;
             lisa = sujan;
             System.out.println("sujan.kor = " + sujan.kor);
             System.out.println("lisa.kor = " + lisa.kor);
             System.out.println("��ȯ ��");
             lisa.kor = 50;
             System.out.println("sujan.kor = " + sujan.kor);
             System.out.println("lisa.kor = " + lisa.kor);
      }
}
class Sungjuk{
      int kor;
      int eng;
}