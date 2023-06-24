package com.kotlin

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    print("Please enter object's length: ")
    val length: Float = scanner.nextFloat()
    print("Please enter object;s width: ")
    val width: Float = scanner.nextFloat()
    print("Please enter object;s height: ")
    val height: Int = scanner.nextInt()

    val box3 = Box3(length,width,height)
    val box5 = Box5(length,width,height)

    if(box3.validate()){
        println("Box3")
    }else if(box5.validate()){
        println("Box5")
    }else{
        println("您的包裹尺寸不合規定，請參考以下包裹規格：\n"+
        "Box3: 長23，寬14，高13 (cm)\n" +
        "Box5: 長39.5，寬27.5，高23 (cm)")
    }
}

class Box3(var length: Float, var width: Float, var height: Int){
    fun validate(): Boolean{
        return (length <= 23 && width <=14 && height <= 13)
    }
}

class Box5(var length: Float, var width: Float, var height: Int){
    fun validate(): Boolean{
        return (length <= 39.5 && width <=27.5 && height <= 23)
    }
}