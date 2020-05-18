package qr;

import org.junit.Test;

import cn.tedu.qr.CreateQR;

/**用于生成二维码的类*/
public class QR {
	@Test
	public void create(){
		int width=150;
		int height=150;
		String content="http://www.baidu.com";
		String path="D:\\qr.png";
		CreateQR.create(width,height,content,path);
	}
}
