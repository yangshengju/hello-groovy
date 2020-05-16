package com.hwork.groovy.variable

def name='line one' +
        'line 2' +
        'line 3'
//println name

def tripleName='''\
{
  "sub": "1234567890",
  "name": "John Doe",
  "iat": 1516239022
}'''
println tripleName

//可扩展字符串
def doubleName = "This is a common string";
println doubleName.class

def person="ysj"
def sayHello = "Hello:${person}"
println(sayHello)
println(sayHello.class)

def sum = "The sum of 2 and 3 is ${2+3}"
println(sum)
println("sum.class："+sum.class)

String echo(String message) {
    return message
}

def echoStr = echo(sum);
println("echoStr : "+echoStr)


def centeredStr= person.center(8,'w')
println(centeredStr)

def compareToStr = 'zhong'
def minusStr = 'onw'
println(person>compareToStr)
println(compareToStr[0..2])
println(compareToStr-minusStr)
println(person.reverse())
println(compareToStr.capitalize())