class Problem50:

	def myPow(self, x, n):
		"""
		:type x: float
		:type n: int
		:rtype: float
        """
		answer = 1

		if n == 0 or x == 1:
			return 1
		if x == -1:
			return 1 if n % 2 == 0 else -1

		for i in range(abs(n)):
			answer *= x
			if (abs(answer) < 10 ** -5 and n > 0) or (abs(answer) > 10 ** 5 and n < 0): return 0

		return answer if n > 0 else 1 / answer


p1 = Problem50()
x = 2
n = 3
result = p1.myPow(x, n)
print('Answer is: ' + str(result))
