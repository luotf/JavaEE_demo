package com.ltf.tools;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.ltf.model.Isbn;

public class IsbnConverter extends StrutsTypeConverter {

	/**
	 *功能：前端到后台
	 */
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		Isbn isbn=new Isbn();
		int sum=0;			//求和
		int M,N;        
		int checkNo;    //尾号
		String sb="";    //12位字符串
		String []str=arg1[0].split("-");
		int[] nums = new int[str.length];    //nums：以“-”隔开的整型数组
		 for(int i=0;i<str.length;i++){  
		   if (str[i] != null) {   
		     nums[i]=Integer.parseInt(str[i]);  
		      }   
		    }
		 
		 //将字符串数组转换成字符串
		 for(int i = 0; i < str.length; i++)
			 sb+=str[i];
		 
		 //将获取的字符串存到BookNo中
		 isbn.setBookNo(arg1[0]);
		 //System.out.println("字符串为："+sb);
		 
		 //将字符串转换成12位的整型数组并求和
		 int[] num = new int[sb.length()];   //num表示把字符串变成12位数组
		 for(int i=0;i<sb.length();i++){
				num[i] = Integer.parseInt(sb.substring(i, i+1)); 
				//System.out.println("num["+i+"]="+num[i]);
				if (i%2==0)  
					 sum+=num[i];
				 else
					 sum+=num[i]*3;
			}
		 System.out.println("sum="+sum);
		 M=sum%10;
		 N=10-M;
		 if(N==10)
			 isbn.setCheckNo("0");
		 else isbn.setCheckNo(N+"");
		 System.out.println("尾号="+isbn.getCheckNo());
		 return isbn; 
	}


	/**
	 *功能：后台到前端
	 */
	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO Auto-generated method stub
		Isbn isbn=(Isbn)arg1;
		return isbn.getBookNo()+"-"+isbn.getCheckNo();
	}
}
