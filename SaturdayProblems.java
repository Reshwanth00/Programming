package com.tekpyramid.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SaturdayProblems {

    public static void main(String[] args) {

        // ============================================================
        // 1. FIRST NON-REPEATING CHARACTER
        // ============================================================

        String str = "swiss";

        System.out.println("1. Brute Force: " + firstNonRepeatingBrute(str));

        System.out.println("1. Optimal: " + firstNonRepeatingOptimal(str));

        System.out.println("1. Streams: " + firstNonRepeatingStream(str));


        // ============================================================
        // 2. GROUP ANAGRAMS
        // ============================================================

        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println("\n2. Brute Force: " + groupAnagramsBrute(strings));

        System.out.println("2. Optimal: " + groupAnagramsOptimal(strings));

        System.out.println("2. Streams: " + groupAnagramsStream(strings));


        // ============================================================
        // 3. SEPARATE EVEN AND ODD
        // ============================================================

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("\n3. Brute / Loop:");
        separateEvenOdd(numbers);

        System.out.println("\n3. Streams:");
        separateEvenOddStream(numbers);


        System.out.println("\n3. threads:");
        separateEvenOddStreamThreads();


        // ============================================================
        // 4. SECOND HIGHEST NUMBER
        // ============================================================

        int[] arr = {10, 20, 30, 30, 5};

        System.out.println("\n4. Brute Force: " + secondHighestBrute(arr));

        System.out.println("4. Optimal: " + secondHighestOptimal(arr));

        System.out.println("4. Streams: " + secondHighestStream(arr));


        // ============================================================
        // 5. THREAD-SAFE SINGLETON
        // ============================================================

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("\n5. Singleton same object: " + (s1 == s2));


        // ============================================================
        // 6. FIND DUPLICATE ELEMENTS
        // ============================================================

        int[] duplicateArray = {1, 2, 3, 2, 4, 1, 5, 2};

        System.out.println("\n6. Brute Force: " + duplicatesBrute(duplicateArray));

        System.out.println("6. Optimal: " + duplicatesOptimal(duplicateArray));

        System.out.println("6. Streams: " + duplicatesStream(duplicateArray));


        // ============================================================
        // 7. LONGEST SUBSTRING WITHOUT REPEATING CHARACTERS
        // ============================================================

        String input = "abcabcbb";

        System.out.println("\n7. Brute Force: " + longestSubstringBrute(input));

        System.out.println("7. Optimal: " + longestSubstringOptimal(input));


        // ============================================================
        // 8. CHARACTER / WORD FREQUENCY
        // ============================================================

        String frequencyString = "hello";

        System.out.println("\n8. Brute Force: " + characterFrequencyBrute(frequencyString));

        System.out.println("8. Optimal: " + characterFrequencyOptimal(frequencyString));

        System.out.println("8. Streams: " + characterFrequencyStream(frequencyString));

        String words = "java spring java sql spring java";

        System.out.println("Word Frequency: " + wordFrequency(words));


        // ============================================================
        // 9. MAXIMUM SUBARRAY SUM - KADANE
        // ============================================================

        int[] kadaneArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("\n9. Brute Force: " + maxSubArrayBrute(kadaneArray));

        System.out.println("9. Optimal - Kadane: " + maxSubArrayOptimal(kadaneArray));


        // ============================================================
        // 10. REVERSE WORDS
        // ============================================================

        String sentence = "Hello world Java";

        System.out.println("\n10. Reverse Each Word: " + reverseEachWord(sentence));

        System.out.println("10. Reverse Each Word - Streams: " + reverseEachWordStream(sentence));

        System.out.println("10. Reverse Word Order: " + reverseWordOrder(sentence));

        System.out.println("10. Reverse Word Order - Streams: " + reverseWordOrderStream(sentence));


        // ============================================================
        // 11. EMPLOYEE GROUPING AND AGGREGATIONS
        // ============================================================

        List<Employee> employees = Arrays.asList(new Employee(1, "John", "IT", 50000), new Employee(2, "David", "IT", 60000), new Employee(3, "Alice", "HR", 45000), new Employee(4, "Bob", "HR", 55000), new Employee(5, "Mike", "Finance", 70000));

        System.out.println("\n11. Group Employees - Streams:");
        groupEmployeesByDepartment(employees);

        System.out.println("Average Salary: " + averageSalaryByDepartment(employees));

        System.out.println("Highest Average Salary Department: " + highestAverageSalaryDepartment(employees));


        // ============================================================
        // 12. MOVE ALL ZEROS TO END
        // ============================================================

        int[] numbers1 = {2, 3, 0, 1, 0, 1, 2, 0, 6};

        System.out.println("\n12. Brute Force:");

        int[] brute = moveZerosBrute(numbers1);

        System.out.println(Arrays.toString(brute));

        int[] numbers2 = {2, 3, 0, 1, 0, 1, 2, 0, 6};

        System.out.println("12. Optimal:");

        moveZerosOptimal(numbers2);

        System.out.println(Arrays.toString(numbers2));


        // ============================================================
        // 13. REVERSE LETTERS ONLY
        // ============================================================

        String input1 = "a1b2c3d4e5f";

        System.out.println("\n13. Brute Force: " + reverseLettersBrute(input1));

        System.out.println("13. Optimal: " + reverseLettersOptimal(input1));


        // ============================================================
        // 14. IMMUTABLE CLASS
        // ============================================================

        Address address = new Address("Hyderabad", "Telangana");

        ImmutableEmployee employee = new ImmutableEmployee(1, "Reshwanth", address);

        System.out.println("\n14. Immutable Employee:");

        System.out.println(employee);


        // ============================================================
        // 15. MAXIMUM PRODUCT SUBARRAY
        // ============================================================

        int[] productArray = {2, 3, -2, 4};

        System.out.println("\n15. Brute Force: " + maxProductBrute(productArray));

        System.out.println("15. Optimal: " + maxProductOptimal(productArray));


        // ============================================================
        // 16. PRODUCT OF ARRAY EXCEPT SELF
        // ============================================================

        int[] productExcept = {1, 2, 3, 4};

        System.out.println("\n16. Brute Force: " + Arrays.toString(productExceptBrute(productExcept)));

        System.out.println("16. Optimal: " + Arrays.toString(productExceptOptimal(productExcept)));


        // ============================================================
        // 17. TWO SUM
        // ============================================================

        int[] twoSumArray = {2, 7, 11, 15};

        int target = 9;

        System.out.println("\n17. Brute Force: " + Arrays.toString(twoSumBrute(twoSumArray, target)));

        System.out.println("17. Optimal: " + Arrays.toString(twoSumOptimal(twoSumArray, target)));

        System.out.println("17. Streams: " + Arrays.toString(twoSumStream(twoSumArray, target)));


        // ============================================================
        // 18. STACK USING QUEUE
        // ============================================================

        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\n18. Stack:");

        System.out.println("Top: " + stack.top());

        System.out.println("Pop: " + stack.pop());

        System.out.println("Top: " + stack.top());


        // ============================================================
        // 19. REVERSE LINKED LIST
        // ============================================================

        Node head = createLinkedList();

        System.out.println("\n19. Original Linked List:");

        printList(head);

        head = reverseLinkedListIterative(head);

        System.out.println("19. Iterative Reverse:");

        printList(head);

        head = reverseLinkedListRecursive(head);

        System.out.println("19. Recursive Reverse:");

        printList(head);


        // ============================================================
        // 20. VALID PARENTHESES
        // ============================================================

        String brackets = "{[()]}";

        System.out.println("\n20. Brute Force: " + validParenthesesBrute(brackets));

        System.out.println("20. Optimal: " + validParenthesesOptimal(brackets));


        // ============================================================
        // 21. STRING ROTATION CHECK
        // ============================================================

        String s3 = "abcd";
        String s4 = "cdab";

        System.out.println("\n21. String Rotation");

        System.out.println("Brute Force: " + isRotationBrute(s3, s3));

        System.out.println("Optimal: " + isRotationOptimal(s3, s4));


        // ============================================================
        // 22. FIND MISSING NUMBER
        // ============================================================

        int[] numbers3 = {1, 2, 3, 5, 6};

        System.out.println("\n22. Missing Number");

        System.out.println("Brute Force: " + findMissingBrute(numbers3));

        System.out.println("Optimal: " + findMissingOptimal(numbers3));

        System.out.println("Streams: " + findMissingStream(numbers3));


        // ============================================================
        // 23. ROTATE ARRAY BY K POSITIONS
        // ============================================================

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("\n23. Rotate Array - Brute Force:");

        int[] bruteRotate = rotateBrute(arr1, 3);

        System.out.println(Arrays.toString(bruteRotate));


        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("23. Rotate Array - Optimal:");

        rotateOptimal(arr2, 3);

        System.out.println(Arrays.toString(arr2));


        // ============================================================
        // 24. MINIMUM SIZE SUBARRAY SUM
        // ============================================================

        int[] subArray = {2, 3, 1, 2, 4, 3};

        int target1 = 7;

        System.out.println("\n24. Minimum Size Subarray");

        System.out.println("Brute Force: " + minSubArrayBrute(subArray, target1));

        System.out.println("Optimal: " + minSubArrayOptimal(subArray, target1));


        // ============================================================
        // 25. SORT 0, 1 AND 2
        // ============================================================

        int[] colors = {2, 0, 2, 1, 1, 0};

        System.out.println("\n25. Sort 0,1,2 - Brute Force:");

        int[] sortedBrute = sort012Brute(colors);

        System.out.println(Arrays.toString(sortedBrute));


        int[] colors2 = {2, 0, 2, 1, 1, 0};

        System.out.println("25. Sort 0,1,2 - Optimal:");

        sort012Optimal(colors2);

        System.out.println(Arrays.toString(colors2));


        // ============================================================
        // 26. NEXT GREATER ELEMENT
        // ============================================================

        int[] ngeArray = {4, 5, 2, 10, 8};

        System.out.println("\n26. Next Greater Element");

        System.out.println("Brute Force: " + Arrays.toString(nextGreaterBrute(ngeArray)));

        System.out.println("Optimal: " + Arrays.toString(nextGreaterOptimal(ngeArray)));


        // ============================================================
        // 27. MERGE TWO SORTED ARRAYS
        // ============================================================

        int[] a = {1, 3, 5, 7};

        int[] b = {2, 4, 6, 8};

        System.out.println("\n27. Merge Sorted Arrays:");

        System.out.println("Using extra space: " + Arrays.toString(mergeArrays(a, b)));

        System.out.println("Without extra space:");

        int[] a2 = {1, 3, 5, 7};

        int[] b2 = {2, 4, 6, 8};

        mergeWithoutExtraSpace(a2, b2);

        System.out.println("A = " + Arrays.toString(a2));

        System.out.println("B = " + Arrays.toString(b2));


        // ============================================================
        // 28. TRANSACTION AGGREGATION
        // ============================================================

        List<Transaction> transactions = Arrays.asList(

                new Transaction("ACC1", "CREDIT", "SUCCESS", 1000),

                new Transaction("ACC1", "DEBIT", "SUCCESS", 300),

                new Transaction("ACC1", "CREDIT", "FAILED", 500),

                new Transaction("ACC2", "CREDIT", "SUCCESS", 2000),

                new Transaction("ACC2", "DEBIT", "SUCCESS", 500),

                null);

        System.out.println("\n28. Transaction Aggregation:");

        System.out.println(transactionSummary(transactions));


        // ============================================================
        // 29. PRODUCER CONSUMER
        // ============================================================

        System.out.println("\n29. Producer Consumer:");

        ProducerConsumer pc = new ProducerConsumer();

        Thread producer = new Thread(pc::produce, "Producer");

        Thread consumer = new Thread(pc::consume, "Consumer");

        producer.start();
        consumer.start();


        // ============================================================
        // 30. DETECT CYCLE IN LINKED LIST
        // ============================================================

        Node head1 = createCyclicList();

        System.out.println("\n30. Detect Cycle:");

        System.out.println("Brute Force: " + hasCycleBrute(head1));

        System.out.println("Optimal: " + hasCycleOptimal(head1));
    }


// ================================================================
// 1. FIRST NON-REPEATING CHARACTER
// ================================================================

// Brute Force
// Time: O(n²)
// Space: O(1)

    static Character firstNonRepeatingBrute(String str) {

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                return str.charAt(i);
            }
        }

        return null;
    }


// Optimal
// Time: O(n)
// Space: O(n)

    static Character firstNonRepeatingOptimal(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }


// Streams
// Time: O(n)
// Space: O(n)

    static Character firstNonRepeatingStream(String str) {

        return str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
    }


// ================================================================
// 2. GROUP ANAGRAMS
// ================================================================

// Brute Force
// Time: O(n² * k)
// Space: O(n)

    static List<List<String>> groupAnagramsBrute(String[] strings) {

        List<List<String>> result = new ArrayList<>();

        boolean[] visited = new boolean[strings.length];

        for (int i = 0; i < strings.length; i++) {

            if (visited[i]) {
                continue;
            }

            List<String> group = new ArrayList<>();

            group.add(strings[i]);
            visited[i] = true;

            for (int j = i + 1; j < strings.length; j++) {

                if (!visited[j] && isAnagram(strings[i], strings[j])) {

                    group.add(strings[j]);
                    visited[j] = true;
                }
            }

            result.add(group);
        }

        return result;
    }


    static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            count[c - 'a']--;
        }

        for (int value : count) {

            if (value != 0) {
                return false;
            }
        }

        return true;
    }


// Optimal
// Time: O(n * k log k)
// Space: O(n * k)

    static List<List<String>> groupAnagramsOptimal(String[] strings) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strings) {

            char[] chars = s.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }


// Streams

    static List<List<String>> groupAnagramsStream(String[] strings) {

        return Arrays.stream(strings).collect(Collectors.groupingBy(SaturdayProblems::getSortedKey)).values().stream().collect(Collectors.toList());
    }


    static String getSortedKey(String s) {

        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        return new String(chars);
    }


// ================================================================
// 3. SEPARATE EVEN AND ODD
// ================================================================

// Normal Loop
// Time: O(n)
// Space: O(n)

    static void separateEvenOdd(int[] arr) {

        List<Integer> even = new ArrayList<>();

        List<Integer> odd = new ArrayList<>();

        for (int n : arr) {

            if (n % 2 == 0) {
                even.add(n);
            } else {
                odd.add(n);
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }


// Streams
// partitioningBy()

    static void separateEvenOddStream(int[] arr) {

        Map<Boolean, List<Integer>> result = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even: " + result.get(true));

        System.out.println("Odd: " + result.get(false));
    }


// ================================================================
// 4. SECOND HIGHEST NUMBER
// ================================================================

// Brute Force
// Time: O(n log n)
// Space: O(n)

    static Integer secondHighestBrute(int[] arr) {

        int[] copy = Arrays.copyOf(arr, arr.length);

        Arrays.sort(copy);

        int highest = copy[copy.length - 1];

        for (int i = copy.length - 2; i >= 0; i--) {

            if (copy[i] != highest) {
                return copy[i];
            }
        }

        return null;
    }


// Optimal
// Time: O(n)
// Space: O(1)

    static Integer secondHighestOptimal(int[] arr) {

        Integer highest = null;
        Integer secondHighest = null;

        for (int n : arr) {

            if (highest == null || n > highest) {

                secondHighest = highest;
                highest = n;

            } else if (n != highest && (secondHighest == null || n > secondHighest)) {

                secondHighest = n;
            }
        }

        return secondHighest;
    }


// Streams
// Time: O(n log n)

    static Integer secondHighestStream(int[] arr) {

        return Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
    }


// ================================================================
// 5. THREAD-SAFE SINGLETON
// ================================================================

    static class Singleton {

        private static volatile Singleton instance;

        private Singleton() {
        }

        static Singleton getInstance() {

            if (instance == null) {

                synchronized (Singleton.class) {

                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }

            return instance;
        }

        // Prevent cloning
        @Override
        protected Object clone() throws CloneNotSupportedException {

            throw new CloneNotSupportedException();
        }

        // Prevent creating another object
        // during deserialization
        private Object readResolve() {
            return instance;
        }
    }


// ================================================================
// 6. FIND DUPLICATE ELEMENTS
// ================================================================

// Brute Force
// Time: O(n²)

    static List<Integer> duplicatesBrute(int[] arr) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyAdded = false;

            for (int k = 0; k < i; k++) {

                if (arr[k] == arr[i]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (alreadyAdded) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    result.add(arr[i]);
                    break;
                }
            }
        }

        return result;
    }


// Optimal
// Time: O(n)
// Space: O(n)

    static List<Integer> duplicatesOptimal(int[] arr) {

        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates = new LinkedHashSet<>();

        for (int n : arr) {

            if (!seen.add(n)) {
                duplicates.add(n);
            }
        }

        return new ArrayList<>(duplicates);
    }


// Streams

    static List<Integer> duplicatesStream(int[] arr) {

        Set<Integer> seen = new HashSet<>();

        return Arrays.stream(arr).boxed().filter(n -> !seen.add(n)).distinct().collect(Collectors.toList());
    }


// ================================================================
// 7. LONGEST SUBSTRING WITHOUT REPEATING CHARACTERS
// ================================================================

// Brute Force
// Time: O(n²)
// Space: O(n)

    static int longestSubstringBrute(String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            Set<Character> set = new HashSet<>();

            for (int j = i; j < s.length(); j++) {

                if (!set.add(s.charAt(j))) {

                    break;
                }

                max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }


// Optimal - Sliding Window
// Time: O(n)
// Space: O(n)

    static int longestSubstringOptimal(String s) {

        Map<Character, Integer> lastIndex = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            if (lastIndex.containsKey(c)) {

                left = Math.max(left, lastIndex.get(c) + 1);
            }

            lastIndex.put(c, right);

            max = Math.max(max, right - left + 1);
        }

        return max;
    }


// ================================================================
// 8. CHARACTER FREQUENCY
// ================================================================

// Brute Force
// Time: O(n²)

    static Map<Character, Integer> characterFrequencyBrute(String str) {

        Map<Character, Integer> result = new LinkedHashMap<>();

        List<Character> processed = new ArrayList<>();

        for (char c : str.toCharArray()) {

            if (processed.contains(c)) {
                continue;
            }

            int count = 0;

            for (char x : str.toCharArray()) {

                if (c == x) {
                    count++;
                }
            }

            result.put(c, count);

            processed.add(c);
        }

        return result;
    }


// Optimal
// Time: O(n)
// Space: O(n)

    static Map<Character, Integer> characterFrequencyOptimal(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }


// Streams

    static Map<Character, Long> characterFrequencyStream(String str) {

        return str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    }


// Word Frequency - Streams

    static Map<String, Long> wordFrequency(String str) {

        return Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    }


// ================================================================
// 9. MAXIMUM SUBARRAY SUM - KADANE
// ================================================================

// Brute Force
// Time: O(n²)
// Space: O(1)

    static int maxSubArrayBrute(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];

                max = Math.max(max, sum);
            }
        }

        return max;
    }


// Optimal - Kadane
// Time: O(n)
// Space: O(1)

    static int maxSubArrayOptimal(int[] arr) {

        int current = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            current = Math.max(arr[i], current + arr[i]);

            max = Math.max(max, current);
        }

        return max;
    }


// ================================================================
// 10. REVERSE WORDS
// ================================================================

// Reverse each word
// Time: O(n)
// Space: O(n)

    static String reverseEachWord(String sentence) {

        String[] words = sentence.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            StringBuilder reversed = new StringBuilder(word).reverse();

            result.append(reversed).append(" ");
        }

        return result.toString().trim();
    }


// Reverse each word - Streams

    static String reverseEachWordStream(String sentence) {

        return Arrays.stream(sentence.split("\\s+")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
    }


// Reverse order of words
// Example:
// Hello world Java
// Java world Hello

    static String reverseWordOrder(String sentence) {

        String[] words = sentence.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            result.append(words[i]);

            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }


// Reverse order - Streams

    static String reverseWordOrderStream(String sentence) {

        String[] words = sentence.trim().split("\\s+");

        return IntStream.range(0, words.length).mapToObj(i -> words[words.length - 1 - i]).collect(Collectors.joining(" "));
    }

    static void separateEvenOddStreamThreads() {
        EvenOddPrinter printer = new EvenOddPrinter(8);

        Thread oddThread = new Thread(() -> {
            try {
                printer.printOdd();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Odd Thread");

        Thread evenThread = new Thread(() -> {
            try {
                printer.printEven();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Even Thread");

        oddThread.start();
        evenThread.start();
    }

    static class EvenOddPrinter {

        private int number = 1;
        private final int limit;

        EvenOddPrinter(int limit) {
            this.limit = limit;
        }

        public synchronized void printOdd() throws InterruptedException {

            while (number <= limit) {

                // If number is even, odd thread waits
                while (number % 2 == 0 && number <= limit) {
                    wait();
                }

                if (number <= limit) {
                    System.out.println(Thread.currentThread().getName() + " -> " + number);

                    number++;

                    // Wake up even thread
                    notifyAll();
                }
            }
        }

        public synchronized void printEven() throws InterruptedException {

            while (number <= limit) {

                // If number is odd, even thread waits
                while (number % 2 != 0 && number <= limit) {
                    wait();
                }

                if (number <= limit) {
                    System.out.println(Thread.currentThread().getName() + " -> " + number);

                    number++;

                    // Wake up odd thread
                    notifyAll();
                }
            }
        }

    }


// =================================================================
// 11. EMPLOYEE GROUPING AND AGGREGATION
// =================================================================

    static void groupEmployeesByDepartment(List<Employee> employees) {

        Map<String, List<Employee>> result = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(result);
    }


// Average salary per department

    static Map<String, Double> averageSalaryByDepartment(List<Employee> employees) {

        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
    }


// Department having highest average salary

    static String highestAverageSalaryDepartment(List<Employee> employees) {

        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }


// =================================================================
// 12. MOVE ALL ZEROS TO END
// =================================================================

// Brute Force
//
// Create a new array and first copy non-zero elements.
//
// Time  : O(n)
// Space : O(n)

    static int[] moveZerosBrute(int[] arr) {

        int[] result = new int[arr.length];

        int index = 0;

        for (int n : arr) {

            if (n != 0) {
                result[index++] = n;
            }
        }

        return result;
    }


// Optimal
//
// Two pointer approach
//
// Time  : O(n)
// Space : O(1)

    static void moveZerosOptimal(int[] arr) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];

                arr[i] = arr[index];

                arr[index] = temp;

                index++;
            }
        }
    }


// =================================================================
// 13. REVERSE LETTERS ONLY
// =================================================================

// Example:
//
// a1b2c3d4e5f
//
// Output:
//
// f1e2d3c4b5a

// Brute Force
//
// Extract letters
// Reverse them
// Put them back

    static String reverseLettersBrute(String str) {

        List<Character> letters = new ArrayList<>();

        for (char c : str.toCharArray()) {

            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        Collections.reverse(letters);

        StringBuilder result = new StringBuilder();

        int index = 0;

        for (char c : str.toCharArray()) {

            if (Character.isLetter(c)) {

                result.append(letters.get(index++));

            } else {

                result.append(c);
            }
        }

        return result.toString();
    }


// Optimal
//
// Two pointers
//
// Time  : O(n)
// Space : O(n) because StringBuilder is required

    static String reverseLettersOptimal(String str) {

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (!Character.isLetter(arr[left])) {

                left++;
            } else if (!Character.isLetter(arr[right])) {

                right--;
            } else {

                char temp = arr[left];

                arr[left] = arr[right];

                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }


// =================================================================
// 14. IMMUTABLE CLASS
// =================================================================

    static final class ImmutableEmployee {

        private final int id;

        private final String name;

        private final Address address;


        public ImmutableEmployee(int id, String name, Address address) {

            this.id = id;
            this.name = name;

            // Defensive copy
            this.address = new Address(address.getCity(), address.getState());
        }


        public int getId() {
            return id;
        }


        public String getName() {
            return name;
        }


        public Address getAddress() {

            // Defensive copy
            return new Address(address.getCity(), address.getState());
        }


        @Override
        public String toString() {

            return "ImmutableEmployee{" + "id=" + id + ", name='" + name + '\'' + ", address=" + address + '}';
        }
    }


    static class Address {

        private String city;

        private String state;


        public Address(String city, String state) {

            this.city = city;
            this.state = state;
        }


        public String getCity() {
            return city;
        }


        public String getState() {
            return state;
        }


        public void setCity(String city) {
            this.city = city;
        }


        public void setState(String state) {
            this.state = state;
        }


        @Override
        public String toString() {

            return city + ", " + state;
        }
    }


// =================================================================
// 15. MAXIMUM PRODUCT SUBARRAY
// =================================================================

// Brute Force
//
// Time: O(n²)
// Space: O(1)

    static int maxProductBrute(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int product = 1;

            for (int j = i; j < arr.length; j++) {

                product *= arr[j];

                max = Math.max(max, product);
            }
        }

        return max;
    }


// Optimal
//
// Keep both maximum and minimum.
//
// Why?
//
// Negative * negative = positive
//
// Time: O(n)
// Space: O(1)

    static int maxProductOptimal(int[] arr) {

        int maxProduct = arr[0];

        int currentMax = arr[0];

        int currentMin = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int num = arr[i];

            // Important:
            // Save old maximum before changing it

            int oldMax = currentMax;

            currentMax = Math.max(num, Math.max(oldMax * num, currentMin * num));

            currentMin = Math.min(num, Math.min(oldMax * num, currentMin * num));

            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }


// =================================================================
// 16. PRODUCT OF ARRAY EXCEPT SELF
// =================================================================

// Brute Force
//
// Time: O(n²)
// Space: O(n) for output

    static int[] productExceptBrute(int[] arr) {

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int product = 1;

            for (int j = 0; j < arr.length; j++) {

                if (i != j) {
                    product *= arr[j];
                }
            }

            result[i] = product;
        }

        return result;
    }


// Optimal
//
// Prefix + Suffix
//
// Time: O(n)
// Space: O(1) excluding output

    static int[] productExceptOptimal(int[] arr) {

        int n = arr.length;

        int[] result = new int[n];

        // Prefix product

        result[0] = 1;

        for (int i = 1; i < n; i++) {

            result[i] = result[i - 1] * arr[i - 1];
        }


        // Suffix product

        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {

            result[i] *= suffix;

            suffix *= arr[i];
        }

        return result;
    }


// =================================================================
// 17. TWO SUM
// =================================================================

// Brute Force
//
// Time: O(n²)
// Space: O(1)

    static int[] twoSumBrute(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }


// Optimal
//
// HashMap
//
// Time: O(n)
// Space: O(n)

    static int[] twoSumOptimal(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {

                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }


// Streams
//
// Streams are not naturally suited for Two Sum
// because we need previous elements/state.
//
// This implementation uses IntStream + a map.

    static int[] twoSumStream(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        return java.util.stream.IntStream.range(0, arr.length).filter(i -> {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {

                return true;
            }

            map.put(arr[i], i);

            return false;

        }).mapToObj(i -> new int[]{map.get(target - arr[i]), i}).findFirst().orElse(new int[]{-1, -1});
    }


// =================================================================
// 18. IMPLEMENT STACK USING QUEUE
// =================================================================

    static class MyStack {

        private Queue<Integer> queue = new LinkedList<>();


        // Push
        //
        // Add element and rotate previous
        // elements behind it.

        public void push(int x) {

            queue.offer(x);

            int size = queue.size();

            for (int i = 1; i < size; i++) {

                queue.offer(queue.poll());
            }
        }


        public int pop() {

            if (queue.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }

            return queue.poll();
        }


        public int top() {

            if (queue.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }

            return queue.peek();
        }


        public boolean empty() {

            return queue.isEmpty();
        }
    }


// =================================================================
// 19. REVERSE SINGLY LINKED LIST
// =================================================================

    static class Node {

        int data;

        Node next;


        Node(int data) {
            this.data = data;
        }
    }


    static Node createLinkedList() {

        Node first = new Node(1);

        Node second = new Node(2);

        Node third = new Node(3);

        Node fourth = new Node(4);

        first.next = second;
        second.next = third;
        third.next = fourth;

        return first;
    }


    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        System.out.println("null");
    }


// Iterative
//
// Time: O(n)
// Space: O(1)

    static Node reverseLinkedListIterative(Node head) {

        Node previous = null;

        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = previous;

            previous = current;

            current = next;
        }

        return previous;
    }


// Recursive
//
// Time: O(n)
// Space: O(n) because of recursion stack

    static Node reverseLinkedListRecursive(Node head) {

        // Base case

        if (head == null || head.next == null) {

            return head;
        }


        Node newHead = reverseLinkedListRecursive(head.next);


        head.next.next = head;

        head.next = null;

        return newHead;
    }


// =================================================================
// 20. VALID PARENTHESES
// =================================================================

// Brute Force
//
// Repeatedly remove valid pairs.
//
// Example:
//
// {[()]}
//
// becomes
//
// {[]}
//
// becomes
//
// {}
//
// becomes empty.

    static boolean validParenthesesBrute(String s) {

        String previous;

        do {

            previous = s;

            s = s.replace("()", "");

            s = s.replace("{}", "");

            s = s.replace("[]", "");

        } while (!s.equals(previous));

        return s.isEmpty();
    }


// Optimal
//
// Stack
//
// Time: O(n)
// Space: O(n)

    static boolean validParenthesesOptimal(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // Opening brackets

            if (c == '(' || c == '{' || c == '[') {

                stack.push(c);

            }

            // Closing brackets

            else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (c == ')' && top != '(') {

                    return false;
                }

                if (c == '}' && top != '{') {

                    return false;
                }

                if (c == ']' && top != '[') {

                    return false;
                }
            }
        }

        return stack.isEmpty();
    }


// =================================================================
// EMPLOYEE CLASS
// =================================================================

    static class Employee {

        private int id;

        private String name;

        private String department;

        private double salary;


        public Employee(int id, String name, String department, double salary) {

            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }


        public int getId() {
            return id;
        }


        public String getName() {
            return name;
        }


        public String getDepartment() {
            return department;
        }


        public double getSalary() {
            return salary;
        }


        @Override
        public String toString() {

            return name + "(" + department + ", " + salary + ")";
        }
    }


    static boolean isRotationBrute(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {

            String rotated = a.substring(i) + a.substring(0, i);

            if (rotated.equals(b)) {
                return true;
            }
        }

        return false;
    }


    static boolean isRotationOptimal(String a, String b) {

        return a.length() == b.length() && (a + a).contains(b);
    }


    static int findMissingBrute(int[] arr) {

        int n = arr.length + 1;

        for (int number = 1; number <= n; number++) {

            boolean found = false;

            for (int value : arr) {

                if (value == number) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return number;
            }
        }

        return -1;
    }


    // ---------------------------------------------------------------
    // Optimal - Sum Formula
    // ---------------------------------------------------------------

    /*
        Sum of 1 to n:

        n * (n + 1) / 2

        Missing:

        expectedSum - actualSum
    */

    static int findMissingOptimal(int[] arr) {

        int n = arr.length + 1;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int value : arr) {
            actualSum += value;
        }

        return expectedSum - actualSum;
    }


    // ---------------------------------------------------------------
    // Streams
    // ---------------------------------------------------------------

    static int findMissingStream(int[] arr) {

        int n = arr.length + 1;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = Arrays.stream(arr).sum();

        return expectedSum - actualSum;
    }


    // =================================================================
    // 23. ROTATE ARRAY BY K POSITIONS
    // =================================================================

    /*
        Input:

        [1,2,3,4,5,6,7]

        k = 3

        Output:

        [5,6,7,1,2,3,4]
    */


    // ---------------------------------------------------------------
    // Brute Force
    // ---------------------------------------------------------------

    /*
        Rotate one position at a time.

        k times:

        [1,2,3,4,5]
             ↓
        [5,1,2,3,4]

        Time : O(n * k)
        Space: O(1)
    */

    static int[] rotateBrute(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        for (int i = 0; i < k; i++) {

            int last = arr[n - 1];

            for (int j = n - 1; j > 0; j--) {

                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }

        return arr;
    }


    // ---------------------------------------------------------------
    // Optimal - Reverse
    // ---------------------------------------------------------------

    /*
        Example:

        [1,2,3,4,5,6,7]

        Reverse entire array:

        [7,6,5,4,3,2,1]

        Reverse first k:

        [5,6,7,4,3,2,1]

        Reverse remaining:

        [5,6,7,1,2,3,4]
    */

    static void rotateOptimal(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        reverse(arr, 0, n - 1);

        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);
    }


    static void reverse(int[] arr, int left, int right) {

        while (left < right) {

            int temp = arr[left];

            arr[left] = arr[right];

            arr[right] = temp;

            left++;
            right--;
        }
    }


    // =================================================================
    // 24. MINIMUM SIZE SUBARRAY SUM
    // =================================================================

    /*
        Input:

        [2,3,1,2,4,3]

        target = 7

        Possible:

        [2,3,1,2] = 8  -> length 4

        [3,1,2,4] = 10 -> length 4

        [4,3] = 7 -> length 2

        Answer = 2
    */


    // ---------------------------------------------------------------
    // Brute Force
    // ---------------------------------------------------------------

    static int minSubArrayBrute(int[] arr, int target) {

        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];

                if (sum >= target) {

                    minLength = Math.min(minLength, j - i + 1);

                    break;
                }
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }


    // ---------------------------------------------------------------
    // Optimal - Sliding Window
    // ---------------------------------------------------------------

    static int minSubArrayOptimal(int[] arr, int target) {

        int left = 0;

        int sum = 0;

        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            /*
                Once sum >= target,
                try removing elements
                from the left.
            */

            while (sum >= target) {

                minLength = Math.min(minLength, right - left + 1);

                sum -= arr[left];

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }


    // =================================================================
    // 25. SORT 0, 1, 2
    // =================================================================

    // ---------------------------------------------------------------
    // Brute Force
    // ---------------------------------------------------------------

    /*
        Count how many 0s, 1s and 2s.

        Time  : O(n)
        Space : O(1)
    */

    static int[] sort012Brute(int[] arr) {

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int value : arr) {

            if (value == 0) {
                zero++;
            } else if (value == 1) {
                one++;
            } else {
                two++;
            }
        }

        int index = 0;

        while (zero-- > 0) {
            arr[index++] = 0;
        }

        while (one-- > 0) {
            arr[index++] = 1;
        }

        while (two-- > 0) {
            arr[index++] = 2;
        }

        return arr;
    }


    // ---------------------------------------------------------------
    // Optimal - Dutch National Flag
    // ---------------------------------------------------------------

    /*
        Three pointers:

        low
        mid
        high

        0 -> move to low
        1 -> leave in middle
        2 -> move to high
    */

    static void sort012Optimal(int[] arr) {

        int low = 0;

        int mid = 0;

        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {

                swap(arr, low, mid);

                low++;
                mid++;
            } else if (arr[mid] == 1) {

                mid++;
            } else {

                swap(arr, mid, high);

                high--;
            }
        }
    }


    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];

        arr[i] = arr[j];

        arr[j] = temp;
    }


    // =================================================================
    // 26. NEXT GREATER ELEMENT
    // =================================================================

    /*
        Input:

        [4,5,2,10,8]

        Output:

        [5,10,10,-1,-1]
    */


    // ---------------------------------------------------------------
    // Brute Force
    // ---------------------------------------------------------------

    static int[] nextGreaterBrute(int[] arr) {

        int[] result = new int[arr.length];

        Arrays.fill(result, -1);

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {

                    result[i] = arr[j];

                    break;
                }
            }
        }

        return result;
    }


    // ---------------------------------------------------------------
    // Optimal - Monotonic Stack
    // ---------------------------------------------------------------

    /*
        Traverse from right to left.

        Stack contains possible
        greater elements.

        Remove elements <= current
        because they can never be
        the answer for current.
    */

    static int[] nextGreaterOptimal(int[] arr) {

        int[] result = new int[arr.length];

        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {

                stack.pop();
            }

            if (!stack.isEmpty()) {

                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return result;
    }


    // =================================================================
    // 27. MERGE TWO SORTED ARRAYS
    // =================================================================

    /*
        A = [1,3,5,7]
        B = [2,4,6,8]

        Result:

        [1,2,3,4,5,6,7,8]
    */


    // ---------------------------------------------------------------
    // Using Extra Space
    // ---------------------------------------------------------------

    static int[] mergeArrays(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] <= b[j]) {

                result[k++] = a[i++];

            } else {

                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }


    // ---------------------------------------------------------------
    // Without Extra Space
    // ---------------------------------------------------------------

    /*
        Compare the largest element
        of A with the smallest element
        of B.

        If A[i] > B[j],
        swap them.

        Then sort both arrays.

        Time: O((n+m)log(n+m))
    */

    static void mergeWithoutExtraSpace(int[] a, int[] b) {

        int i = a.length - 1;

        int j = 0;

        while (i >= 0 && j < b.length) {

            if (a[i] > b[j]) {

                int temp = a[i];

                a[i] = b[j];

                b[j] = temp;

                i--;
                j++;

            } else {

                break;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);
    }


    // =================================================================
    // 28. TRANSACTION AGGREGATION
    // =================================================================

    /*
        Requirements:

        1. Ignore null transactions
        2. Only SUCCESS transactions
        3. Group by account
        4. Calculate credit/debit totals
        5. Maintain insertion order
    */

    static Map<String, AccountSummary> transactionSummary(List<Transaction> transactions) {

        return transactions.stream()

                // Remove null transactions
                .filter(Objects::nonNull)

                // Only successful transactions
                .filter(t -> "SUCCESS".equals(t.getStatus()))

                // LinkedHashMap preserves order
                .collect(Collectors.groupingBy(Transaction::getAccount, LinkedHashMap::new, Collectors.collectingAndThen(Collectors.toList(), list -> {

                    double credit = list.stream().filter(t -> "CREDIT".equals(t.getType())).mapToDouble(Transaction::getAmount).sum();

                    double debit = list.stream().filter(t -> "DEBIT".equals(t.getType())).mapToDouble(Transaction::getAmount).sum();

                    return new AccountSummary(credit, debit);
                })));
    }


    // =================================================================
    // 29. PRODUCER CONSUMER
    // =================================================================

    /*
        Shared Buffer

        Producer:
            produces data
            ↓
            buffer

        Consumer:
            consumes data
            ↓
            buffer

        If buffer is full:
            Producer waits.

        If buffer is empty:
            Consumer waits.
    */

    static class ProducerConsumer {

        private final Queue<Integer> queue = new LinkedList<>();

        private final int CAPACITY = 5;


        // ------------------------------------------------------------
        // Producer
        // ------------------------------------------------------------

        public void produce() {

            for (int i = 1; i <= 10; i++) {

                synchronized (queue) {

                    while (queue.size() == CAPACITY) {

                        try {

                            queue.wait();

                        } catch (InterruptedException e) {

                            Thread.currentThread().interrupt();

                            return;
                        }
                    }

                    queue.offer(i);

                    System.out.println("Produced: " + i);

                    queue.notifyAll();
                }
            }
        }


        // ------------------------------------------------------------
        // Consumer
        // ------------------------------------------------------------

        public void consume() {

            for (int i = 1; i <= 10; i++) {

                synchronized (queue) {

                    while (queue.isEmpty()) {

                        try {

                            queue.wait();

                        } catch (InterruptedException e) {

                            Thread.currentThread().interrupt();

                            return;
                        }
                    }

                    int value = queue.poll();

                    System.out.println("Consumed: " + value);

                    queue.notifyAll();
                }
            }
        }
    }


    // =================================================================
    // 30. DETECT CYCLE IN LINKED LIST
    // =================================================================


    static Node createCyclicList() {

        Node first = new Node(1);

        Node second = new Node(2);

        Node third = new Node(3);

        Node fourth = new Node(4);

        first.next = second;

        second.next = third;

        third.next = fourth;

        // Create cycle
        fourth.next = second;

        return first;
    }


    // ---------------------------------------------------------------
    // Brute Force
    // ---------------------------------------------------------------

    /*
        Store every visited node in a Set.

        If we see the same node again,
        there is a cycle.

        Time  : O(n)
        Space : O(n)
    */

    static boolean hasCycleBrute(Node head) {

        Set<Node> visited = new HashSet<>();

        Node current = head;

        while (current != null) {

            if (visited.contains(current)) {

                return true;
            }

            visited.add(current);

            current = current.next;
        }

        return false;
    }


    // ---------------------------------------------------------------
    // Optimal - Floyd's Cycle Detection
    // ---------------------------------------------------------------

    /*
        Slow moves one step.

        Fast moves two steps.

        If there is a cycle:

             ↓
        1 -> 2 -> 3 -> 4
             ↑         |
             |---------|

        Eventually slow and fast
        will meet.
    */

    static boolean hasCycleOptimal(Node head) {

        Node slow = head;

        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;

            if (slow == fast) {

                return true;
            }
        }

        return false;
    }


    // =================================================================
    // TRANSACTION CLASS
    // =================================================================

    static class Transaction {

        private String account;

        private String type;

        private String status;

        private double amount;


        public Transaction(String account, String type, String status, double amount) {

            this.account = account;
            this.type = type;
            this.status = status;
            this.amount = amount;
        }


        public String getAccount() {
            return account;
        }


        public String getType() {
            return type;
        }


        public String getStatus() {
            return status;
        }


        public double getAmount() {
            return amount;
        }
    }


    // =================================================================
    // ACCOUNT SUMMARY
    // =================================================================

    static class AccountSummary {

        private double totalCredit;

        private double totalDebit;


        public AccountSummary(double totalCredit, double totalDebit) {

            this.totalCredit = totalCredit;

            this.totalDebit = totalDebit;
        }


        @Override
        public String toString() {
            return "AccountSummary{" + "totalCredit=" + totalCredit + ", totalDebit=" + totalDebit + '}';
        }
    }
}