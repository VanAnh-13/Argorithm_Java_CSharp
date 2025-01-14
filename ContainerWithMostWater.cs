﻿using System;

namespace Algorithm
{
    public class ContainerWithMostWater
    {
        public int MaxArea(int[] height) {
            int left = 0;
            int right = height.Length - 1;
            int maxArea = 0;

            while(left < right) {
                int w = right - left;
                int h = Math.Min(height[left], height[right]);
                maxArea = Math.Max(w * h, maxArea);

                if(height[left] < height[right]) {
                    left++;
                }

                else {
                    right--;
                }
            }

            return maxArea;
        }
    }
}