package com.myshop.tests.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.myshop.model.product.IVAType;

public class IVATypeTest {

	@Test
	public void test() {
		assertEquals(10, new IVAType(1, "", 10).getIVA());
		assertEquals(0.1, new IVAType(1, "", 10).asPercentage(), 0.01);
	}

}
