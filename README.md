# Scala Type Erasure and Pattern Matching Pitfall

This example demonstrates a potential issue when combining generics, pattern matching, and type casting (`asInstanceOf`) in Scala. Type erasure at runtime can cause unexpected results if not handled carefully.

The `MyClass` uses pattern matching on type, which isn't type-safe at runtime due to Scala's type erasure.  The solution shows a safer and more robust approach using type classes and avoiding unsafe casts.