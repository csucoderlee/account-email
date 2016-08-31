#maven in action

## groupid, artifaceid version 是必须定义的, packageing是可选的(default : jar), classifier是不能直接定义的

groupid 一个组织下会有很多实际项目, 如果只定义到组织的级别, 那么实际项目这个层将会很难定义


所以比如说groupid :  org.csu.coderlee.accout   account就是项目的名字 。  artifactid: accout-email   account项目下的email模块, 以项目名字为前缀, 以便于区分其他项目的构建


## 全局的属性配置
<properties> 
    <org.springframework.version></org.springframework.version>
</properties>


## src/main/resources  src/test/resources 这两个包都应该 右键 - Mark directory as - resource root/ test resource root 这两个应该没什么区别

## throwable 找时间研究一下

## interface的实现方法中, @Override 是有问题的

## 依赖范围  scope: provided 
只在编译和测试有效, 比如说servlet-api, tomcat容器中提供了servlet-api的依赖, 所以项目依赖中只需要保证编译和测试的时候, 使用该依赖就可以了。

## 5.6 - 5.9 这四个小节中, 传递依赖 这个需要日后研究 暂时项目中并不是很复杂

## AccountEmailServiceImpl中的私有属性, 通过springframework注入, 注入的信息配置在account-email.xml中