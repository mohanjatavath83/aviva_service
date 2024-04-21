BLOOM FILTER
-----------------------
You’ve probably used software that depends on Bloom filters. Do you know what they are?

A bloom filter is a probabilistic data structure built around a bit array and one or more hash functions.

Bloom filters provide a fast and efficient way of handling set membership queries when the set either does not fit within the memory constraints, or querying the full set would incur a performance penalty.

Bloom filters have been used in:

👉 Spell checkers
👉 Network routers
👉 Databases
👉 Web crawlers
👉 Cyber security - blacklisting, whitelisting and password / username checkers
👉 Web caches
👉 Cryptocurrency
👉 Rate limiting
👉 Recommendation systems

To implement a Bloom filter:

1. Determine the number of items that are likely to be stored and the probability of false positives you system can tolerate then use that to determine the memory requirements and number of has functions needed. There’s a formula.
2. Create a bit array and set all bits to zero.
3. Insert items by applying the hash functions and setting the corresponding bits to one.
4. Query for the presence of an item by applying the hash functions. If any of the corresponding bits are zero, the item is definitely not in the set. If all of the bits are one, the item is probably in the set.

You can learn more about them in this week’s issue of Coding Challenges.