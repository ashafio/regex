# Java Regex

A focused collection of Java programs exploring **Regular Expressions** using the `java.util.regex` package — covering pattern syntax, matching strategies, and practical validation use cases.

---

## Overview

This repository demonstrates how to work with regular expressions in Java through hands-on examples. It covers the core `java.util.regex` API (`Pattern`, `Matcher`, `matches`, `find`, `replaceAll`) and applies regex to real-world input validation and text processing scenarios.

No external libraries — standard Java only.

---

## Topics Covered

| Area | What it demonstrates |
|---|---|
| **Pattern compilation** | `Pattern.compile()` with flags (`CASE_INSENSITIVE`, `MULTILINE`, etc.) |
| **Matching modes** | `matches()` vs `find()` vs `lookingAt()` — and when to use each |
| **Character classes** | `[a-z]`, `[^0-9]`, `\d`, `\w`, `\s` and their negations |
| **Quantifiers** | `*`, `+`, `?`, `{n,m}` — greedy vs reluctant vs possessive |
| **Groups & capturing** | `(...)`, named groups `(?<name>...)`, back-references `\1` |
| **Anchors** | `^`, `$`, `\b` word boundaries |
| **Lookahead / Lookbehind** | `(?=...)`, `(?!...)`, `(?<=...)`, `(?<!...)` |
| **Search & replace** | `replaceAll()`, `replaceFirst()`, `appendReplacement()` |
| **Input validation** | Email, phone number, date, URL, postcode pattern matching |
| **String splitting** | `String.split()` with regex delimiters |

---

## Project Structure

```
regex/
├── src/
│   └── com/
│       └── regex/        # All Java source files
│           ├── Main.java              # Entry point and demo runner
│           ├── PatternExamples.java   # Core pattern and matcher usage
│           ├── ValidationExamples.java # Real-world input validation
│           └── ...                    # Additional topic files
├── .idea/                # IntelliJ IDEA project config
├── regex.iml             # IntelliJ module file
└── .gitignore
```

---

## Getting Started

### Prerequisites

- JDK 8 or later
- IntelliJ IDEA (recommended) or any Java IDE

### Run in IntelliJ IDEA

1. Clone the repository:

```bash
   git clone https://github.com/ashafio/regex.git
```

2. Open the project in IntelliJ IDEA via `File → Open → regex/`.

3. Run `Main.java` directly — no build tools or dependencies needed.

### Run from the terminal

```bash
cd regex
javac -d out src/com/regex/*.java
java -cp out com.regex.Main
```

---

## Key Java Regex API Reference

```java
// Compile a pattern
Pattern p = Pattern.compile("\\d{3}-\\d{4}");

// Create a matcher against input
Matcher m = p.matcher("Call 123-4567 now");

// Find next match
while (m.find()) {
    System.out.println("Found: " + m.group() + " at index " + m.start());
}

// Full-string match
boolean valid = "hello@email.com".matches("[\\w.]+@[\\w.]+\\.[a-z]{2,}");

// Replace all matches
String result = "foo123bar".replaceAll("\\d+", "#");  // "foo#bar"

// Named capture groups
Pattern date = Pattern.compile("(?<year>\\d{4})-(?<month>\\d{2})-(?<day>\\d{2})");
Matcher dm = date.matcher("2024-06-15");
if (dm.matches()) {
    System.out.println(dm.group("year"));  // "2024"
}
```

---

## Common Validation Patterns

```java
// Email
String email = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";

// UK postcode
String postcode = "^[A-Z]{1,2}\\d[A-Z\\d]? ?\\d[A-Z]{2}$";

// Phone (international)
String phone = "^\\+?[0-9]{7,15}$";

// Date (YYYY-MM-DD)
String date = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$";

// URL
String url = "^(https?|ftp)://[^\\s/$.?#].[^\\s]*$";
```

---

## Author

**Shafi (Abid Rahman Shafi)** — GitHub: [@ashafio](https://github.com/ashafio)
