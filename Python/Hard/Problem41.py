class Problem41:

	def firstMissingPositive(self, nums):
		"""
		:type nums: List[int]
		:rtype: int
		"""

		if len(nums) == 0:
			return 1

		for i in range(len(nums)):
			if nums[i] <= 0:
				nums[i] = len(nums) + 1

		print('After removing negative values: '+str(nums))

		for i in range(len(nums)):
			absValue = abs(nums[i])
			if absValue >= 1 and absValue <= len(nums):
				if nums[absValue - 1] > 0:
					nums[absValue - 1] *= -1

		for i in range(len(nums)):
			if nums[i] > 0:
				return i + 1

		return len(nums) + 1

p1 = Problem41()
nums = [7,8,9,11,12]
result = p1.firstMissingPositive(nums)
print(result)

