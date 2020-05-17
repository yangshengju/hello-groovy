package com.hwork.groovy.variable

//对范围进行循环
def sum=0
for (i in 1..20) {
    sum+=i
}

println(sum)

//对list进行循环
for(i in [3,5,9,56]) {
    sum+=i;
}

println(sum)

//对map进行循环
for(data in ['zhangsan':40,'lisi':50,"wangwu":59]) {
    println(data.key+"今年"+data.value+"岁")
}
