def findMedianSortedArrays(nums1, nums2):
		"""
		:type nums1: List[int]
		:type nums2: List[int]
		:rtype: float

		"""
		# concatenate the 2 lists and sort them
		nums1 += nums2
                nums1.sort()
                length = len(nums1)
                value = length / 2
                if length % 2 == 0:
                    return (float) (nums1[value-1] + nums1[value])/ 2
                else:
                    return nums1[int(value)]


nums1 = [1, 2, 5]
nums2 = [1, 2, 3, 4]
result = findMedianSortedArrays(nums1, nums2)
print(result)
