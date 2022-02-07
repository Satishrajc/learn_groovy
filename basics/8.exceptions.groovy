try{
    s+10
}
catch (ArithmeticException e){
    println("ArithmeticException")
}
catch (Exception e){
    println("CAUSE : ${e.getCause()}")
    println("Message: ${e.getMessage()}")
    //println("Track: ${e.printStackTrace()}")
}
catch ( IOException | NullPointerException e ){
    println("Multiple expection")
}
finally{
    println("I am in fianlly")
}

println("After exception")