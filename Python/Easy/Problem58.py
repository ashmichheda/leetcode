class Solution:
	def lengthOfLastWord(self, s):
		s = s.strip()
		val = s.split(" ")
		print(val)
		length = len(val)
		answer = "" + val[length - 1]
		return len(answer)


p1 = Solution()
s = "Hello World"
result = p1.lengthOfLastWord(s)
print('Answer is: ' + str(result))
