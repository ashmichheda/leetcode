class Problem791:

	def customSortString(self, S, T):

		return ''.join(sorted(T, key=S.find))



p1 = Problem791()
S = "cba"
T = "abcd"
result = p1.customSortString(S,T)
print('Answer is: ' + str(result))