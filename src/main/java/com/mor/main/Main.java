/**
 * 
 */
package com.mor.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wanggengqi
 * @email wanggengqi@chinasofti.com
 * @date 2014年10月23日 下午1:56:05
 */
public class Main {

	/**
	 * @author wanggengqi
	 * @date 2014年10月23日 下午1:56:05
	 * @param args
	 * @return void
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationProvider.xml" });
		context.start();
		System.out.println("在master分支下做操作");
		System.out.println("lingy分支下添加的内容");
		System.out.println("929584431修改");
		System.out.println("按任意键退出");
		System.in.read();
	}

}
