package com.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.model.User;
import com.demo.service.EhcacheService;
import com.demo.service.EhcacheServiceImpl;

public class EhcacheServiceTest extends SpringTest {

	@Autowired(required=true)
	private EhcacheService ehcacheService;

	// 有效时间是5秒，第一次和第二次获取的值是一样的，因第三次是5秒之后所以会获取新的值
//	@Test
//	public void testTimestamp() throws InterruptedException {
//		System.out.println("第一次调用：" + ehcacheService.getTimestamp("param"));
//		Thread.sleep(2000);
//		System.out.println("2秒之后调用：" + ehcacheService.getTimestamp("param"));
//		Thread.sleep(4000);
//		System.out.println("再过4秒之后调用：" + ehcacheService.getTimestamp("param"));
//	}

//	@Test
//	public void testCache() {
//		String key = "zhangsan";
//		String value = ehcacheService.getDataFromDB(key); // 从数据库中获取数据...
//		ehcacheService.getDataFromDB(key); // 从缓存中获取数据，所以不执行该方法体
//		ehcacheService.removeDataAtDB(key); // 从数据库中删除数据
//		ehcacheService.getDataFromDB(key); // 从数据库中获取数据...（缓存数据删除了，所以要重新获取，执行方法体）
//	}

//	@Test
//	public void testPut() {
//		String key = "mengdee";
//		ehcacheService.refreshData(key); // 模拟从数据库中加载数据
//		String data = ehcacheService.getDataFromDB(key);
//		System.out.println("data:" + data); // data:mengdee::103385
//		
//		String data1 = ehcacheService.getDataFromDB(key);
//		System.out.println("data1:" + data1);
//
//		ehcacheService.refreshData(key); // 模拟从数据库中加载数据
//		String data2 = ehcacheService.getDataFromDB(key);
//		System.out.println("data2:" + data2); // data2:mengdee::180538
//	}

//	@Test
//	public void testFindById() {
//		User user = ehcacheService.findById("1"); // 模拟从数据库中查询数据
//		System.out.println(user.getName());
//		
//		User user1 = ehcacheService.findById("1"); // 从 ehcache 中读取数据
//		System.out.println(user.getName());
//	}

//	@Test
//	public void testIsReserved() {
//		ehcacheService.isReserved("123"); // 条件
//		ehcacheService.isReserved("123"); 
//		
//		ehcacheService.isReserved("12345678910123"); 
//		ehcacheService.isReserved("12345678910123");
//	}

//	@Test
//	public void testRemoveUser() {
//		// 线添加到缓存
//		ehcacheService.findById("1");
//
//		// 再删除
//		ehcacheService.removeUser("1");
//
//		// 如果不存在会执行方法体
//		ehcacheService.findById("1");
//	}

	@Test
	public void testRemoveAllUser() {
		ehcacheService.findById("1");
		ehcacheService.findById("2");

		ehcacheService.removeAllUser();

		ehcacheService.findById("1");
		ehcacheService.findById("2");

		// 模拟从数据库中查询数据
		// 模拟从数据库中查询数据
		// UserCache delete all
		// 模拟从数据库中查询数据
		// 模拟从数据库中查询数据
	}

}