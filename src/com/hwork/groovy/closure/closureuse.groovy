package com.hwork.groovy.closure
//求指定数字的阶乘

BigDecimal fab(BigDecimal number) {
    BigDecimal result = 1;
    1.upto(number,{num->result*=num})
    return  result
}

println(fab2(6))

BigDecimal fab2(BigDecimal number) {
    BigDecimal result = 1
    number.downto(1) {
        num->result*=num
    }
    return result
}

int cal(int number) {
    int result = 0
    number.times {
        num->result+=num
    }
    return result
}

//println cal(101)

//字符串与闭包的结合使用
String str = "2 and 4 is 6 "
//使用each遍历字符串
str.each {
    //print(it.multiply(3))
}

//find查找符合条件的第一个
println str.find {
    String temp->temp.isLong()
}

//println str.findAll {
//    String temp->temp.isLong()
//}

//println str.collect {String s->s.toUpperCase()}
/**
 *闭包的三个重要变量
 */
/*
def closureScript = {
    println "this:${this}"//this代表闭包定义处的类的实例
    println "owner:${owner}"//owner代表闭包定义处的类的实例或者对象
    println "delegate:${delegate}"//delegate代表任何对象，默认与owner指向一致
}
*/
//closureScript.call()

//定义一个内部类
class Person {

    def innderClassClosure = {
        work()
    }

    def work() {
        println("all person can work!")
    }


}
Person person = new Person()
def outerClosure = {
    def innerClassClosureInMethod = {
        println "this    :"+this//this代表闭包定义处的类的实例
        println "owner   :"+owner//owner代表闭包定义处的类的实例或者对象
        println "delegate:"+delegate//delegate代表任何对象，默认与owner指向一致
    }
    innerClassClosureInMethod.owner=person
    innerClassClosureInMethod.delegate=person;
    innerClassClosureInMethod.call()
}

//person.innderClassClosure()
//outerClosure()

class Man {
    def work() {
        println("man can work!")
    }

    def manClosure = {
        work()
    }
}

Man man = new Man();
man.manClosure.delegate=person
man.manClosure.resolveStrategy=Closure.DELEGATE_FIRST
man.manClosure.call()