# Dynamic String Surgeon (JavaBasics_Task_133_V0.1)

## 📖 Description
An advanced look at substring extraction. Instead of hardcoding indices, this project demonstrates how to programmatically find the start and end positions of a fragment, making the code resilient to changes in the source string.

## 📋 Requirements Compliance
- **Task**: Extract "gram" from "programming" without guessing indices.
- **Mechanism**:
    1. `indexOf("gram")` to find the start.
    2. `start + length()` to find the end.
    3. `substring(start, end)` for extraction.

## 🚀 Architectural Stack
- Java 8+

## 🏗️ Implementation Details
- **Step 1**: Find the beginning of the target word using `indexOf()`.
- **Step 2**: Calculate the end index by adding the length of the target word to its start index. This works perfectly because `substring()`'s end index is exclusive.

## 📋 Expected result
```text
Start index: 3
End index: 7
Extracted: gram
```

## 💻 Code Example

Project Structure:

    src/com/yurii/pavlenko/
                    └── Solution.java

Code
```java
package com.yurii.pavlenko;

public class Solution {
    public static void main(String[] args) {
        String word = "programming";
        String target = "gram";

        int startIndex = word.indexOf(target);
        int endIndex = startIndex + target.length();
        
        String result = word.substring(startIndex, endIndex);

        System.out.println("Start index: " + startIndex);
        System.out.println("End index: " + endIndex);
        System.out.println("Extracted: " + result);
    }
}
```

## ⚖️ License
This project is licensed under the **MIT License**.

Copyright (c) 2026 Yurii Pavlenko

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files...

License: [MIT](LICENSE)
