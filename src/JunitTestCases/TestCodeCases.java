package JunitTestCases;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TestCodeCases {

	@Test
	public void test1() {
		int a[] = { 1, 2, 4, 3, 9 };
		int b[] = { 9, 1, 1, 4, 5, 6, 4 };
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(1, 3);
		expected.put(2, 1);
		expected.put(3, 1);
		expected.put(4, 3);
		expected.put(5, 1);
		expected.put(6, 1);
		expected.put(9, 2);
		MergeCounter mc = new MergeCounter(a, b);
		Map<Integer, Integer> response = mc.mCounter();
		System.out.println(response);
		Assert.assertEquals(response, expected);
	}

	@Test
	public void test2() {
		int a[] = {};
		int b[] = { 9, 1, 1, 4, 5, 6, 4 };
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(1, 2);
		expected.put(4, 2);
		expected.put(5, 1);
		expected.put(6, 1);
		expected.put(9, 1);
		MergeCounter mc = new MergeCounter(a, b);
		Map<Integer, Integer> response = mc.mCounter();
		System.out.println(response);
		Assert.assertEquals(response, expected);
	}

	@Test
	public void test3() {
		int a[] = {};
		int b[] = {};
		Map<Integer, Integer> expected = new HashMap<>();
		MergeCounter mc = new MergeCounter(a, b);
		Map<Integer, Integer> response = mc.mCounter();
		System.out.println(response);
		Assert.assertEquals(response, expected);
	}

	@Test
	public void test4() {
		int a[] = { 1, 2, 4, 3, 9 };
		int b[] = { 9, 1, 1, 4, 5 };
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(1, 3);
		expected.put(2, 1);
		expected.put(3, 1);
		expected.put(4, 2);
		expected.put(5, 1);
		expected.put(9, 2);
		MergeCounter mc = new MergeCounter(a, b);
		Map<Integer, Integer> response = mc.mCounter();
		System.out.println(response);
		Assert.assertEquals(response, expected);
	}

	@Test
	public void test5() {
		int a[] = null;
		int b[] = null;
		Map<Integer, Integer> expected = new HashMap<>();
		MergeCounter mc = new MergeCounter(a, b);
		Map<Integer, Integer> response = mc.mCounter();
		System.out.println(response);
		Assert.assertEquals(response, expected);
	}
}
