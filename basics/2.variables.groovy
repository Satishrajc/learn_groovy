package com.test.demo
// Need npt to wite "def"
def name = "Satish"
// With semicolon, "println" will prints and go to next line 
println(name + " Chogule");

// Varible in sid ethe string and without semi colon
println("${name} Chogule")

// Without paranthesis or semicolon
println "${name} Chogule"

// With only "print"
print "${name} Chogule"

var = 10
println("${var}")
println(var + 20)


// -----------------------------
println("Assign multiple variable at a time")
(a, b, c) = [ 10, 20]

println("${a}, ${b}, ${c}")


// -----------------------------

println("Define variable type")
String my_name = "Stish"
int age = 30
Double weight = 81.2

println("${name}, ${age}, ${weight}")