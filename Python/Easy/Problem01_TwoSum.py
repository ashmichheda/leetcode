# -*- coding: utf-8 -*-
"""
Created on Tue Feb 12 22:19:50 2019

@author: Ashmi
"""

class TwoSum(object):
    
    def twosum(self, nums, target):
        n = len(nums)
        for i in range (n):
            val = target - nums[i]
            if val in nums and nums.index(val)!= i:
                return [i, nums.index(val)]