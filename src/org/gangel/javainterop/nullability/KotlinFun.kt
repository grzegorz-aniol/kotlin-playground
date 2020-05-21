package org.gangel.javainterop.nullability

object KotlinFun {

	@JvmStatic
	fun funWithNullableArgument(value: Int, otherValue: Int?): Int =
		value + (otherValue ?: 0)

	@JvmStatic
	fun funWithNullableArgument(value: String, otherValue: String?): String =
		value + (otherValue ?: 0)

	@JvmStatic
	fun funWithNullableResult(value: Int): Int? =
		when {
			value % 2 == 0 -> value
			else -> null
		}

}
