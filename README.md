#maven in action

## groupid, artifaceid version 是必须定义的, packageing是可选的(default : jar), classifier是不能直接定义的

groupid 一个组织下会有很多实际项目, 如果只定义到组织的级别, 那么实际项目这个层将会很难定义


所以比如说groupid :  org.csu.coderlee.accout   account就是项目的名字 。  artifactid: accout-email   account项目下的email模块, 以项目名字为前缀, 以便于区分其他项目的构建



<properties> 

    <org.springframework.version></org.springframework.version>
</properties>


## src/main/resources  src/test/resources 这两个包都应该 右键 - Mark directory as - resource root/ test resource root 这两个应该没什么区别

## throwable 找时间研究一下

## interface的实现方法中, @Override 是有问题的