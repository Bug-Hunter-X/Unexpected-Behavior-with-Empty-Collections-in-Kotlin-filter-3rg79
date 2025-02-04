# Unexpected Behavior with Empty Collections in Kotlin filter

This repository demonstrates a common Kotlin bug related to unexpected behavior when dealing with empty collections. The code intends to find even numbers in a list and print their count. However, if the input list contains no even numbers, the code will not produce the expected output (it prints 0 instead of throwing an exception). The solution provides a more robust way to handle such cases.