package com.exercises.stream.sand;

import java.math.BigDecimal;

public final class Afrika implements SandStorage{

	@Override
	public BigDecimal getSandBeansQuantity() {
		BigDecimal sandQuantity = new BigDecimal("99999999901234567890");
		return sandQuantity;
	}

}
