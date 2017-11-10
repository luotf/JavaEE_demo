package com.ltf.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.ltf.model.Isbn;

public class IsbnArrayConverter extends StrutsTypeConverter {

	/**
	 *功能：前端到后台
	 */
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		List<Isbn> list=new ArrayList();
		for(int j=0;j<arg1.length;j++){
			Isbn isbn=new Isbn();
			int sum=0;			//求和
			int M,N;        
			int checkNo;    //尾号
			String sb="";    //12位字符串
		String []str=arg1[j].split("-");
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
		 isbn.setBookNo(arg1[j]);
		 //System.out.println("字符串为："+isbn.getBookNo());
		 
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
		 list.add(isbn);
		}
		//System.out.println(list.size());
		//System.out.println(list.get(0).getBookNo()+"   "+list.get(1).getBookNo()+"   "+list.get(2).getBookNo());
		 return list; 
	}

	
	/**
	 *功能：后台到前端
	 */
	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO Auto-generated method stub
		List<Isbn> list=(List<Isbn>)arg1;
		StringBuffer buff=new StringBuffer();
		for(Isbn isbn:list)
			buff.append("["+isbn.getBookNo()+"-"+isbn.getCheckNo()+"]");
		
		//System.out.println(buff);
		return buff.toString();
	}
}
