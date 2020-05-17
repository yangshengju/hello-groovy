package com.hwork.groovy.closure

def closure1 = {println "Hello groovy!"}
//closure1.call()
closure1()

//有参数的闭包
def closure2 = {String name,int age,char sex -> println "Hello ${name}-${sex}-${age}!"}
closure2("shengju",38,'m'.charAt(0))
closure2.call("wangjing",37,'f'.charAt(0))

def closeuredefaultarg = {println "default arg value :${it}"}
closeuredefaultarg("default arg")

//闭包返回值
def closurereturn = {String name-> return "${name}"}
def result = closurereturn("jiaying")
println(result)
