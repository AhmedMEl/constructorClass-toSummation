class emp{
    constructor(id:Int,name:String):this(id,name,"Male"){
        println("Emp id =$id Emp Name :$name")
    }
    constructor(id:Int,name:String,gender:String){
        println("Emp id=$id Emp Name :$name  gender:$gender")
    }
}

fun main(){

    emp (1,"Ahmed")
}