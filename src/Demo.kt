fun main( arg: Array<String>){
    println("Hello Kotlin World")

    var student = Person()//Kotlin class
    student.name ="Dineo"
    println("Hi, My name is : ${student.name} from a kotlin class")




    var student2 = jPerson();//Java class
    student2.name = "Dineo"
    println("Hi, My name is : ${student2.name} from a java class")


    //Operators
    var num1 : Int = 4
    var num2 : Int = 8
    var result = num1 + num2
    println("$num1  + $num2 = $result")

    //Conditions
    if(num1 > num2)
        println("$num1 is bigger than $num2")
    else
        println("$num2 is bigger than $num1")

    //Condition as expression
    var bigger : Int
    bigger = if(num1>num2)
        num1
    else
        num2
    println("The biggest $bigger")

    //String comparison

    var str1:String = "Dineo"
    var str2:String ="dineo"
    //checks for case sensitivity
    if (str1.equals(str2)){
        println("Case sensitve :")
        println("same")}
    else
        println("not same")

   //doesnt check case sensitivity
    if (str1.equals(str2,true)){
        println("Not Case sensitve :")
        println("same")}
    else
        println("not same")

    //comparison using equal operators
    if (str1 == str2){
        println("same")}
    else
        println("not same")


    //When(Replace switch statement)
    val number : Int = 1
    when(number){
        1-> println("One")
        2-> println("Two")
        3-> println("Three")
        else-> println("Input is incorrect")
    }
    //When as an expression

   var str = when(number){
        1-> "One in str"
        2-> "Two in str"
        3-> "Three in str"
        else-> "Input is incorrect"
    }
    println("When as expression. Str = $str")

}