package jd.com;
import java.io.*;
public class StandardInputOutput  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String fileName="ep10_7.dat";
	        int value1=100,value2=0,value3=-100;
	        try{
	            //�� DataOutputStream �� FileOutputStream ���������ͬ���͵�����
	            DataOutputStream a=new DataOutputStream(new FileOutputStream(fileName));
	            a.writeInt(value1);
	            a.writeInt(value2);
	            a.writeInt(value3);
	            a.close();
	        }
	        catch(IOException i){
	            System.out.println("���ִ���!"+fileName);
	        }
	}
}