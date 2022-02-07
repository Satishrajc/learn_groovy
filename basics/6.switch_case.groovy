def num = 0

switch(num) {
    case {num>0}: // observe the curly brases
        println("Number is positive")
        break
    case 0:
        println("Number is zero")
        break
    case {num<0}:
        println("Number is negative")
        break
     default:  // Default case
        println("Numbsr is in valid") 
}