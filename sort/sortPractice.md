##  Different Sorting Situations



#### 1) Sort 10 schools around your house by distance:
* **Insertion Sort**: time O(n^2), space O(1)
    - small input, easy to implement, no extra space, possibly close to sorted


#### 2) eBay sorts listings by the current Bid amount:
* **Radix Sort**: time O(nk), space O(n + k)
    - more efficient than merge/count, bids are usually nums in fixed range

* **Counting Sort**: time O(n + k), space O(k)
    - same as above


#### 3) Sport scores on ESPN
* **Quick Sort**: time O(n log n), space O(log n)
    - efficient, doubt that scores aren't that sorted, better in space than Merge Sort


#### 4) Massive database (can't fit all into memory) needs to sort through past year's user data
* **Merge Sort**: time O(n log n), space O(n)
    - efficient, don't have to worry about own memory. don't want worst scenario w so much data (O(n^2) Quick Sort)


#### 5) Almost sorted Udemy review data needs to update and add 2 new reviews
* **Insertion Sort**: time O(n^2), space O(1)
    - small input, almost done sorted, easy to implement - closer to O(n)


#### 6) Temperature Records for the past 50 years in Canada
* **Radix Sort**: time O(nk), space O(n + k)
* **Counting Sort**: time O(n + k), space O(k)
    - + efficient than merge/count, if ints only (in range)
* **Quick Sort**: time O(n log n), space O(log n)
    - efficient still, better if has decimal places


#### 7) Large user name database needs to be sorted. Data is very random.
* **Quick Sort**: time O(n log n), space O(log n)
    - More efficient for lots of data, a bit better in memory than Merge Sort, less chance of choosing bad pivot at beg/end of list since data isn't mostly ordered


#### 8) You want to teach sorting for the first time
* **Bubble Sort**: time O(n^2), space O(1)
    - easy to understand, but inefficient
* **Selection Sort**: time O(n^2), space O(1)
    - same reason as above