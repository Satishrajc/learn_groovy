
aList = [1,2,3,4,5,6,7,8,9,10]
aDict = ["name": "Satish", "age": 32]

println "For loop i=0; i<=10; i++)"
for(int i=0; i<=10; i++){
    println i
}

println("\niterate over a LIST")
for(item in aList){
    print(item + '-> ')
}

println "\n\nFor loop in in list"
for(i in [1,2,3,4,5]){
    print i + "--> "
}

println "\n\nfor(i in 1..10)"
for(i in 1..10){
    print i + " "
}
println "\n\n1.upto(10)"
1.upto(10){
    print "$it"  // $it will print iteration
}

println "\n\n1.step(10, 2)"
1.step(10, 2){ print "$it " }

println("\n\niterate over a RANGE 10..20")
for ( i in 10..20 ) {
    print(i+ '-> ')
}

println('\niterate over map aDict = ["name": "Satish", "age": 32]')
for(item in aDict){
    println (item)
}

println("\n\niterate over MAP, keys and values")
for(item in aDict){
    print (item.key + " ")
    println (item.value + " ")
}

println("\niterate over VALUES in a map")
for ( v in aDict.values() ) {
    println (v)
}

println("\niterate over KEYS in a map")
for ( v in aDict.keySet() ) {
    println (v)
}

println("\niterate over the characters in a string")
def text = "abc"
for (c in text) {
    println (c)
}

println "\nWhile loop"
int i=0;
while(i<=10){
    print i + " "
    i++
}