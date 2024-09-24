<h1>Strings in Java</h1>
**1. String Overview

<h3>Definition:</h3> String is a class in Java that represents a sequence of characters.
Immutable: Strings are immutable in Java, meaning once a String object is created, it cannot be changed. Any modification results in the creation of a new String object.
<h3>
**2. Creating Strings</h3>

Literal: String str = "Hello";
Constructor: String str = new String("Hello");
Empty String: String empty = "";
**3. Common Methods

Length: str.length() - Returns the length of the string.
Concat: str.concat(" World") - Concatenates another string.
Substring: str.substring(beginIndex, endIndex) - Extracts a substring.
CharAt: str.charAt(index) - Returns the character at the specified index.
IndexOf: str.indexOf("search") - Returns the index of the first occurrence of the substring.
Replace: str.replace("old", "new") - Replaces occurrences of a substring.
ToLowerCase/ToUpperCase: str.toLowerCase() / str.toUpperCase() - Converts the string to lowercase or uppercase.
Trim: str.trim() - Removes leading and trailing whitespace.
Split: str.split("delimiter") - Splits the string into an array based on the delimiter.
**4. String Comparison

Equals: str1.equals(str2) - Checks if two strings are equal.
EqualsIgnoreCase: str1.equalsIgnoreCase(str2) - Checks equality ignoring case.
CompareTo: str1.compareTo(str2) - Compares two strings lexicographically.
<h3>
**5. String Pool</h3>

Interning: Strings created with literals are stored in a common pool (interned). Using new String("literal") creates a new object, bypassing the pool.
**6. StringBuilder and StringBuffer

Mutable Strings: Use StringBuilder or StringBuffer for mutable strings.
StringBuilder: Non-synchronized, faster.

StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
StringBuffer: Synchronized, thread-safe.

StringBuffer sbf = new StringBuffer("Hello");
sbf.append(" World");
**7. Common Use Cases

String Manipulation: Concatenation, substring extraction, and pattern matching.
String Formatting: Using String.format() or printf() for formatted output.
**8. Performance Considerations

Immutability: Immutable strings can lead to higher memory usage and performance overhead when concatenating strings in loops. Prefer StringBuilder for such use cases.
**9. Regular Expressions

Pattern Matching: Use Pattern and Matcher classes for regex operations.

Pattern pattern = Pattern.compile("regex");
Matcher matcher = pattern.matcher("input");
boolean matches = matcher.matches();

<h2>
Sample Questions
</h2>
How do you create a String in Java?

You can create a String using a string literal (e.g., String str = "Hello";) or a String constructor (e.g., String str = new String("Hello");).
What is the difference between String, StringBuilder, and StringBuffer?

String is immutable, while StringBuilder and StringBuffer are mutable. StringBuilder is not synchronized, whereas StringBuffer is synchronized.
How can you reverse a string in Java?

Using StringBuilder:

StringBuilder sb = new StringBuilder("Hello");
String reversed = sb.reverse().toString();
How does the intern() method work?

The intern() method returns a canonical representation of the string object. If the string is already in the string pool, it returns the reference from the pool; otherwise, it adds the string to the pool.
What is the significance of immutability in strings?

Immutability provides safety and thread-safety. It ensures that once a String object is created, its value cannot be changed, which avoids unintended side effects.
Feel free to expand these notes based on your interview focus and your own understanding. Good luck!


In Java,<h1> the == operator</h1> is used for comparison, but its behavior varies depending on the type of operands it is comparing. Here’s a detailed explanation of how == works with different data types:

1. Primitive Types
For primitive data types (such as int, float, char, etc.), the == operator compares the actual values directly.

Example:

int a = 5;
int b = 5;
boolean result = (a == b); // true, because 5 is equal to 5
2. Reference Types
For reference types (such as String, Object, arrays, and custom classes), the == operator compares the memory addresses (references) of the objects, not their content. This means it checks if both references point to the same object in memory.

Example:

String s1 = new String("Hello");
String s2 = new String("Hello");
boolean result = (s1 == s2); // false, because s1 and s2 refer to different objects in memory

String s3 = "Hello";
String s4 = "Hello";
boolean result2 = (s3 == s4); // true, because s3 and s4 refer to the same object in the string pool
Key Points to Note
String Literals and the String Pool:

String literals are interned and stored in a common pool. If you create two String objects using literals with the same value, they will refer to the same object.
Example:

String str1 = "Java";
String str2 = "Java";
boolean result = (str1 == str2); // true
Using new Keyword:

When you use the new keyword to create a String, a new object is created in memory, even if the content is the same as another string.
Example:

String str1 = new String("Java");
String str2 = new String("Java");
boolean result = (str1 == str2); // false
Object Comparison:

For custom objects, == checks if two references point to the same instance. To compare the contents of objects, you should override the equals() method in your class.
Example:

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name != null ? name.equals(person.name) : person.name == null;
    }
}

Person p1 = new Person("Alice");
Person p2 = new Person("Alice");
boolean result = (p1 == p2); // false, different instances
boolean result2 = p1.equals(p2); // true, same content
Null Checks:

If either reference is null, == will return false unless both references are null.
Example:
java
String s1 = null;
String s2 = null;
boolean result = (s1 == s2); // true
Summary
Primitive types: == compares actual values.
Reference types: == compares memory addresses (references).
For content-based comparison of objects (including strings), use the equals() method.
Be cautious with == when working with reference types, especially with strings and custom objects.
