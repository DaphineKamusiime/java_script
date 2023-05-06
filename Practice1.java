   //HACKER RANK
    function getSecondLargest(nums) {
  // Sort the array in descending order
  nums.sort((a, b) => b - a);

  // Traverse the sorted array and return the second element
  for (let i = 1; i < nums.length; i++) {
    if (nums[i] !== nums[0]) {
      return nums[i];
    }
  }

  // If there is no second largest element, return null
  return null;
}

}
